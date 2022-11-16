package id.co.askrindo.kmkpen.ejamku.service;

import id.co.askrindo.kmkpen.ejamku.model.dto.Akad;
import id.co.askrindo.kmkpen.ejamku.model.dto.AkadResponse;
import id.co.askrindo.kmkpen.pen.model.TPenjaminan;
import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;

public interface AkadService {

    AkadResponse postAkad(Akad akad);
    AkadResponse inquiryAkad(String kodeBank, String noRekening);
    AkadResponse updateAkad(String kodeBank, String noRekeningLama, Akad akad);
    Akad mappingAkad(CoveringValidationRequest coveringValidationRequest, TPenjaminan tPenjaminan);
    AkadResponse validasiAkad(CoveringValidationRequest coveringValidationRequest);

}
