package sportswear.sportswear.core.accessories.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.accessories.domain.Accessories;
import sportswear.sportswear.core.shoes.domain.Shoes;

@Repository
public interface AccessoriesRep extends JpaRepository<Accessories, Long>, JpaSpecificationExecutor<Accessories> {
}
