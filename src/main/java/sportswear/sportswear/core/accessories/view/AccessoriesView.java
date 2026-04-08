package sportswear.sportswear.core.accessories.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.accessories.baseview.BaseView;
import sportswear.sportswear.core.accessories.domain.Accessories;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccessoriesView extends BaseView {

   private List<Accessories> items ;

}
