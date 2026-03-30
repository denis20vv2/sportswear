package sportswear.sportswear.core.accessories.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.accessories.domain.Accessories;
import sportswear.sportswear.core.accessories.service.AccessoriesService;
import sportswear.sportswear.core.shoes.domain.Shoes;
import sportswear.sportswear.core.shoes.service.ShoesService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name="accessories")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class AccessoriesWeb {

    private final AccessoriesService accessoriesService;

    @GetMapping("/getAccessories")
    @ResponseBody
    @Operation(
            summary = "Получение списка аксессуаров",
            description = "Позволяет получить список аксессуаров"
    )
    public List<Accessories> getAccessories(@RequestParam(required = false, defaultValue = "10") int size, @RequestParam(required = false, defaultValue = "0") int page, @RequestParam(required = false) Integer sizeShoes, @RequestParam(required = false) String type, @RequestParam(required = false) String colour, @RequestParam(required = false) String material, @RequestParam(required = false) String sortBy, @RequestParam(required = false) String direction){
        return accessoriesService.getAccessories(page, size, sizeShoes, type, colour, sortBy, direction);
    }

    @GetMapping("/getAccessories/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение аксессуаров по id",
            description = "Позволяет получить информацию об аксессуаре по id"
    )
    public Accessories getAccessoriesById(@PathVariable Long id) {
        return accessoriesService.getAccessoriesById(id);
    }

}
