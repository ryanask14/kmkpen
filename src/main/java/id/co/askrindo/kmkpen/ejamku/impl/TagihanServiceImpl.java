package id.co.askrindo.kmkpen.ejamku.impl;

import id.co.askrindo.kmkpen.ejamku.model.dto.Tagihan;
import id.co.askrindo.kmkpen.ejamku.model.dto.TagihanResponse;
import id.co.askrindo.kmkpen.ejamku.service.AuthService;
import id.co.askrindo.kmkpen.ejamku.service.EjamkuService;
import id.co.askrindo.kmkpen.ejamku.service.TagihanService;
import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;
import id.co.askrindo.kmkpen.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

@Service
public class TagihanServiceImpl implements TagihanService {

    @Autowired
    EjamkuService ejamkuService;

    @Autowired
    AuthService authService;

    @Override
    public TagihanResponse postTagihan(Tagihan tagihan) {
        String url = ejamkuService.getEndpoint(Constants.ParameterAPIEjamku.TAGIHAN_POST);

        TagihanResponse tagihanResponse = ejamkuService.newRest().postForObject(url,
                ejamkuService.newEntityTagihan(ejamkuService.headers(authService.getToken()), tagihan),
                TagihanResponse.class);

        return tagihanResponse;
    }

    @Override
    public TagihanResponse inquiryTagihan(String idTagihan) {
        String url = ejamkuService.getEndpoint(Constants.ParameterAPIEjamku.TAGIHAN_GET);

        String urlTemplate = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("id_tagihan", "{id_tagihan}")
                .encode()
                .toUriString();

        Map<String, String> params = new HashMap<>();
        params.put("id_tagihan", idTagihan);

        HttpEntity<TagihanResponse> response = ejamkuService.newRest().exchange(
                urlTemplate,
                HttpMethod.GET,
                ejamkuService.newEntity(ejamkuService.headers(authService.getToken())),
                TagihanResponse.class,
                params
        );

        return response.getBody();
    }

    @Override
    public Tagihan mappingTagihan(CoveringValidationRequest coveringValidationRequest) {
        return null;
    }
}
