package id.co.askrindo.kmkpen.ejamku.service;

import id.co.askrindo.kmkpen.ejamku.model.dto.CalonDebitur;
import id.co.askrindo.kmkpen.ejamku.model.dto.CalonDebiturResponse;
import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;

public interface CalonDebiturService {

    CalonDebiturResponse postCalon(CalonDebitur calonDebitur, String noRekeningPinjaman);
    CalonDebiturResponse inquiryCalon(String nik);
    CalonDebiturResponse updateCalon(CalonDebitur calonDebitur, String nik);
    CalonDebitur mappingCalon(CoveringValidationRequest coveringValidationRequest);
    CalonDebiturResponse validasiCalon(CoveringValidationRequest coveringValidationRequest);
}
