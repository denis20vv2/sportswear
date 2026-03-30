package sportswear.sportswear.core.pants.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.pants.domain.Pants;

@Repository
public interface PantsRep extends JpaRepository<Pants, Long>, JpaSpecificationExecutor<Pants> {
}
