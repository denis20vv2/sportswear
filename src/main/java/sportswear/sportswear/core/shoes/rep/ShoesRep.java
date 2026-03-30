package sportswear.sportswear.core.shoes.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.shoes.domain.Shoes;

@Repository
public interface ShoesRep extends JpaRepository<Shoes, Long>, JpaSpecificationExecutor<Shoes> {
}
