package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import work.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Integer> {
}
