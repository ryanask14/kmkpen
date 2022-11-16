package id.co.askrindo.kmkpen.ejamku.controller;

import id.co.askrindo.kmkpen.ejamku.model.dto.CalonDebitur;
import id.co.askrindo.kmkpen.ejamku.model.dto.CalonDebiturResponse;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/ejamku")
@Log
public class CalonDebiturController {

    @PostMapping(value = "/calon", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<CalonDebiturResponse> postCalon(@RequestBody @Valid CalonDebitur calonDebitur) {

        CalonDebiturResponse calonDebiturResponse = null;

        return new ResponseEntity<CalonDebiturResponse>(calonDebiturResponse, HttpStatus.OK);
    }

    @GetMapping(value = "/calon/{nik}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<CalonDebiturResponse> getCalon(@PathVariable String nik) {

        CalonDebiturResponse calonDebiturResponse = null;

        return new ResponseEntity<CalonDebiturResponse>(calonDebiturResponse, HttpStatus.OK);
    }

    @PutMapping(value = "/calon/{nik}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<CalonDebiturResponse> putCalon(@PathVariable String nikOld) {

        CalonDebiturResponse calonDebiturResponse = null;

        return new ResponseEntity<CalonDebiturResponse>(calonDebiturResponse, HttpStatus.OK);
    }
}
