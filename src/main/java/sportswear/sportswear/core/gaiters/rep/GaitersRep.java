package sportswear.sportswear.core.gaiters.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.gaiters.domain.Gaiters;
import sportswear.sportswear.core.gloves.domain.Gloves;

@Repository
public interface GaitersRep extends JpaRepository<Gaiters, Long>, JpaSpecificationExecutor<Gaiters> {
}
