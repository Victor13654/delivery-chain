package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
