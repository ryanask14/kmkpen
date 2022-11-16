package id.co.askrindo.kmkpen.ejamku.service;

import id.co.askrindo.kmkpen.ejamku.model.dto.Tagihan;
import id.co.askrindo.kmkpen.ejamku.model.dto.TagihanResponse;
import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;

public interface TagihanService {

    TagihanResponse postTagihan(Tagihan Tagihan);
    TagihanResponse inquiryTagihan(String idTagihan);
    Tagihan mappingTagihan(CoveringValidationRequest coveringValidationRequest);
}
