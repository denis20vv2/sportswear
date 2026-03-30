package sportswear.sportswear.core.gloves.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.gloves.rep.GlovesRep;
import sportswear.sportswear.core.gloves.domain.Gloves;

import java.util.List;

@Service
@AllArgsConstructor
public class GlovesService {

    private final GlovesRep glovesRep;

    public List<Gloves> getGloves(int page, int size,
                                  String type, String colour,
                                  String sizeGloves,
                                  String sortBy, String direction) {

        Sort sort = Sort.unsorted();
        if (sortBy != null) {
            sort = direction != null && direction.equalsIgnoreCase("desc")
                    ? Sort.by(sortBy).descending()
                    : Sort.by(sortBy).ascending();
        }

        Pageable pageable = PageRequest.of(page, size, sort);
        Specification<Gloves> spec = Specification.where(null);

        if (type != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("type"), type));
        }
        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }
        if (sizeGloves != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizeGloves"), sizeGloves));
        }

        return glovesRep.findAll(spec, pageable).getContent();
    }

    public Gloves getById(Long id) {
        return glovesRep.findById(id).orElse(null);
    }
}
