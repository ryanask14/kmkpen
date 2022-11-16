package id.co.askrindo.kmkpen.ejamku.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import id.co.askrindo.kmkpen.ejamku.model.dto.*;
import id.co.askrindo.kmkpen.ejamku.service.*;
import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;
import id.co.askrindo.kmkpen.pen.repositories.MApiEjamkuRepository;
import id.co.askrindo.kmkpen.pen.repositories.MParameterRepository;
import id.co.askrindo.kmkpen.utils.Constants;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.File;

@Service
@Log
public class EjamkuServiceImpl implements EjamkuService {

    @Autowired
    private MParameterRepository mParameterRepository;

    @Autowired
    private MApiEjamkuRepository mApiEjamkuRepository;

    @Override
    public void prosesEjamku(CoveringValidationRequest coveringValidationRequest) {

    }

    @Override
    public String getEndpoint(String param) {

        log.info(param);
        String base_url = mParameterRepository.findById(Constants.ParameterKey.EJAMKU_API).get().getParamValue();
        String site_url = mApiEjamkuRepository.findByName(param).get().getSiteUrl();

        return base_url.concat(site_url);

    }

    @Override
    public HttpHeaders headers(String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer ".concat(token));
        headers.setContentType(MediaType.APPLICATION_JSON);

        return headers;
    }

    @Override
    public HttpEntity<?> newEntity(HttpHeaders headers) {
        return new HttpEntity<>(headers);
    }

    @Override
    public HttpEntity<Akad> newEntityAkad(HttpHeaders headers, Akad akad) {
        return new HttpEntity<>(akad ,headers);
    }

    @Override
    public HttpEntity<CalonDebitur> newEntityCalon(HttpHeaders headers, CalonDebitur calonDebitur) {
        return new HttpEntity<>(calonDebitur ,headers);
    }

    @Override
    public HttpEntity<Tagihan> newEntityTagihan(HttpHeaders headers, Tagihan tagihan) {
        return new HttpEntity<>(tagihan ,headers);
    }

    @Override
    public RestTemplate newRest() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        return restTemplate;
    }

    @Override
    public String toJson(Object object) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }
    }

}
