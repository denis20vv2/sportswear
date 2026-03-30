package sportswear.sportswear.core.product.view;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductView {

    private Long id;
    private String name;
    private Double price;
    private String imageUrl;
    private String path;

}
