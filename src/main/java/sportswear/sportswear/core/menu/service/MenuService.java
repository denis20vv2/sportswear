package sportswear.sportswear.core.menu.service;

import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.menu.domain.MenuItem;
import sportswear.sportswear.core.menu.rep.MenuItemRep;
import sportswear.sportswear.core.menu.web.MenuView;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuItemRep menuItemRep;

    @Transactional(readOnly = true)
    public List<MenuView> getMenu() {
        return menuItemRep.findByParentIsNull()
                .stream()
                .map(this::toView)
                .toList();
    }

    private MenuView toView(MenuItem entity) {

        MenuView view = new MenuView();
        view.setId(entity.getId());
        view.setTitle(entity.getTitle());
        view.setPath(entity.getPath());
        view.setPageId(entity.getPageId());

        if (entity.getChildren() != null && !entity.getChildren().isEmpty()) {
            view.setChildren(
                    entity.getChildren()
                            .stream()
                            .map(this::toView)
                            .toList()
            );
        }

        return view;
    }

}
