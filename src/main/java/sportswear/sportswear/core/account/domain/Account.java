package sportswear.sportswear.core.account.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account")
public class Account {

    @Id
    @SequenceGenerator(
            name = "account_seq",
            sequenceName = "account_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq")
    private Long id;

    private String username;

    private String phoneNumber;

    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private List<Map<String,Object>> basket;

    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private List<Map<String,Object>> orders;

}
