package sportswear.sportswear.core.inventory.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.inventory.domain.Inventory;
import sportswear.sportswear.core.inventory.rep.InventoryRep;
import sportswear.sportswear.core.shoes.domain.Shoes;

import java.util.List;

@Service
@AllArgsConstructor
public class InventoryService {

    private final InventoryRep inventoryRep;

    public List<Inventory> getInventory(int page, int size, String colour,  String sortBy, String direction) {

        Sort sort = Sort.unsorted();
        if (sortBy != null) {
            sort = direction != null && direction.equalsIgnoreCase("desc")
                    ? Sort.by(sortBy).descending()
                    : Sort.by(sortBy).ascending();
        }

        Pageable pageable = PageRequest.of(page, size, sort);

        Specification<Inventory> spec = Specification.where(null);

        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }


        return inventoryRep.findAll(spec, pageable).getContent();
    }

    public Inventory getInventoryById(Long id) {

        return inventoryRep.findById(id).orElse(null);

    }

}
