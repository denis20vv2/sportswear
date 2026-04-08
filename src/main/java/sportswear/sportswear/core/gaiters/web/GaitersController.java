package sportswear.sportswear.core.gaiters.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.gaiters.domain.Gaiters;
import sportswear.sportswear.core.gaiters.service.GaitersService;
import sportswear.sportswear.core.gaiters.view.GaitersView;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "gaiters")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class GaitersController {

    private final GaitersService gaitersService;

    @GetMapping("/getGaiters")
    @ResponseBody
    @Operation(
            summary = "Получение списка гамаш",
            description = "Позволяет получить список гамаш"
    )
    public GaitersView getGaiters(
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String colour,
            @RequestParam(required = false) String sizeProduct,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) String direction) {

        return gaitersService.getGaiters(page, size, type, colour, sizeProduct, sortBy, direction);
    }

    @GetMapping("/getGaiters/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение гольфов по id",
            description = "Позволяет получить информацию о гольфах по id"
    )
    public Gaiters getById(@PathVariable Long id) {
        return gaitersService.getById(id);
    }
}
