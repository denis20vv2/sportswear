package sportswear.sportswear.core.jacket.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.jacket.domain.Jacket;
import sportswear.sportswear.core.jacket.service.JacketService;
import sportswear.sportswear.core.jacket.view.JacketView;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "jacket")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class JacketController {

    private final JacketService jacketService;

    @GetMapping("/jackets")
    @ResponseBody
    @Operation(
            summary = "Получение списка курток",
            description = "Возвращает список курток с возможностью фильтрации по размеру, цвету, материалу и сортировки"
    )
    public JacketView getJackets(
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false) String sizeJacket,
            @RequestParam(required = false) String colour,
            @RequestParam(required = false) String material,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) String direction) {

        return jacketService.getJackets(page, size, sizeJacket, colour, material, sortBy, direction);
    }

    @GetMapping("/jackets/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение куртки по ID",
            description = "Возвращает информацию о конкретной куртке по её идентификатору"
    )
    public Jacket getJacketById(@PathVariable Long id) {
        return jacketService.getJacketById(id);
    }
}
