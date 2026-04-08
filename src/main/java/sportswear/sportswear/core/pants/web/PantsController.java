package sportswear.sportswear.core.pants.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.pants.domain.Pants;
import sportswear.sportswear.core.pants.service.PantsService;
import sportswear.sportswear.core.pants.view.PantsView;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "pants")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class PantsController {

    private final PantsService pantsService;

    @GetMapping("/pants")
    @ResponseBody
    @Operation(
            summary = "Получение списка брюк",
            description = "Возвращает список брюк с возможностью фильтрации по размеру, цвету, материалу и сортировки"
    )
    public PantsView getPants(
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false) String sizePants,
            @RequestParam(required = false) String colour,
            @RequestParam(required = false) String material,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) String direction) {

        return pantsService.getPants(page, size, sizePants, colour, material, sortBy, direction);
    }

    @GetMapping("/pants/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение брюк по ID",
            description = "Возвращает информацию о брюках по их идентификатору"
    )
    public Pants getPantsById(@PathVariable Long id) {
        return pantsService.getPantsById(id);
    }
}