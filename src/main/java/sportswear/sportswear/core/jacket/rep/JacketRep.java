package sportswear.sportswear.core.jacket.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.jacket.domain.Jacket;

@Repository
public interface JacketRep extends JpaRepository<Jacket, Long>, JpaSpecificationExecutor<Jacket> {
}
