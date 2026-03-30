package sportswear.sportswear.core.shoes.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.inventory.domain.Inventory;
import sportswear.sportswear.core.shoes.domain.Shoes;
import sportswear.sportswear.core.shoes.rep.ShoesRep;

import java.util.List;

@Service
@AllArgsConstructor
public class ShoesService {

    private final ShoesRep shoesRep;

    public List<Shoes> getShoes(int page, int size, Integer sizeShoes, String type, String colour, String material,  String sortBy, String direction) {
        Sort sort = Sort.unsorted();
        if (sortBy != null) {
            sort = direction != null && direction.equalsIgnoreCase("desc")
                    ? Sort.by(sortBy).descending()
                    : Sort.by(sortBy).ascending();
        }

        Pageable pageable = PageRequest.of(page, size, sort);

        Specification<Shoes> spec = Specification.where(null);

        if (type != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("type"), type));
        }
        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }
        if (material != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("material"), material));
        }
        if (sizeShoes != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizeBall"), sizeShoes));
        }

        return shoesRep.findAll(spec, pageable).getContent();
    }

    public Shoes getShoesById(Long id) {

        return shoesRep.findById(id).orElse(null);

    }

}
