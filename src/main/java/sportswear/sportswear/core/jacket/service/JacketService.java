package sportswear.sportswear.core.jacket.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.accessories.view.AccessoriesView;
import sportswear.sportswear.core.jacket.domain.Jacket;
import sportswear.sportswear.core.jacket.rep.JacketRep;
import sportswear.sportswear.core.jacket.view.JacketView;

import java.util.List;

@Service
@AllArgsConstructor
public class JacketService {

    private final JacketRep jacketRep;

    public JacketView getJackets(int page, int size,
                                   String sizeJacket,
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

        Specification<Jacket> spec = Specification.where(null);

        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }

        if (material != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("material"), material));
        }

        if (sizeJacket != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizeJacket"), sizeJacket));
        }

        JacketView jacketView = new JacketView();
        jacketView.setItems(jacketRep.findAll(spec, pageable).getContent());
        jacketView.setCount(jacketRep.findAll(spec, pageable).getTotalElements());

        return jacketView;
    }

    public Jacket getJacketById(Long id) {
        return jacketRep.findById(id).orElse(null);
    }
}
