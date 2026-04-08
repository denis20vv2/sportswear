package sportswear.sportswear.core.protectivecloth.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.accessories.baseview.BaseView;
import sportswear.sportswear.core.protectivecloth.domain.ProtectiveCloth;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProtectiveClothView extends BaseView {

    private List<ProtectiveCloth> items;

}
