package sportswear.sportswear.core.page.web;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.contactinfo.domain.ContactInfo;
import sportswear.sportswear.core.filter.domain.FilterParam;
import sportswear.sportswear.core.product.domain.Product;
import sportswear.sportswear.core.product.view.ProductView;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageView {

    private Long id;
    private String pageName;
    private List<ProductView> products;
    private ContactInfo contactInfo;
    private FilterParam filterParam;

}
