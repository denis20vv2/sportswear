package sportswear.sportswear.core.shorts.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.shorts.domain.Shorts;

@Repository
public interface ShortsRep extends JpaRepository<Shorts, Long>, JpaSpecificationExecutor<Shorts> {
}
