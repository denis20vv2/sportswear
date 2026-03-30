package sportswear.sportswear.core.menu.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.menu.domain.MenuItem;
import sportswear.sportswear.core.page.domain.Page;

import java.util.List;

@Repository
public interface MenuItemRep extends JpaRepository<MenuItem, Long> {

    List<MenuItem> findByParentIsNull();

}
