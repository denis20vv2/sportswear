package sportswear.sportswear.core.gloves.domain;

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
@Table(name = "gloves")
public class Gloves {

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

    @NotNull
    private String colour;

    @NotNull
    private String sizeGloves;

    @NotNull
    private String description;

}
