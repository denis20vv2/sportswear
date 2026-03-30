package sportswear.sportswear.core.accessories.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.accessories.domain.Accessories;
import sportswear.sportswear.core.accessories.rep.AccessoriesRep;
import sportswear.sportswear.core.shoes.domain.Shoes;

import java.util.List;

@Service
@AllArgsConstructor
public class AccessoriesService {

    private final AccessoriesRep accessoriesRep;

    public List<Accessories> getAccessories(int page, int size, Integer sizeProduct, String type, String colour, String sortBy, String direction) {
        Sort sort = Sort.unsorted();
        if (sortBy != null) {
            sort = direction != null && direction.equalsIgnoreCase("desc")
                    ? Sort.by(sortBy).descending()
                    : Sort.by(sortBy).ascending();
        }

        Pageable pageable = PageRequest.of(page, size, sort);

        Specification<Accessories> spec = Specification.where(null);

        if (type != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("type"), type));
        }
        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }
        if (sizeProduct != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizeBall"), sizeProduct));
        }

        return accessoriesRep.findAll(spec, pageable).getContent();
    }

    public Accessories getAccessoriesById(Long id) {

        return accessoriesRep.findById(id).orElse(null);

    }

}
