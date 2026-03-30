package sportswear.sportswear.core.inventory.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.inventory.domain.Inventory;
import sportswear.sportswear.core.inventory.rep.InventoryRep;
import sportswear.sportswear.core.inventory.service.InventoryService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name="inventory")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/getInventory")
    @ResponseBody
    @Operation(
            summary = "Получение списка инвентаря",
            description = "Позволяет получить список инвентаря"
    )
    public List<Inventory> getInventory(@RequestParam(required = false, defaultValue = "10") int size, @RequestParam(required = false, defaultValue = "0") int page, @RequestParam(required = false) String colour, @RequestParam(required = false)   String sortBy, @RequestParam(required = false)  String direction){

        return inventoryService.getInventory(page, size, colour, sortBy, direction);

    }

    @GetMapping("/getInventory/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение инвентаря по id",
            description = "Позволяет получить информацию об инвентаре по id"
    )
    public Inventory getInventoryById(@PathVariable Long id) {
        return inventoryService.getInventoryById(id);

    }

}
