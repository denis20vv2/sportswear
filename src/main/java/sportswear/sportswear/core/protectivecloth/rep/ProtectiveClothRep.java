package sportswear.sportswear.core.protectivecloth.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.protectivecloth.domain.ProtectiveCloth;

@Repository
public interface ProtectiveClothRep extends JpaRepository<ProtectiveCloth, Long>, JpaSpecificationExecutor<ProtectiveCloth> {
}
