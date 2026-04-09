package sportswear.sportswear.core.order.web;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.order.domain.Order;
import sportswear.sportswear.core.order.service.OrderService;

import java.util.Map;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<Void> saveOrders(@RequestBody Order order) {
        orderService.saveOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
