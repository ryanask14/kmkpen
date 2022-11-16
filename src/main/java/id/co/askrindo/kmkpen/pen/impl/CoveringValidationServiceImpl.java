package id.co.askrindo.kmkpen.pen.impl;

import id.co.askrindo.kmkpen.ejamku.model.dto.Akad;
import id.co.askrindo.kmkpen.ejamku.model.dto.AkadResponse;
import id.co.askrindo.kmkpen.ejamku.model.dto.CalonDebiturResponse;
import id.co.askrindo.kmkpen.ejamku.service.AkadService;
import id.co.askrindo.kmkpen.ejamku.service.CalonDebiturService;
import id.co.askrindo.kmkpen.ejamku.service.EjamkuService;
import id.co.askrindo.kmkpen.pen.model.TPenjaminan;
import id.co.askrindo.kmkpen.pen.model.dto.*;
import id.co.askrindo.kmkpen.pen.model.master.MMappingBank;
import id.co.askrindo.kmkpen.pen.model.master.MSektorEkonomi;
import id.co.askrindo.kmkpen.pen.service.*;
import id.co.askrindo.kmkpen.utils.Constants;
import id.co.askrindo.kmkpen.utils.DateUtils;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.*;

@Service
@Log
public class CoveringValidationServiceImpl implements CoveringValidationService {

    @Autowired
    TPenjaminanService tPenjaminanService;

    @Autowired
    MappingBankService mappingBankService;

    @Autowired
    MSektorService mSektorService;

    @Autowired
    EjamkuService ejamkuService;

    @Autowired
    AkadService akadService;

    @Autowired
    CalonDebiturService calonDebiturService;

    @Autowired
    TOutstandingService tOutstandingService;

    @Autowired
    Environment env;

    @Override
    public Optional<Object> validasi(CoveringValidationRequest coveringValidationRequest) {

        Optional<TPenjaminan> tPenjaminan = tPenjaminanService.findByNoIdDebitur(coveringValidationRequest.getNoIdentitas());
        Date tanggalAkad = null;
        Date tanggalAwal = null;
        Date tanggalAkhir = null;
        Date tglStartPen = null;
        Date tglEndPen = null;
        Date now = DateUtils.getNow();
        Long idPenjaminan = null;

        Boolean cekMappingBank = cekMappingBank(coveringValidationRequest.getKodeBank(), coveringValidationRequest.getKodeUker());
        Boolean cekSektor = cekSektor(coveringValidationRequest.getKodeSektor());

        List<String> listMessage = new ArrayList<>();

        try {
            tanggalAkad = DateUtils.parse(coveringValidationRequest.getTglPK(), Constants.Parameters.DATE_FORMAT_YYYYMMDD);
            tanggalAwal = DateUtils.parse(coveringValidationRequest.getTanggalAwal(), Constants.Parameters.DATE_FORMAT_YYYYMMDD);
            tanggalAkhir = DateUtils.parse(coveringValidationRequest.getTanggalAwal(), Constants.Parameters.DATE_FORMAT_YYYYMMDD);
            tglStartPen = DateUtils.parse(Constants.Parameters.START_PEN_DATE, Constants.Parameters.DATE_FORMAT_YYYYMMDD);
            tglEndPen = DateUtils.parse(Constants.Parameters.END_PEN_DATE, Constants.Parameters.DATE_FORMAT_YYYYMMDD);
        } catch (ParseException e) {
            listMessage.add("Format tanggal tidak sesuai "+e.getMessage());
        }

        log.info("tanggalAkad = "+DateUtils.format(tanggalAkad, Constants.Parameters.DATE_FORMAT_DD_MM_YYYY));

        if (!cekMappingBank) {
            listMessage.add("Kode Uker Bank tidak ditemukan");
        } else if (tanggalAkad.before(tglStartPen)) {
            listMessage.add("Tanggal Akad sebelum "+DateUtils.format(tglStartPen, Constants.Parameters.DATE_FORMAT_DD_MM_YYYY));
        } else if (tanggalAkad.after(tglEndPen)) {
            listMessage.add("Program PEN telah berakhir pada "+DateUtils.format(tglEndPen, Constants.Parameters.DATE_FORMAT_DD_MM_YYYY));
        } else if (DateUtils.getDays(tanggalAkad, now) > 90) {
            listMessage.add("Tanggal Akad melebihi 90 hari");
        } else if (coveringValidationRequest.getPlafonKredit().compareTo(Constants.Parameters.LIMIT_CAC) > 0) {
            if (coveringValidationRequest.getModalUsaha().compareTo(Constants.Parameters.MAX_MODAL_USAHA) > 0) {
                listMessage.add("Modal Usaha Melebihi " + Constants.Parameters.MAX_MODAL_USAHA);
            } else if (coveringValidationRequest.getOmsetUsaha().compareTo(Constants.Parameters.MAX_OMSET) > 0) {
                listMessage.add("Omset Usaha Melebihi " + Constants.Parameters.MAX_OMSET);
            }
        } else if (DateUtils.getMonthsBetween(tanggalAwal, tanggalAkhir) > 36) {
            listMessage.add("Jangka Waktu Tidak Memenuhi Ketentuan Maksimum " + Constants.Parameters.MAX_JK_WAKTU + " Bulan");
        } else if (DateUtils.getMonthsBetween(tanggalAwal, tanggalAkhir) < 1) {
            listMessage.add("Jangka Waktu Tidak Memenuhi Ketentuan Minimum " + Constants.Parameters.MIN_JK_WAKTU + " Bulan");
        } else if (tanggalAkad.after(tanggalAwal)) {
            listMessage.add("Tanggal Awal Kredit Mendahului Tanggal Akad");
        } else if (coveringValidationRequest.getPlafonKredit().compareTo(Constants.Parameters.MIN_PLAFON) < 0) {
            listMessage.add("Plafon Kredit dibawah nilai minimum " + Constants.Parameters.MIN_PLAFON);
        } else if (coveringValidationRequest.getPlafonKredit().compareTo(Constants.Parameters.MAX_PLAFON) > 0) {
            listMessage.add("Plafon Kredit melebihi nilai maksimum " + Constants.Parameters.MAX_PLAFON);
        } else if (!cekSektor) {
            listMessage.add("Sektor Ekonomi dengan nomor " + coveringValidationRequest.getKodeSektor() + " tidak termasuk dalam sektor yang dijamin");
        }else if (tPenjaminan.isPresent()) {
            idPenjaminan = tPenjaminan.get().getId();

            if(tPenjaminan.get().getKodeBank().getKodeBankAcs() != coveringValidationRequest.getKodeBank()){
                if(!tPenjaminan.get().getIsCancel() || tPenjaminan.get().getIsLunasDipercepat()){
                    if(tanggalAkad.after(DateUtils.convertToDateViaInstant(tPenjaminan.get().getTglAwalPertanggungan())) && tanggalAkad.before(DateUtils.convertToDateViaInstant(tPenjaminan.get().getTglAkhirPertanggungan()))){
                        listMessage.add("Debitur dengan No Rekening "+coveringValidationRequest.getNoRekening()+" Masih memiliki Kredit Aktif di " + tPenjaminan.get().getKodeBank().getNamaBank());
                    }
                } else {
                    listMessage.add("Debitur dengan No Rekening "+coveringValidationRequest.getNoRekening()+" Masih memiliki Kredit Aktif di " + tPenjaminan.get().getKodeBank().getNamaBank());
                }
            } else {
                if(tPenjaminan.get().getStatusPenjaminanId().equals(Constants.Parameters.STATUS_NOTA_PENAWARAN) && coveringValidationRequest.getPlafonKredit().compareTo(Constants.Parameters.LIMIT_CAC) < 0){
                    listMessage.add("Covering Validation tidak valid");
                } else if(tPenjaminan.get().getStatusPenjaminanId().equals(Constants.Parameters.STATUS_TERBIT)){
                    listMessage.add("Penjaminan sudah pernah terbit");
                }
            }
        }

        if(!listMessage.isEmpty()){
            return coveringValidationResponseTolak(listMessage, coveringValidationRequest.getKodeBank(), coveringValidationRequest.getKodeUker());
        } else {
            return validasiEjamku(idPenjaminan, coveringValidationRequest);
        }
    }

    private Optional<Object> validasiEjamku(Long idPenjaminan, CoveringValidationRequest coveringValidationRequest) {

        TPenjaminan tPenjaminan = null;
        CalonDebiturResponse calonDebiturResponse = null;
        AkadResponse akadResponse = null;
        List<String> listMessage = new ArrayList<>();

        if(idPenjaminan == null){
            tPenjaminan = tPenjaminanService.mappingTPenjaminan(coveringValidationRequest);
            tPenjaminan.setStatusSikp(Constants.StatusEjamku.DRAFT);
        } else {
            tPenjaminan = tPenjaminanService.findById(idPenjaminan).get();
        }

        if(tPenjaminan.getStatusSikp().equals(Constants.StatusEjamku.DRAFT)){
            calonDebiturResponse = calonDebiturService.validasiCalon(coveringValidationRequest);
            if(calonDebiturResponse.getError()){
                tPenjaminanService.save(tPenjaminan);
                listMessage.add(calonDebiturResponse.getMessage());
                return coveringValidationResponseTolak(listMessage, coveringValidationRequest.getKodeBank(), coveringValidationRequest.getKodeUker());
            } else {
                tPenjaminan.setStatusSikp(Constants.StatusEjamku.CALON);
            }
        }

        if(tPenjaminan.getStatusSikp().equals(Constants.StatusEjamku.CALON)){
            akadResponse = akadService.validasiAkad(coveringValidationRequest);
            if(akadResponse.getError()){
                tPenjaminanService.save(tPenjaminan);
                listMessage.add(akadResponse.getMessage());
                return coveringValidationResponseTolak(listMessage, coveringValidationRequest.getKodeBank(), coveringValidationRequest.getKodeUker());
            } else {
                tPenjaminan.setStatusSikp(Constants.StatusEjamku.AKAD);
                tPenjaminan.setStatusPenjaminanId(Constants.Parameters.STATUS_TEMPORARY);
            }
        }

        tPenjaminanService.save(tPenjaminan);
        return Optional.of(coveringValidationResponse(tPenjaminan));

    }

    @Override
    public Optional<Object> updatePen(CoveringValidationRequest coveringValidationRequest, String no_rekening_lama) {

        Optional<TPenjaminan> tPenjaminan = tPenjaminanService.findByNoAplikasi(coveringValidationRequest.getNomorAplikasi());

        if(tPenjaminan.isPresent()){
            if(tPenjaminan.get().getNoRekeningPinjaman().equals(coveringValidationRequest.getNoRekening())){
                return Optional.ofNullable(coveringValidationResponse(tPenjaminan.get()));
            } else {
                log.info("tpenjaminan"+tPenjaminan.get().getNoRekeningPinjaman());

                Akad akad = akadService.mappingAkad(coveringValidationRequest, tPenjaminan.get());
                AkadResponse akadResponse = akadService.updateAkad(coveringValidationRequest.getKodeBank(), no_rekening_lama, akad);
                if(akadResponse.getError()){
                    List<String> listMessage = new ArrayList<>();
                    listMessage.add(akadResponse.getMessage());
                    return coveringValidationResponseTolak(listMessage, coveringValidationRequest.getKodeBank(), coveringValidationRequest.getKodeUker());
                } else {
                    log.info(coveringValidationRequest.getNoRekening());
                    tPenjaminan.get().setNoRekeningPinjaman(coveringValidationRequest.getNoRekening());
                    tPenjaminanService.save(tPenjaminan.get());

                    return Optional.ofNullable(coveringValidationResponse(tPenjaminan.get()));
                }
            }
        } else {
            List<String> listMessage = new ArrayList<>();
            listMessage.add("Data tidak ditemukan");
            return coveringValidationResponseTolak(listMessage,coveringValidationRequest.getKodeBank(),coveringValidationRequest.getKodeUker());
        }
    }

    @Override
    public Optional<Object> inquiryPenjaminan(InquiryRequest inquiryRequest) {
        Optional<TPenjaminan> tPenjaminanOpt = tPenjaminanService.inquiryByNorekNikNoAplikasi(inquiryRequest.getNoRekening(), inquiryRequest.getNoIdentitas(), inquiryRequest.getNomorAplikasi());

        if(tPenjaminanOpt.isPresent()){
            if(tPenjaminanOpt.get().getIsLunasDipercepat().equals(false) &&
                    tPenjaminanOpt.get().getIsCancel().equals(false) && (
                            tPenjaminanOpt.get().getStatusPenjaminanId().equals(Constants.Parameters.STATUS_TEMPORARY) ||
                                    tPenjaminanOpt.get().getStatusPenjaminanId().equals(Constants.Parameters.STATUS_TERBIT)
                    )){
                log.info(tPenjaminanOpt.get().getId().toString());
                return Optional.ofNullable(coveringValidationResponse(tPenjaminanOpt.get()));
            }
        }

        List<String> message = new ArrayList<>();
        message.add("Data Not Found");
        return coveringValidationResponseTolak(message, null, null);
    }

    private Boolean cekMappingBank(String kodeBank, String kodeUker) {

        Optional<MMappingBank> mMappingBank = mappingBankService.findByKodeBankAndKodeCabangBank(kodeBank, kodeUker);

        if (mMappingBank.isPresent()) {
            return true;
        } else {
            return false;
        }
    }

    private Boolean cekSektor(String kodeSektor) {

        Optional<MSektorEkonomi> mSektorEkonomi = mSektorService.findByKodeSektor(kodeSektor);

        if(mSektorEkonomi.isPresent()){
            return true;
        } else {
            return false;
        }
    }

    private Optional<Object> coveringValidationResponseTolak(List<String> listMessage,
                                                             String kodeBank,
                                                             String kodeUker) {

        //initialize response tolak
        String trxDateResponse = DateUtils.format(DateUtils.getNow(), "yyyyMMddHHmmss");

        //initialize error
        Boolean status = true;
        String errorCode = "204";
        String errorType = "Data Validation";
        String cabangRekanan = "";

        List<ListError> listError = new ArrayList<>();

        for (String message : listMessage) {
            listError.add(new ListError(status, errorCode, errorType, message, trxDateResponse, cabangRekanan));
        }

        Optional<CoveringValidationResponseTolak> coveringValidationResponseTolak = Optional.of(new CoveringValidationResponseTolak(status, trxDateResponse, listError));

        return Optional.of(coveringValidationResponseTolak);
    }

    private Optional<CoveringValidationResponse> coveringValidationResponse(TPenjaminan tPenjaminan) {

        CoveringValidationResponse coveringValidationResponse = new CoveringValidationResponse();
        CoveringValidationResponseData coveringValidationResponseData = new CoveringValidationResponseData();

        coveringValidationResponseData.setCabangRekanan(tPenjaminan.getKodeCabangAskrindo());
        coveringValidationResponseData.setNoRekening(tPenjaminan.getNoRekeningPinjaman());
        coveringValidationResponseData.setLinkSertifikat(env.getProperty("kmkpen.url.download.polis")+tPenjaminan.getNoSertifikat());
        coveringValidationResponseData.setNoSp3("");
        coveringValidationResponseData.setNoTransaksiBank(tPenjaminan.getTransactionIdBank());
        coveringValidationResponseData.setStatusDebitur("");
        coveringValidationResponseData.setTglSp3(null);
        coveringValidationResponseData.setTglSertifikat(DateUtils.format(DateUtils.convertToDateViaInstant(tPenjaminan.getTglSertifikat()), "yyyy-MM-dd"));
        coveringValidationResponseData.setTglRekam(DateUtils.format(DateUtils.convertToDateViaInstant(tPenjaminan.getCreatedDate()), "yyyy-MM-dd"));
        coveringValidationResponseData.setStatusSertifikat(tPenjaminan.getStatusPenjaminanId().toString());

        coveringValidationResponse.setStatus(true);
        coveringValidationResponse.setMessage("Request Success");
        coveringValidationResponse.setTransactionID(tPenjaminan.getTransactionIdBank());
        coveringValidationResponse.setTrxDateResponse(DateUtils.format(DateUtils.getNow(), "yyyyMMddHHmmss"));
        coveringValidationResponse.setData(coveringValidationResponseData);

        return Optional.of(coveringValidationResponse);
    }
}
