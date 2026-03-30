package sportswear.sportswear.core.menu.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.menu.service.MenuService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name="menu")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class MenuController {

    private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
    private final MenuService menuService;

    @GetMapping("/menu")
    @ResponseBody
    @Operation(
            summary = "Получение бокового меню",
            description = "Позволяет получить боковое меню"
    )
    public List<MenuView> getPageById() {
        logger.info("Получен запрос на получение меню");
        return menuService.getMenu();
    }

}
