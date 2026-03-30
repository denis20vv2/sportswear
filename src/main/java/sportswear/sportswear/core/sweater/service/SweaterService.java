package sportswear.sportswear.core.sweater.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.sweater.domain.Sweater;
import sportswear.sportswear.core.sweater.rep.SweaterRep;

import java.util.List;

@Service
@AllArgsConstructor
public class SweaterService {

    private final SweaterRep sweaterRep;

    public List<Sweater> getSweaters(int page, int size,
                                     String sizeSweater,
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

        Specification<Sweater> spec = Specification.where(null);

        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }

        if (material != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("material"), material));
        }

        if (sizeSweater != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizeSweater"), sizeSweater));
        }

        return sweaterRep.findAll(spec, pageable).getContent();
    }

    public Sweater getSweaterById(Long id) {
        return sweaterRep.findById(id).orElse(null);
    }
}
