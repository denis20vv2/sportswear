package sportswear.sportswear.core.sweater.domain;

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
@Table(name = "sweater")
public class Sweater {

    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Double price;

    @NotNull
    private String imageUrl;

    @NotNull
    private String sizeSweater;

    @NotNull
    private String material;

    @NotNull
    private String colour;

    @NotNull
    private String description;
}
