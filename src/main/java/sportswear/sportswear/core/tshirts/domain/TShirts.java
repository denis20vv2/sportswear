package sportswear.sportswear.core.tshirts.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tshirts")
public class TShirts {

    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String type;

    @NotNull
    private Double price;

    @NotNull
    private String imageUrl;

    @Column(name = "size_t_shirts")
    @NotNull
    private String sizeTShirts;

    @NotNull
    private String material;

    @NotNull
    private String colour;

    @NotNull
    private String printType;

    @NotNull
    private String description;

}
