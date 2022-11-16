package id.co.askrindo.kmkpen.ejamku.impl;

import id.co.askrindo.kmkpen.ejamku.model.dto.Auth;
import id.co.askrindo.kmkpen.ejamku.model.dto.AuthResponse;
import id.co.askrindo.kmkpen.ejamku.service.AuthService;
import id.co.askrindo.kmkpen.pen.repositories.MApiEjamkuRepository;
import id.co.askrindo.kmkpen.pen.repositories.MParameterRepository;
import id.co.askrindo.kmkpen.utils.Constants;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Log
public class AuthServiceImpl implements AuthService {

    @Autowired
    MParameterRepository parameterRepository;

    @Autowired
    MApiEjamkuRepository apiEjamkuRepository;

    @Autowired
    Environment env;

    @Override
    public String getToken() {

        RestTemplate restTemplate = new RestTemplate();

        Auth auth = new Auth();
        auth.setUsername(env.getProperty("kmkpen.api.auth.username"));
        auth.setPassword(env.getProperty("kmkpen.api.auth.password"));
        String baseUrl = parameterRepository.findById(Constants.ParameterKey.EJAMKU_API).get().getParamValue();
        String siteUrl = apiEjamkuRepository.findByName(Constants.ParameterAPIEjamku.AUTH).get().getSiteUrl();

        HttpEntity<Auth> request = new HttpEntity<>(auth);
        AuthResponse authResponse = restTemplate.postForObject(baseUrl.concat(siteUrl), request, AuthResponse.class);

        return authResponse.getData();
    }
}
