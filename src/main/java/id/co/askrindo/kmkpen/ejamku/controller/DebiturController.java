package id.co.askrindo.kmkpen.ejamku.controller;

import id.co.askrindo.kmkpen.ejamku.model.dto.DebiturResponse;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejamku")
@Log
public class DebiturController {

    @GetMapping(value = "/debitur", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<DebiturResponse> getDebitur(@PathVariable String nik) {

        DebiturResponse debiturResponse = null;

        return new ResponseEntity<DebiturResponse>(debiturResponse, HttpStatus.OK);
    }
}
