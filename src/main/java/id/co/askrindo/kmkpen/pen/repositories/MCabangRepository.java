package id.co.askrindo.kmkpen.pen.repositories;

import id.co.askrindo.kmkpen.pen.model.MCabang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MCabangRepository extends JpaRepository<MCabang, String> {

    MCabang findByKodeBankIndukAndKodeCabang(String kodeBank, String kodeCabang);
}
