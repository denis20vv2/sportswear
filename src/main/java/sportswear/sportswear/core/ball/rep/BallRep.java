package sportswear.sportswear.core.ball.rep;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.contactinfo.domain.ContactInfo;

@Repository
public interface BallRep extends JpaRepository<Ball, Long>, JpaSpecificationExecutor<Ball> {
}
