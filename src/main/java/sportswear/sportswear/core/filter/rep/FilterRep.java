package sportswear.sportswear.core.filter.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.filter.domain.FilterParam;

@Repository
public interface FilterRep extends JpaRepository<FilterParam, Long> {
}
