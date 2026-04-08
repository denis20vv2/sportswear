package sportswear.sportswear.core.shoes.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.accessories.baseview.BaseView;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.shoes.domain.Shoes;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShoesView extends BaseView {

    private List<Shoes> items;

}
