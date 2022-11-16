package id.co.askrindo.kmkpen.ejamku.controller;


import id.co.askrindo.kmkpen.ejamku.model.dto.Tagihan;
import id.co.askrindo.kmkpen.ejamku.model.dto.TagihanResponse;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/ejamku")
@Log
public class TagihanController {

    @PostMapping(value = "/tagihan", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<TagihanResponse> postTagihan(@RequestBody @Valid Tagihan tagihan) {

        TagihanResponse tagihanResponse = null;

        return new ResponseEntity<TagihanResponse>(tagihanResponse, HttpStatus.OK);
    }

    @GetMapping(value = "/tagihan/{id_tagihan}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<TagihanResponse> getTagihan(@PathVariable String idTagihan) {

        TagihanResponse tagihanResponse = null;

        return new ResponseEntity<TagihanResponse>(tagihanResponse, HttpStatus.OK);
    }
}
