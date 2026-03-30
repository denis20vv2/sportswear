package sportswear.sportswear.core.gloves.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.gloves.domain.Gloves;
import sportswear.sportswear.core.gloves.service.GlovesService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "gloves")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class GlovesController {

    private final GlovesService glovesService;

    @GetMapping("/getGloves")
    @ResponseBody
    @Operation(
            summary = "Получение списка перчаток",
            description = "Позволяет получить список перчаток"
    )
    public List<Gloves> getGloves(
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String colour,
            @RequestParam(required = false) String sizeGloves,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) String direction) {

        return glovesService.getGloves(page, size, type, colour, sizeGloves, sortBy, direction);
    }

    @GetMapping("/getGloves/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение перчаток по id",
            description = "Позволяет получить информацию о перчатках по id"
    )
    public Gloves getById(@PathVariable Long id) {
        return glovesService.getById(id);
    }
}
