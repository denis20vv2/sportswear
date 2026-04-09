package sportswear.sportswear.core.order.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.order.domain.Order;

import java.util.Optional;

@Repository
public interface OrderRep extends JpaRepository<Order, Long> {

}
