package sportswear.sportswear.core.page.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sportswear.sportswear.core.page.service.PageService;

@RestController
@RequestMapping("/api")
@Tag(name="page")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3333")
public class PageController {

    private static final Logger logger = LoggerFactory.getLogger(PageController.class);
    private final PageService pageService;

    @GetMapping("/page/{id}")
    @ResponseBody
    @Operation(
            summary = "Получение страницы по id",
            description = "Позволяет найти страницу по id"
    )
    public PageView getPageById(@PathVariable Long id) {
        logger.info("Получен запрос на получение страницы с id: {}", id);
        return pageService.getBook(id);
    }

}
