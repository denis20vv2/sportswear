package sportswear.sportswear.core.sportsunderwear.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.sportsunderwear.domain.SportsUnderwear;
import sportswear.sportswear.core.sportsunderwear.service.SportsUnderwearService;
import sportswear.sportswear.core.sportsunderwear.view.SportsUnderwearView;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "sports_underwear")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class SportsUnderwearController {

    private final SportsUnderwearService sportsUnderwearService;

    @GetMapping("/sports-underwear")
    @ResponseBody
    @Operation(
            summary = "Получение списка спортивного белья",
            description = "Возвращает список спортивного белья с возможностью фильтрации по размеру, цвету, материалу и сортировки"
    )
    public SportsUnderwearView getSportsUnderwear(
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false) String sizeSportsUnderwear,
            @RequestParam(required = false) String colour,
            @RequestParam(required = false) String material,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) String direction) {

        return sportsUnderwearService.getSportsUnderwear(page, size, sizeSportsUnderwear, colour, material, sortBy, direction);
    }

    @GetMapping("/sports-underwear/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение спортивного белья по ID",
            description = "Возвращает информацию о спортивном белье по его идентификатору"
    )
    public SportsUnderwear getById(@PathVariable Long id) {
        return sportsUnderwearService.getById(id);
    }
}
