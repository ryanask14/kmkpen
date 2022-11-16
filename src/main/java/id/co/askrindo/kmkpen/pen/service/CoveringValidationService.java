package id.co.askrindo.kmkpen.pen.service;

import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;
import id.co.askrindo.kmkpen.pen.model.dto.InquiryRequest;

import java.util.Optional;


public interface CoveringValidationService {

    Optional<Object> validasi(CoveringValidationRequest coveringValidationRequest);
    Optional<Object> updatePen(CoveringValidationRequest coveringValidationRequest, String no_rekening_lama);
    Optional<Object> inquiryPenjaminan(InquiryRequest inquiryRequest);
}
