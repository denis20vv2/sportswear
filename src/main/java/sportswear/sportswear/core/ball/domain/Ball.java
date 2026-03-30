package sportswear.sportswear.core.ball.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sportswear.sportswear.core.page.domain.Page;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "ball")
public class Ball {

    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Double price;

    @NotNull
    private String imageUrl;

    @NotNull
    private Integer sizeBall;

    @NotNull
    private String type;

    @NotNull
    private String colour;

    @NotNull
    private String material;

    @NotNull
    private String description;

}
