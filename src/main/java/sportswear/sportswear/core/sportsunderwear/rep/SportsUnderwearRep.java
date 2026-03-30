package sportswear.sportswear.core.sportsunderwear.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.sportsunderwear.domain.SportsUnderwear;

@Repository
public interface SportsUnderwearRep extends JpaRepository<SportsUnderwear, Long>, JpaSpecificationExecutor<SportsUnderwear> {
}