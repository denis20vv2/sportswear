package sportswear.sportswear.core.shorts.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.shorts.domain.Shorts;
import sportswear.sportswear.core.shorts.service.ShortsService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "shorts")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class ShortsController {

    private final ShortsService shortsService;

    @GetMapping("/getShorts")
    @ResponseBody
    @Operation(
            summary = "Получение списка шорт",
            description = "Позволяет получить список шорт"
    )
    public List<Shorts> getShorts(
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false) Integer sizeShorts,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String colour,
            @RequestParam(required = false) String material,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) String direction) {

        return shortsService.getShorts(page, size, sizeShorts, type, colour, material, sortBy, direction);
    }

    @GetMapping("/getShorts/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение шорт по id",
            description = "Позволяет получить информацию о шортах по id"
    )
    public Shorts getShortsById(@PathVariable Long id) {
        return shortsService.getShortsById(id);
    }
}