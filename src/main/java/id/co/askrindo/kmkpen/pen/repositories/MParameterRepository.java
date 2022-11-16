package id.co.askrindo.kmkpen.pen.repositories;

import id.co.askrindo.kmkpen.pen.model.master.MParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MParameterRepository extends JpaRepository<MParameter, String> {

    Optional<MParameter> findById(String paramKey);
}
