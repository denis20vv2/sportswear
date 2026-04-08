package sportswear.sportswear.core.ball.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.ball.service.BallService;
import sportswear.sportswear.core.ball.view.BallView;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "ball")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class BallController {

    private final BallService ballService;

    @GetMapping("/ball")
    @ResponseBody
    @Operation(
            summary = "Получение списка мячей",
            description = "Позволяет получить список мячей"
    )
    public BallView getBall(@RequestParam(required = false, defaultValue = "10") int size, @RequestParam(required = false, defaultValue = "0") int page, @RequestParam(required = false) Integer sizeBall, @RequestParam(required = false) String type, @RequestParam(required = false) String colour, @RequestParam(required = false) String material, @RequestParam(required = false) String sortBy, @RequestParam(required = false) String direction) {
        return ballService.getBall(page, size, sizeBall, type, colour, material, sortBy, direction);
    }

    @GetMapping("/ball/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение объекта мяч по id",
            description = "Позволяет получить информацию о мяче по id"
    )
    public Ball getBallById(@PathVariable Long id) {
        return ballService.getBallById(id);
    }

}
