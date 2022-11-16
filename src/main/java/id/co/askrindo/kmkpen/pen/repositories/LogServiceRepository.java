package id.co.askrindo.kmkpen.pen.repositories;

import id.co.askrindo.kmkpen.pen.model.LogSikp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogServiceRepository extends JpaRepository<LogSikp, Long> {

}
