package sportswear.sportswear.core.tshirts.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.tshirts.domain.TShirts;

@Repository
public interface TShirtsRep extends JpaRepository<TShirts, Long>, JpaSpecificationExecutor<TShirts> {
}
