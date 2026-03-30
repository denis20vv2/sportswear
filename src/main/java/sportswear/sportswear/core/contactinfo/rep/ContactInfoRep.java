package sportswear.sportswear.core.contactinfo.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.contactinfo.domain.ContactInfo;

@Repository
public interface ContactInfoRep extends JpaRepository<ContactInfo, Long> {
}




