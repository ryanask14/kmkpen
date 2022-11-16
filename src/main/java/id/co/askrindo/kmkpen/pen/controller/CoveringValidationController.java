package id.co.askrindo.kmkpen.pen.controller;

import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;
import id.co.askrindo.kmkpen.pen.model.dto.InquiryRequest;
import id.co.askrindo.kmkpen.pen.service.CoveringValidationService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/akseptasi")
@Log
public class CoveringValidationController {

    @Autowired
    CoveringValidationService coveringValidationService;

    @PostMapping(value = "/covvalidation", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Object> CoveringValidation(@RequestBody @Valid CoveringValidationRequest coveringValidationRequest) {

        log.info("cek covval");

        Optional<Object> coveringValidationResponse = coveringValidationService.validasi(coveringValidationRequest);

        return new ResponseEntity<>(coveringValidationResponse, HttpStatus.OK);
    }

    @PostMapping(value = "/update/{no_rekening_lama}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Object> CoveringValidationUpdate(@RequestBody @Valid CoveringValidationRequest coveringValidationRequest, @PathVariable String no_rekening_lama) {

        Optional<Object> coveringValidationResponse = coveringValidationService.updatePen(coveringValidationRequest, no_rekening_lama);

        return new ResponseEntity<>(coveringValidationResponse.get(), HttpStatus.OK);
    }

    @PostMapping(value = "/inquiry", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Object> inquiryPenjaminan(@RequestBody InquiryRequest inquiryRequest) {

        Optional<Object> coveringValidationResponse = coveringValidationService.inquiryPenjaminan(inquiryRequest);

        return new ResponseEntity<>(coveringValidationResponse.get(), HttpStatus.OK);
    }

}
