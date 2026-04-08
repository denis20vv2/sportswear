package sportswear.sportswear.core.sportsunderwear.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.accessories.baseview.BaseView;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.sportsunderwear.domain.SportsUnderwear;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SportsUnderwearView extends BaseView {

    private List<SportsUnderwear> items;

}
