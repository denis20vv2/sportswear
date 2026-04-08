package sportswear.sportswear.core.ball.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.accessories.baseview.BaseView;
import sportswear.sportswear.core.accessories.domain.Accessories;
import sportswear.sportswear.core.ball.domain.Ball;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BallView extends BaseView {

    private List<Ball> items;

}
