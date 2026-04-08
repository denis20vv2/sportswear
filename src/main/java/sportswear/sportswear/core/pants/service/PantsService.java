package sportswear.sportswear.core.pants.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.accessories.view.AccessoriesView;
import sportswear.sportswear.core.pants.domain.Pants;
import sportswear.sportswear.core.pants.rep.PantsRep;
import sportswear.sportswear.core.pants.view.PantsView;

import java.util.List;

@Service
@AllArgsConstructor
public class PantsService {

    private final PantsRep pantsRep;

    public PantsView getPants(int page, int size,
                              String sizePants,
                              String colour,
                              String material,
                              String sortBy,
                              String direction) {

        Sort sort = Sort.unsorted();
        if (sortBy != null) {
            sort = direction != null && direction.equalsIgnoreCase("desc")
                    ? Sort.by(sortBy).descending()
                    : Sort.by(sortBy).ascending();
        }

        Pageable pageable = PageRequest.of(page, size, sort);

        Specification<Pants> spec = Specification.where(null);

        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }

        if (material != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("material"), material));
        }

        if (sizePants != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizePants"), sizePants));
        }

        PantsView pantsView = new PantsView();
        pantsView.setItems(pantsRep.findAll(spec, pageable).getContent());
        pantsView.setCount(pantsRep.findAll(spec, pageable).getTotalElements());

        return pantsView;
    }

    public Pants getPantsById(Long id) {
        return pantsRep.findById(id).orElse(null);
    }
}
