package id.co.askrindo.kmkpen.ejamku.controller;

import id.co.askrindo.kmkpen.ejamku.model.dto.Auth;
import id.co.askrindo.kmkpen.ejamku.model.dto.AuthResponse;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/ejamku")
@Log
public class AuthController {

    @PostMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AuthResponse> authorize(@RequestBody @Valid Auth auth) {

        AuthResponse authResponse = null;

        return new ResponseEntity<AuthResponse>(authResponse, HttpStatus.OK);
    }
}
