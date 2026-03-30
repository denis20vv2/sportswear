package sportswear.sportswear.core.page.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.contactinfo.domain.ContactInfo;
import sportswear.sportswear.core.filter.domain.FilterParam;
import sportswear.sportswear.core.product.domain.Product;

import java.util.List;

@Entity
@Table(name = "page")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Page {

    @Id
    @Column(nullable = false)
    private Long id;

    @Column(name = "page_name")
    private String pageName;

    @OneToMany(mappedBy = "page", cascade = CascadeType.ALL)
    private List<Product> products;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_info_id")
    private ContactInfo contactInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "filter_id")
    private FilterParam filterParam;
}
