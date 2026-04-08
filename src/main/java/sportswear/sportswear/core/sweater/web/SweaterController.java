package sportswear.sportswear.core.sweater.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.sweater.domain.Sweater;
import sportswear.sportswear.core.sweater.service.SweaterService;
import sportswear.sportswear.core.sweater.view.SweaterView;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "sweater")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class SweaterController {

    private final SweaterService sweaterService;

    @GetMapping("/sweaters")
    @ResponseBody
    @Operation(
            summary = "Получение списка свитеров",
            description = "Возвращает список свитеров с возможностью фильтрации по размеру, цвету, материалу и сортировки"
    )
    public SweaterView getSweaters(
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false) String sizeSweater,
            @RequestParam(required = false) String colour,
            @RequestParam(required = false) String material,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) String direction) {

        return sweaterService.getSweaters(page, size, sizeSweater, colour, material, sortBy, direction);
    }

    @GetMapping("/sweaters/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение свитера по ID",
            description = "Возвращает информацию о свитере по его идентификатору"
    )
    public Sweater getSweaterById(@PathVariable Long id) {
        return sweaterService.getSweaterById(id);
    }
}
