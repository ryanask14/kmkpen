package id.co.askrindo.kmkpen.ejamku.impl;

import id.co.askrindo.kmkpen.ejamku.model.dto.CalonDebitur;
import id.co.askrindo.kmkpen.ejamku.model.dto.CalonDebiturResponse;
import id.co.askrindo.kmkpen.ejamku.service.AuthService;
import id.co.askrindo.kmkpen.ejamku.service.CalonDebiturService;
import id.co.askrindo.kmkpen.ejamku.service.EjamkuService;
import id.co.askrindo.kmkpen.pen.model.TPenjaminan;
import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;
import id.co.askrindo.kmkpen.pen.model.master.MMappingKodeposWilayah;
import id.co.askrindo.kmkpen.pen.repositories.MMappingKodeposWilayahRepository;
import id.co.askrindo.kmkpen.pen.service.LogService;
import id.co.askrindo.kmkpen.utils.Constants;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@Log
public class CalonDebiturServiceImpl implements CalonDebiturService {

    @Autowired
    EjamkuService ejamkuService;

    @Autowired
    AuthService authService;

    @Autowired
    LogService logService;

    @Autowired
    MMappingKodeposWilayahRepository mMappingKodeposWilayahRepository;

    @Override
    public CalonDebiturResponse postCalon(CalonDebitur calonDebitur, String noRekeningPinjaman) {
        String url = ejamkuService.getEndpoint(Constants.ParameterAPIEjamku.CALON_POST);

        log.info("url= " + url);
        log.info("calonDebitur= " + ejamkuService.toJson(calonDebitur));

        ResponseEntity<CalonDebiturResponse> calonDebiturResponseHttp = null;
        CalonDebiturResponse calonDebiturResponse = new CalonDebiturResponse();

        try {
            calonDebiturResponseHttp = ejamkuService.newRest().postForEntity(url,
                    ejamkuService.newEntityCalon(ejamkuService.headers(authService.getToken()), calonDebitur),
                    CalonDebiturResponse.class);
            calonDebiturResponse = calonDebiturResponseHttp.getBody();
        } catch (RestClientException e) {
            calonDebiturResponse.setError(true);
            calonDebiturResponse.setMessage(e.getMessage() +" (Calon Debitur)");
        }

        logService.insertLog(noRekeningPinjaman,
                calonDebitur.getNik(),
                noRekeningPinjaman,
                Constants.ParameterAPIEjamku.CALON_POST,
                ejamkuService.toJson(calonDebitur),
                ejamkuService.toJson(calonDebiturResponse),
                calonDebiturResponse.getMessage(),
                "",
                0L);

        return calonDebiturResponse;


    }

    @Override
    public CalonDebiturResponse inquiryCalon(String nik) {
        String url = ejamkuService.getEndpoint(Constants.ParameterAPIEjamku.CALON_GET_NIK);

        HttpEntity<CalonDebiturResponse> response = ejamkuService.newRest().exchange(
                getUrlTemplate(url),
                HttpMethod.GET,
                ejamkuService.newEntity(ejamkuService.headers(authService.getToken())),
                CalonDebiturResponse.class,
                getParams(nik)
        );

        return response.getBody();
    }

    @Override
    public CalonDebiturResponse updateCalon(CalonDebitur calonDebitur, String nik) {
        String url = ejamkuService.getEndpoint(Constants.ParameterAPIEjamku.CALON_PUT);

        HttpEntity<CalonDebiturResponse> response = ejamkuService.newRest().exchange(
                getUrlTemplate(url),
                HttpMethod.PUT,
                ejamkuService.newEntity(ejamkuService.headers(authService.getToken())),
                CalonDebiturResponse.class,
                getParams(nik)
        );

        return response.getBody();
    }

    @Override
    public CalonDebitur mappingCalon(CoveringValidationRequest coveringValidationRequest) {

        CalonDebitur calonDebitur = new CalonDebitur();
        calonDebitur.setJnsDebitur(Constants.Parameters.JNS_DEBITUR);
        calonDebitur.setAlamat(coveringValidationRequest.getAlamatDebitur());
        calonDebitur.setAlamatUsaha("-");
        calonDebitur.setIjinUsaha(coveringValidationRequest.getNoIjinUsaha());
        calonDebitur.setJmlPekerja(coveringValidationRequest.getJumlahTenagaKerja());
        calonDebitur.setJnsKelamin(coveringValidationRequest.getJenisKelamin());
        calonDebitur.setKodeKabkota(mappingKodeKabKota(coveringValidationRequest.getKodePos(), coveringValidationRequest.getNoIdentitas()));
        calonDebitur.setKodePos(coveringValidationRequest.getKodePos());
        calonDebitur.setMaritasSts(coveringValidationRequest.getMaritalStatus());
        calonDebitur.setNama(coveringValidationRequest.getNamaDebitur());
        calonDebitur.setNik(coveringValidationRequest.getNoIdentitas());
        calonDebitur.setMulaiUsaha(coveringValidationRequest.getTglMulaiUsaha());
        calonDebitur.setNoHp(coveringValidationRequest.getNoHp());
        calonDebitur.setNpwp(coveringValidationRequest.getNpwp());
        calonDebitur.setPekerjaan(coveringValidationRequest.getKodePekerjaan());
        calonDebitur.setPendidikan(coveringValidationRequest.getPendidikan());
        calonDebitur.setTglLahir(coveringValidationRequest.getTanggalLahir());
        calonDebitur.setUraianAgunan("-");
        calonDebitur.setModalUsaha(coveringValidationRequest.getModalUsaha());
        calonDebitur.setOmset(coveringValidationRequest.getOmsetUsaha());

        return calonDebitur;
    }

    @Override
    public CalonDebiturResponse validasiCalon(CoveringValidationRequest coveringValidationRequest) {
        CalonDebitur calonDebitur = mappingCalon(coveringValidationRequest);

        CalonDebiturResponse calonDebiturResponse = postCalon(calonDebitur, coveringValidationRequest.getNoRekening());

        return calonDebiturResponse;
    }

    private String mappingKodeKabKota(String kodePos, String nik) {

        Optional<MMappingKodeposWilayah> mMappingKodeposWilayah = mMappingKodeposWilayahRepository.findByKodePos(kodePos);

        if(mMappingKodeposWilayah.isPresent()){
            return mMappingKodeposWilayah.get().getKodeKabkota();
        } else {
            return nik.substring(0,4);
        }
    }

    private String getUrlTemplate(String url){
        String urlTemplate = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("nik", "{nik}")
                .encode()
                .toUriString();

        return urlTemplate;
    }

    private Map<String, String> getParams(String nik) {
        Map<String, String> params = new HashMap<>();
        params.put("nik", nik);

        return params;
    }
}
