package id.co.askrindo.kmkpen.pen.service;

import id.co.askrindo.kmkpen.pen.model.TPenjaminan;
import id.co.askrindo.kmkpen.pen.model.dto.CoveringValidationRequest;

import java.util.Optional;

public interface TPenjaminanService {

    Optional<TPenjaminan> findByNoRekeningPinjaman(String noRekening);
    Optional<TPenjaminan> findByNoAplikasi(String noAplikasi);
    Optional<TPenjaminan> findByNoIdDebitur(String nik);
    TPenjaminan mappingTPenjaminan(CoveringValidationRequest coveringValidationRequest);
    Optional<TPenjaminan> inquiryByNorekNikNoAplikasi(String noRekening, String nik, String noAplikasi);
    void save(TPenjaminan tPenjaminan);
    TPenjaminan findByNoRekeningPinjamanTop1(String noRekening);
    Optional<TPenjaminan> findById(Long idPenjaminan);
}
