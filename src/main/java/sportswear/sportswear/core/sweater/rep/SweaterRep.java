package sportswear.sportswear.core.sweater.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.sweater.domain.Sweater;

@Repository
public interface SweaterRep extends JpaRepository<Sweater, Long>, JpaSpecificationExecutor<Sweater> {
}
