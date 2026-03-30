package sportswear.sportswear.core.tshirts.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.tshirts.domain.TShirts;
import sportswear.sportswear.core.tshirts.rep.TShirtsRep;

import java.util.List;

@Service
@AllArgsConstructor
public class TShirtsService {

    private final TShirtsRep tShirtsRep;

    public List<TShirts> getTShirts(int page, int size, Integer sizeTShirts,
                                    String type, String colour, String material,
                                    String printType,
                                    String sortBy, String direction) {

        Sort sort = Sort.unsorted();
        if (sortBy != null) {
            sort = direction != null && direction.equalsIgnoreCase("desc")
                    ? Sort.by(sortBy).descending()
                    : Sort.by(sortBy).ascending();
        }

        Pageable pageable = PageRequest.of(page, size, sort);
        Specification<TShirts> spec = Specification.where(null);

        if (type != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("type"), type));
        }
        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }
        if (material != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("material"), material));
        }
        if (printType != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("printType"), printType));
        }
        if (sizeTShirts != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizeTShirts"), sizeTShirts));
        }

        return tShirtsRep.findAll(spec, pageable).getContent();
    }

    public TShirts getTShirtsById(Long id) {
        return tShirtsRep.findById(id).orElse(null);
    }
}
