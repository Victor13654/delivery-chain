package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.Stuff;

public interface StuffRepository extends JpaRepository<Stuff, Integer> {
}
