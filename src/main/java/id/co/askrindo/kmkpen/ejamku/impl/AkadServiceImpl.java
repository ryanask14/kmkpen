package id.co.askrindo.kmkpen.ejamku.impl;

import id.co.askrindo.kmkpen.ejamku.model.dto.Akad;
import id.co.askrindo.kmkpen.ejamku.model.dto.AkadResponse;
import id.co.askrindo.kmkpen.ejamku.service.AkadService;
import id.co.askrindo.kmkpen.ejamku.service.AuthService;
import id.co.askrindo.kmkpen.ejamku.service.EjamkuService;
import id.co.askrindo.kmkpen.pen.model.TPenjaminan;
import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;
import id.co.askrindo.kmkpen.pen.service.TPenjaminanService;
import id.co.askrindo.kmkpen.utils.Constants;
import id.co.askrindo.kmkpen.utils.DateUtils;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

@Service
@Log
public class AkadServiceImpl implements AkadService {

    @Autowired
    EjamkuService ejamkuService;

    @Autowired
    AuthService authService;

    @Autowired
    TPenjaminanService tPenjaminanService;

    @Override
    public AkadResponse postAkad(Akad akad) {
        String url = ejamkuService.getEndpoint(Constants.ParameterAPIEjamku.AKAD_POST);

        AkadResponse akadResponse = ejamkuService.newRest().postForObject(url,
                ejamkuService.newEntityAkad(ejamkuService.headers(authService.getToken()), akad),
                AkadResponse.class);

        return akadResponse;
    }

    @Override
    public AkadResponse inquiryAkad(String kodeBank, String noRekening) {

        String url = ejamkuService.getEndpoint(Constants.ParameterAPIEjamku.AKAD_GET);

        String urlTemplate = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("kode_bank", "{kode_bank}")
                .queryParam("rekening_baru", "{rekening_baru}")
                .encode()
                .toUriString();

        Map<String, String> params = new HashMap<>();
        params.put("kode_bank", kodeBank);
        params.put("rekening_baru", noRekening);

        HttpEntity<AkadResponse> response = ejamkuService.newRest().exchange(
                urlTemplate,
                HttpMethod.GET,
                ejamkuService.newEntity(ejamkuService.headers(authService.getToken())),
                AkadResponse.class,
                params
        );

        return response.getBody();
    }

    @Override
    public AkadResponse updateAkad(String kodeBank, String noRekeningLama, Akad akad) {

        String url = ejamkuService.getEndpoint(Constants.ParameterAPIEjamku.AKAD_PUT);
        log.info(akad.toString());

        String urlTemplate = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("kode_bank_old", "{kode_bank_old}")
                .queryParam("rekening_baru_old", "{rekening_baru_old}")
                .encode()
                .toUriString();

        Map<String, String> params = new HashMap<>();
        params.put("kode_bank_old", kodeBank);
        params.put("rekening_baru_old", noRekeningLama);

        HttpEntity<AkadResponse> response = ejamkuService.newRest().exchange(
                urlTemplate,
                HttpMethod.PUT,
                ejamkuService.newEntityAkad(ejamkuService.headers(authService.getToken()), akad),
                AkadResponse.class,
                params
        );

        log.info(response.getBody().toString());

        return response.getBody();
    }

    @Override
    public Akad mappingAkad(CoveringValidationRequest coveringValidationRequest, TPenjaminan tPenjaminan) {
        Akad akad = new Akad();

        akad.setNilaiAkad(coveringValidationRequest.getPlafonKredit());
        akad.setNomorAkad(coveringValidationRequest.getNoPk());
        akad.setStatusAkad("B");
        akad.setKodeBank(coveringValidationRequest.getKodeBank());
        akad.setNik(coveringValidationRequest.getNoIdentitas());
        akad.setNilaiDijamin(tPenjaminan.getNilaiPertanggungan());
        akad.setNomorPenjaminan(tPenjaminan.getNoSertifikat());
        akad.setRekeningBaru(coveringValidationRequest.getNoRekening());
        akad.setSektor(coveringValidationRequest.getKodeSektor());
        akad.setStatusRekening(1);
        akad.setRekeningLama(null);
        try {
            akad.setTglAkad(DateUtils.parse(coveringValidationRequest.getTglPK(),Constants.Parameters.DATE_FORMAT_YYYYMMDD));
            akad.setTglJatuhTempo(DateUtils.parse(coveringValidationRequest.getTanggalAkhir(),Constants.Parameters.DATE_FORMAT_YYYYMMDD));
            akad.setTglPenarikan(DateUtils.parse(coveringValidationRequest.getTglPK(),Constants.Parameters.DATE_FORMAT_YYYYMMDD));
            akad.setTglPenjaminan(DateUtils.convertToDateViaInstant(tPenjaminan.getTglSertifikat()));
        } catch (ParseException e) {
            return null;
        }

        return akad;

    }

    @Override
    public AkadResponse validasiAkad(CoveringValidationRequest coveringValidationRequest) {
        TPenjaminan tPenjaminan =tPenjaminanService.mappingTPenjaminan(coveringValidationRequest);
        Akad akad = mappingAkad(coveringValidationRequest, tPenjaminan);
        AkadResponse akadResponse = postAkad(akad);

        return akadResponse;
    }

}
