package sportswear.sportswear.core.pants.domain;

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
@Table(name = "pants")
public class Pants {

    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Double price;

    @NotNull
    private String imageUrl;

    @NotNull
    private String sizePants;

    @NotNull
    private String material;

    @NotNull
    private String colour;


    @NotNull
    private String description;
}
