package sportswear.sportswear.core.order.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.order.domain.Order;
import sportswear.sportswear.core.order.rep.OrderRep;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRep orderRep;

    @Transactional
    public Order saveOrder(Order order) {

        return orderRep.save(order);
    }

}
