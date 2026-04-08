package sportswear.sportswear.core.ball.service;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.accessories.view.AccessoriesView;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.ball.rep.BallRep;
import org.springframework.data.domain.Sort;
import sportswear.sportswear.core.ball.view.BallView;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BallService {

    private final BallRep ballRep;

    public BallView getBall(int page, int size, Integer sizeBall, String type, String colour, String material, String sortBy, String direction) {

        Sort sort = Sort.unsorted();

        if (sortBy != null) {
            sort = direction != null && direction.equalsIgnoreCase("desc")
                    ? Sort.by(sortBy).descending()
                    : Sort.by(sortBy).ascending();
        }

        Pageable pageable = PageRequest.of(page, size, sort);

        Specification<Ball> spec = Specification.where(null);

        if (type != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("type"), type));
        }
        if (colour != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("colour"), colour));
        }
        if (material != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("material"), material));
        }
        if (sizeBall != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("sizeBall"), sizeBall));
        }
        BallView ballView = new BallView();
        ballView.setItems(ballRep.findAll(spec, pageable).getContent());
        ballView.setCount(ballRep.findAll(spec, pageable).getTotalElements());

        return ballView;
    }

    public Ball getBallById(Long id) {

        return ballRep.findById(id).orElse(null);

    }

}
