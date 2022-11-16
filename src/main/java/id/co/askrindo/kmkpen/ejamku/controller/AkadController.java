package id.co.askrindo.kmkpen.ejamku.controller;

import id.co.askrindo.kmkpen.ejamku.model.dto.Akad;
import id.co.askrindo.kmkpen.ejamku.model.dto.AkadResponse;
import id.co.askrindo.kmkpen.ejamku.service.AkadService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/ejamku")
@Log
public class AkadController {

    @Autowired
    private AkadService akadService;

    @PostMapping(value = "/akad", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AkadResponse> postAkad(@RequestBody @Valid Akad akad) {

        AkadResponse akadResponse = null;

        return new ResponseEntity<AkadResponse>(akadResponse, HttpStatus.OK);
    }

    @GetMapping(value = "/akad/{kode_bank}/{rekening_baru}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AkadResponse> getAkad(@PathVariable String kode_bank, @PathVariable String rekening_baru ) {

        log.info("kode_bank: "+kode_bank);
        log.info("rekening_baru: "+rekening_baru);

        AkadResponse akadResponse = akadService.inquiryAkad(kode_bank, rekening_baru);

        return new ResponseEntity<AkadResponse>(akadResponse, HttpStatus.OK);
    }

    @PutMapping(value = "/akad/{kode_bank_old}/{rekening_baru_old}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AkadResponse> putAkad(@PathVariable String kode_bank_old, @PathVariable String rekening_baru_old ) {

        AkadResponse akadResponse = null;

        return new ResponseEntity<AkadResponse>(akadResponse, HttpStatus.OK);
    }
}