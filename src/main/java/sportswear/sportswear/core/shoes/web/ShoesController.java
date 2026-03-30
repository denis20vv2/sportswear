package sportswear.sportswear.core.shoes.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.shoes.domain.Shoes;
import sportswear.sportswear.core.shoes.service.ShoesService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name="shoes")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class ShoesController {

    private final ShoesService shoesService;

    @GetMapping("/getShoes")
    @ResponseBody
    @Operation(
            summary = "Получение списка обуви",
            description = "Позволяет получить список обуви"
    )
    public List<Shoes> getShoes(@RequestParam(required = false, defaultValue = "10") int size, @RequestParam(required = false, defaultValue = "0") int page, @RequestParam(required = false) Integer sizeShoes, @RequestParam(required = false) String type, @RequestParam(required = false) String colour, @RequestParam(required = false) String material, @RequestParam(required = false) String sortBy, @RequestParam(required = false) String direction){
        return shoesService.getShoes(page, size, sizeShoes, type, colour, material, sortBy, direction);
    }

    @GetMapping("/getShoes/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение обуви по id",
            description = "Позволяет получить информацию об обуви по id"
    )
    public Shoes getShoesById(@PathVariable Long id) {
        return shoesService.getShoesById(id);
    }


}
