package sportswear.sportswear.core.contactinfo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "contact_info")
@NoArgsConstructor
@AllArgsConstructor
public class ContactInfo {

    @Id
    private Long id;

    private String phone;
    private String email;
    private String address;
    private String telegram;
    private String vk;

}
