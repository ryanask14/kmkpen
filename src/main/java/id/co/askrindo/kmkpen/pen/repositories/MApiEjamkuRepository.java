package id.co.askrindo.kmkpen.pen.repositories;

import id.co.askrindo.kmkpen.pen.model.master.MApiEjamku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MApiEjamkuRepository extends JpaRepository<MApiEjamku, Long> {

    Optional<MApiEjamku> findByName(String name);

}
