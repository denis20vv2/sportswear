package sportswear.sportswear.core.inventory.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.accessories.baseview.BaseView;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.inventory.domain.Inventory;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InventoryView extends BaseView {

    private List<Inventory> items;

}

