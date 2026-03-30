package sportswear.sportswear.core.protectivecloth.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.protectivecloth.domain.ProtectiveCloth;
import sportswear.sportswear.core.protectivecloth.rep.ProtectiveClothRep;

import java.util.List;

@Service
@AllArgsConstructor
public class ProtectiveClothService {

    private final ProtectiveClothRep protectiveClothRep;

    public List<ProtectiveCloth> getProtectiveCloth(int page, int size,
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
        Specification<ProtectiveCloth> spec = Specification.where(null);

        if (type != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("type"), type));
        }
        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }
        if (sizeProduct != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizeProduct"), sizeProduct));
        }

        return protectiveClothRep.findAll(spec, pageable).getContent();
    }

    public ProtectiveCloth getById(Long id) {
        return protectiveClothRep.findById(id).orElse(null);
    }
}
