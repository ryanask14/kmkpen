package id.co.askrindo.kmkpen.pen.repositories;

import id.co.askrindo.kmkpen.pen.model.TPenjaminan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface TPenjaminanRepository extends JpaRepository<TPenjaminan, Long> {

    Optional<TPenjaminan> findByNoRekeningPinjaman(String noRekening);
    Optional<TPenjaminan> findByNoIdDebitur(String nik);
    TPenjaminan findTop1ByNoRekeningPinjamanOrderByCreatedDateDesc(String noRekening);
    Optional<TPenjaminan> findTop1ByNoRekeningPinjamanLikeOrNoIdDebiturLikeOrTransactionIdBankLikeOrderByIdDesc(String noRekening, String nik, String noAplikasi );
    Optional<TPenjaminan> findByTransactionIdBank(String noAplikasi);

}
