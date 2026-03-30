package sportswear.sportswear.core.sportsunderwear.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.sportsunderwear.domain.SportsUnderwear;
import sportswear.sportswear.core.sportsunderwear.rep.SportsUnderwearRep;

import java.util.List;

@Service
@AllArgsConstructor
public class SportsUnderwearService {

    private final SportsUnderwearRep sportsUnderwearRep;

    public List<SportsUnderwear> getSportsUnderwear(int page, int size,
                                                    String sizeSportsUnderwear,
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

        Specification<SportsUnderwear> spec = Specification.where(null);

        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }

        if (material != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("material"), material));
        }

        if (sizeSportsUnderwear != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizeSportsUnderwear"), sizeSportsUnderwear));
        }

        return sportsUnderwearRep.findAll(spec, pageable).getContent();
    }

    public SportsUnderwear getById(Long id) {
        return sportsUnderwearRep.findById(id).orElse(null);
    }
}
