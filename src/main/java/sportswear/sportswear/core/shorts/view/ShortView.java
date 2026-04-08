package sportswear.sportswear.core.shorts.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.accessories.baseview.BaseView;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.shorts.domain.Shorts;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShortView extends BaseView {

    private List<Shorts> items;

}
