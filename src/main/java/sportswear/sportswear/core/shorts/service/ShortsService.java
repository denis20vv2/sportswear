package sportswear.sportswear.core.shorts.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.accessories.view.AccessoriesView;
import sportswear.sportswear.core.shorts.domain.Shorts;
import sportswear.sportswear.core.shorts.rep.ShortsRep;
import sportswear.sportswear.core.shorts.view.ShortView;

import java.util.List;

@Service
@AllArgsConstructor
public class ShortsService {

    private final ShortsRep shortsRep;

    public ShortView getShorts(int page, int size, Integer sizeShorts,
                               String type, String colour, String material,
                               String sortBy, String direction) {

        Sort sort = Sort.unsorted();
        if (sortBy != null) {
            sort = direction != null && direction.equalsIgnoreCase("desc")
                    ? Sort.by(sortBy).descending()
                    : Sort.by(sortBy).ascending();
        }

        Pageable pageable = PageRequest.of(page, size, sort);
        Specification<Shorts> spec = Specification.where(null);

        if (type != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("type"), type));
        }
        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }
        if (material != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("material"), material));
        }
        if (sizeShorts != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizeShorts"), sizeShorts));
        }

        ShortView shortView = new ShortView();
        shortView.setItems(shortsRep.findAll(spec, pageable).getContent());
        shortView.setCount(shortsRep.findAll(spec, pageable).getTotalElements());

        return shortView;
    }

    public Shorts getShortsById(Long id) {
        return shortsRep.findById(id).orElse(null);
    }
}
