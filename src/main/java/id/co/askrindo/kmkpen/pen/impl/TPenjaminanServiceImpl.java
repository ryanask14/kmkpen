package id.co.askrindo.kmkpen.pen.impl;

import id.co.askrindo.kmkpen.pen.model.MCabang;
import id.co.askrindo.kmkpen.pen.model.TPenjaminan;
import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;
import id.co.askrindo.kmkpen.pen.model.master.MBank;
import id.co.askrindo.kmkpen.pen.model.master.MMappingBank;
import id.co.askrindo.kmkpen.pen.repositories.MBankRepository;
import id.co.askrindo.kmkpen.pen.repositories.MCabangRepository;
import id.co.askrindo.kmkpen.pen.repositories.MMappingBankRepository;
import id.co.askrindo.kmkpen.pen.repositories.TPenjaminanRepository;
import id.co.askrindo.kmkpen.pen.service.TPenjaminanService;
import id.co.askrindo.kmkpen.utils.Constants;
import id.co.askrindo.kmkpen.utils.DateUtils;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Optional;

@Service
@Log
public class TPenjaminanServiceImpl implements TPenjaminanService {

    @Autowired
    TPenjaminanRepository tPenjaminanRepository;

    @Autowired
    MBankRepository mBankRepository;

    @Autowired
    MMappingBankRepository mMappingBankRepository;

    @Autowired
    MCabangRepository mCabangRepository;

    @Override
    public Optional<TPenjaminan> findByNoRekeningPinjaman(String noRekening) {
        return tPenjaminanRepository.findByNoRekeningPinjaman(noRekening);
    }

    @Override
    public Optional<TPenjaminan> findByNoAplikasi(String noAplikasi) {
        return tPenjaminanRepository.findByTransactionIdBank(noAplikasi);
    }

    @Override
    public Optional<TPenjaminan> findByNoIdDebitur(String nik) {
        return tPenjaminanRepository.findByNoIdDebitur(nik);
    }

    @Override
    public TPenjaminan mappingTPenjaminan(CoveringValidationRequest coveringValidationRequest) {

        TPenjaminan tPenjaminan = new TPenjaminan();
        tPenjaminan.setStatusPenjaminanId(Constants.Parameters.STATUS_DRAFT);
        tPenjaminan.setNoSertifikat("");
        tPenjaminan.setStatusSikp(Constants.StatusEjamku.DRAFT);
        tPenjaminan.setIdPenjaminanPrev(null);
        tPenjaminan.setNoRekeningPinjaman(coveringValidationRequest.getNoRekening());
        tPenjaminan.setAlamatDebitur(coveringValidationRequest.getAlamatDebitur());
        tPenjaminan.setAlasanPenolakan("");
        tPenjaminan.setBakidebet(BigDecimal.ZERO);
        tPenjaminan.setCif(coveringValidationRequest.getCif());
        tPenjaminan.setCoverage(Constants.Parameters.COVERAGE);
        tPenjaminan.setCreatedBy(Constants.Parameters.CREATED_BY);
        tPenjaminan.setCurrency(Constants.Parameters.CURRENCY);
        tPenjaminan.setCreatedDate(DateUtils.convertToLocalDateViaInstant(DateUtils.getNow()));
        tPenjaminan.setDokumenPembatalan(null);
        if(coveringValidationRequest.getPlafonKredit().compareTo(Constants.Parameters.LIMIT_CAC) < 0){
            tPenjaminan.setIsCac(true);
        } else {
            tPenjaminan.setIsCac(false);
        }
        tPenjaminan.setExceptionFlag(null);
        tPenjaminan.setIsCancel(false);
        tPenjaminan.setIsEndorsed(false);
        tPenjaminan.setIsIjpBayar(false);
        tPenjaminan.setIsLunasDipercepat(false);
        tPenjaminan.setIsPenagihan(false);
        tPenjaminan.setIsProsesApproval(false);
        tPenjaminan.setIsProsesApprovalKoreksi(false);
        tPenjaminan.setIsProsesEndorse(false);
        tPenjaminan.setIsTagihDjppr(false);
        tPenjaminan.setIsUpdateRekening(false);
        tPenjaminan.setJangkaWaktu(coveringValidationRequest.getJangkaWaktu());
        tPenjaminan.setJenisIdentitas("1");
        tPenjaminan.setJenisKelamin(coveringValidationRequest.getJenisKelamin());
        tPenjaminan.setJenisKredit("");
        tPenjaminan.setJenisPekerjaan(coveringValidationRequest.getKodePekerjaan());
        tPenjaminan.setJenisPembatalan(null);
        tPenjaminan.setJenisPen("GEN2");
        tPenjaminan.setJenisPengajuan("1");
        tPenjaminan.setKekayaanBersih(BigDecimal.ONE);
        tPenjaminan.setKetAuditTrail(null);
        tPenjaminan.setKetSikp(null);
        tPenjaminan.setKodePos(coveringValidationRequest.getKodePos());
        tPenjaminan.setKeterangan(null);
        tPenjaminan.setKetValidasiEjamku(null);

        MBank mBank = mBankRepository.findById(coveringValidationRequest.getKodeBank()).get();
        MMappingBank mMappingBank = mMappingBankRepository.findByKodeBankAndKodeCabangBank(mBank, coveringValidationRequest.getKodeUker()).get();
        MCabang mCabang = mCabangRepository.findByKodeBankIndukAndKodeCabang(coveringValidationRequest.getKodeBank(), coveringValidationRequest.getKodeUker());

        tPenjaminan.setKodeBank(mBank);
        tPenjaminan.setKodeCabangAskrindo(mMappingBank.getKodeCabangAskrindo());
        tPenjaminan.setKodeCabangBank(coveringValidationRequest.getKodeUker());
        tPenjaminan.setKolektibilitasKredit(coveringValidationRequest.getStatusKolektibilitas());
        tPenjaminan.setLoanType(coveringValidationRequest.getLoanType());
        tPenjaminan.setModalUsaha(coveringValidationRequest.getModalUsaha());
        tPenjaminan.setMaritalStatus(coveringValidationRequest.getMaritalStatus());
        tPenjaminan.setMekanismePenyaluran("1");
        tPenjaminan.setNoSertifikat(null);
        tPenjaminan.setNamaCabangBank(mCabang.getNamaCabang());
        tPenjaminan.setNamaDebitur(coveringValidationRequest.getNamaDebitur());
        tPenjaminan.setNilaiPertanggungan(coveringValidationRequest.getPlafonKredit().multiply(Constants.Parameters.COVERAGE).divide(BigDecimal.valueOf(100)));
        tPenjaminan.setNoHpDebitur(coveringValidationRequest.getNoHp());
        tPenjaminan.setNoIdDebitur(coveringValidationRequest.getNoIdentitas());
        tPenjaminan.setNoRekeningPinjaman(coveringValidationRequest.getNoRekening());
        tPenjaminan.setNoIjinUsaha(coveringValidationRequest.getNoIjinUsaha());
        tPenjaminan.setNoPerjanjianKredit(coveringValidationRequest.getNoPk());
        tPenjaminan.setNoPks(mBank.getNoPks());
        tPenjaminan.setNpwp(coveringValidationRequest.getNpwp());
        tPenjaminan.setOmsetUsaha(coveringValidationRequest.getOmsetUsaha());
        tPenjaminan.setPendidikan(coveringValidationRequest.getPendidikan());
        tPenjaminan.setPlafonDisetujui(coveringValidationRequest.getPlafonKredit());
        tPenjaminan.setPlafondKredit(coveringValidationRequest.getPlafonKredit());
        tPenjaminan.setRate(BigDecimal.valueOf(4.65));
        tPenjaminan.setStatusPenjaminanId(0);
        tPenjaminan.setStatusSikp(Constants.StatusEjamku.DRAFT);
        tPenjaminan.setSektorEkonomi(coveringValidationRequest.getKodeSektor());
        tPenjaminan.setStatusCetak(0);
        tPenjaminan.setStatusKepegawaian(coveringValidationRequest.getStatusKepegawaian());
        tPenjaminan.setStatusUpdateSikp(0);
        tPenjaminan.setSukuBungaKredit(null);
        tPenjaminan.setTglPenjaminan(null);
        tPenjaminan.setTempatLahir(coveringValidationRequest.getTempatLahir());
        tPenjaminan.setTransactionIdBank(coveringValidationRequest.getNoRekening());
        try {
            tPenjaminan.setTglAkhirKredit(DateUtils.convertToLocalDateViaInstant(DateUtils.parse(coveringValidationRequest.getTanggalAkhir(), Constants.Parameters.DATE_FORMAT_YYYYMMDD)));
            tPenjaminan.setTglAwalKredit(DateUtils.convertToLocalDateViaInstant(DateUtils.parse(coveringValidationRequest.getTanggalAwal(), Constants.Parameters.DATE_FORMAT_YYYYMMDD)));
            tPenjaminan.setTglLahir(DateUtils.convertToLocalDateViaInstant(coveringValidationRequest.getTanggalLahir()));
            tPenjaminan.setTglAkhirPertanggungan(DateUtils.convertToLocalDateViaInstant(DateUtils.parse(coveringValidationRequest.getTanggalAkhir(), Constants.Parameters.DATE_FORMAT_YYYYMMDD)));
            tPenjaminan.setTglAwalPertanggungan(DateUtils.convertToLocalDateViaInstant(DateUtils.parse(coveringValidationRequest.getTanggalAwal(), Constants.Parameters.DATE_FORMAT_YYYYMMDD)));
            tPenjaminan.setTglMulaiUsaha(DateUtils.convertToLocalDateViaInstant(DateUtils.parse(coveringValidationRequest.getTglMulaiUsaha(), Constants.Parameters.DATE_FORMAT_YYYYMMDD)));
            tPenjaminan.setTglPk(DateUtils.convertToLocalDateViaInstant(DateUtils.parse(coveringValidationRequest.getTglPK(), Constants.Parameters.DATE_FORMAT_YYYYMMDD)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return tPenjaminan;
    }

    @Override
    public Optional<TPenjaminan> inquiryByNorekNikNoAplikasi(String noRekening, String nik, String noAplikasi) {
        return tPenjaminanRepository.findTop1ByNoRekeningPinjamanLikeOrNoIdDebiturLikeOrTransactionIdBankLikeOrderByIdDesc(noRekening, nik, noAplikasi);
    }

    @Override
    public void save(TPenjaminan tPenjaminan) {
        tPenjaminanRepository.save(tPenjaminan);
    }

    @Override
    public TPenjaminan findByNoRekeningPinjamanTop1(String noRekening) {
        return tPenjaminanRepository.findTop1ByNoRekeningPinjamanOrderByCreatedDateDesc(noRekening);
    }

    @Override
    public Optional<TPenjaminan> findById(Long idPenjaminan) {
        return tPenjaminanRepository.findById(idPenjaminan);
    }
}
