package sportswear.sportswear.core.protectivecloth.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.protectivecloth.domain.ProtectiveCloth;
import sportswear.sportswear.core.protectivecloth.service.ProtectiveClothService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "protective_cloth")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class ProtectiveClothController {

    private final ProtectiveClothService protectiveClothService;

    @GetMapping("/getProtectiveCloth")
    @ResponseBody
    @Operation(
            summary = "Получение списка защитной одежды",
            description = "Позволяет получить список защитной одежды"
    )
    public List<ProtectiveCloth> getProtectiveCloth(
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String colour,
            @RequestParam(required = false) String sizeProduct,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) String direction) {

        return protectiveClothService.getProtectiveCloth(page, size, type, colour, sizeProduct, sortBy, direction);
    }

    @GetMapping("/getProtectiveCloth/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение защитной одежды по id",
            description = "Позволяет получить информацию о защитной одежде по id"
    )
    public ProtectiveCloth getById(@PathVariable Long id) {
        return protectiveClothService.getById(id);
    }
}
