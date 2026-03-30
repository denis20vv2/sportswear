package sportswear.sportswear.core.product.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.page.domain.Page;
import sportswear.sportswear.core.product.domain.Product;

@Repository
public interface ProductRep extends JpaRepository<Product, Long> {
}
