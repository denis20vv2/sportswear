package sportswear.sportswear.core.gaiters.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.accessories.baseview.BaseView;
import sportswear.sportswear.core.ball.domain.Ball;
import sportswear.sportswear.core.gaiters.domain.Gaiters;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GaitersView extends BaseView {

    private List<Gaiters> items;

}
