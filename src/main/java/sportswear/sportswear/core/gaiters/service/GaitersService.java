package sportswear.sportswear.core.gaiters.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.accessories.view.AccessoriesView;
import sportswear.sportswear.core.gaiters.domain.Gaiters;
import sportswear.sportswear.core.gaiters.rep.GaitersRep;
import sportswear.sportswear.core.gaiters.view.GaitersView;

import java.util.List;

@Service
@AllArgsConstructor
public class GaitersService {

    private final GaitersRep gaitersRep;

    public GaitersView getGaiters(int page, int size,
                                        String type, String colour,
                                        String sizeProduct,
                                        String sortBy, String direction) {

        Sort sort = Sort.unsorted();
        if (sortBy != null) {
            sort = direction != null && direction.equalsIgnoreCase("desc")
                    ? Sort.by(sortBy).descending()
                    : Sort.by(sortBy).ascending();
        }

        Pageable pageable = PageRequest.of(page, size, sort);
        Specification<Gaiters> spec = Specification.where(null);

        if (type != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("type"), type));
        }
        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }
        if (sizeProduct != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizeProduct"), sizeProduct));
        }
        GaitersView gaitersView = new GaitersView();
        gaitersView.setItems(gaitersRep.findAll(spec, pageable).getContent());
        gaitersView.setCount(gaitersRep.findAll(spec, pageable).getTotalElements());

        return gaitersView;
    }

    public Gaiters getById(Long id) {
        return gaitersRep.findById(id).orElse(null);
    }
}
