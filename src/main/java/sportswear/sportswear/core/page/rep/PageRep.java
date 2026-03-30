package sportswear.sportswear.core.page.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.contactinfo.domain.ContactInfo;
import sportswear.sportswear.core.page.domain.Page;

@Repository
public interface PageRep extends JpaRepository<Page, Long> {
}
