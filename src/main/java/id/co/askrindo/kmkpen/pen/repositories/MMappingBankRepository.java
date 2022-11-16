package id.co.askrindo.kmkpen.pen.repositories;

import id.co.askrindo.kmkpen.pen.model.master.MBank;
import id.co.askrindo.kmkpen.pen.model.master.MMappingBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MMappingBankRepository extends JpaRepository<MMappingBank, Long> {

    Optional<MMappingBank> findByKodeBankAndKodeCabangBank(MBank kodeBank, String kodeCabangBank);

}
