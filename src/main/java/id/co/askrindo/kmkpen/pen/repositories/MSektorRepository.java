package id.co.askrindo.kmkpen.pen.repositories;

import id.co.askrindo.kmkpen.pen.model.master.MSektorEkonomi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MSektorRepository extends JpaRepository<MSektorEkonomi, String> {

    Optional<MSektorEkonomi> findById(String kodeSektor);
}
