package sportswear.sportswear.core.jacket.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.accessories.baseview.BaseView;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.jacket.domain.Jacket;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JacketView extends BaseView {

    private List<Jacket> items;

}
