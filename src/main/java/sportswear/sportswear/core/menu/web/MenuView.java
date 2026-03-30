package sportswear.sportswear.core.menu.web;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.menu.domain.MenuItem;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuView {

    private Long id;

    private String title;

    private String path;

    private Long pageId;

    private List<MenuView> children = new ArrayList<>();

}
