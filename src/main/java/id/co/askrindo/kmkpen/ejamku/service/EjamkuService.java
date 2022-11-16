package id.co.askrindo.kmkpen.ejamku.service;

import id.co.askrindo.kmkpen.ejamku.model.dto.*;
import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public interface EjamkuService {

    void prosesEjamku(CoveringValidationRequest coveringValidationRequest);
    String getEndpoint(String param);
    HttpHeaders headers(String token);
    HttpEntity<?> newEntity(HttpHeaders headers);
    HttpEntity<Akad> newEntityAkad(HttpHeaders headers, Akad akad);
    HttpEntity<CalonDebitur> newEntityCalon(HttpHeaders headers, CalonDebitur calonDebitur);
    HttpEntity<Tagihan> newEntityTagihan(HttpHeaders headers, Tagihan tagihan);
    RestTemplate newRest();
    String toJson(Object object);
}
