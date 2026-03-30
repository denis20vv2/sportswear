package sportswear.sportswear.core.inventory.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.inventory.domain.Inventory;

@Repository
public interface InventoryRep extends JpaRepository<Inventory, Long>, JpaSpecificationExecutor<Inventory> {
}
