package sportswear.sportswear.core.tshirts.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.tshirts.domain.TShirts;
import sportswear.sportswear.core.tshirts.service.TShirtsService;
import sportswear.sportswear.core.tshirts.view.TShirtsView;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "tshirts")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class TShirtsController {

    private final TShirtsService tShirtsService;

    @GetMapping("/getTShirts")
    @ResponseBody
    @Operation(
            summary = "Получение списка футболок",
            description = "Позволяет получить список футболок"
    )
    public TShirtsView getTShirts(
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false) Integer sizeTShirts,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String colour,
            @RequestParam(required = false) String material,
            @RequestParam(required = false) String printType,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) String direction) {

        return tShirtsService.getTShirts(page, size, sizeTShirts, type, colour, material, printType, sortBy, direction);
    }

    @GetMapping("/getTShirts/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение футболки по id",
            description = "Позволяет получить информацию о футболке по id"
    )
    public TShirts getTShirtsById(@PathVariable Long id) {
        return tShirtsService.getTShirtsById(id);
    }
}
