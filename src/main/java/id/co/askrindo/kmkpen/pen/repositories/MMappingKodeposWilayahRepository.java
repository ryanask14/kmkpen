package id.co.askrindo.kmkpen.pen.repositories;

import id.co.askrindo.kmkpen.pen.model.master.MMappingKodeposWilayah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MMappingKodeposWilayahRepository extends JpaRepository<MMappingKodeposWilayah, Long> {

    Optional<MMappingKodeposWilayah> findByKodePos(String kodePos);
}
