package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.Producer;

public interface ProducerRepository extends JpaRepository<Producer, Integer> {
}
