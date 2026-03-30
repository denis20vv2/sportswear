package sportswear.sportswear.core.gloves.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.gloves.domain.Gloves;
import sportswear.sportswear.core.protectivecloth.domain.ProtectiveCloth;

@Repository
public interface GlovesRep extends JpaRepository<Gloves, Long>, JpaSpecificationExecutor<Gloves> {
}
