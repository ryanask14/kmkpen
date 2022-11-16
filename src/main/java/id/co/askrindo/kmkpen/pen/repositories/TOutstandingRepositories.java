package id.co.askrindo.kmkpen.pen.repositories;

import id.co.askrindo.kmkpen.pen.model.TOutstandingTeoritis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TOutstandingRepositories extends JpaRepository<TOutstandingTeoritis, Long> {
    
}
