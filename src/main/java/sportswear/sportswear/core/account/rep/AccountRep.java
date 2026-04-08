package sportswear.sportswear.core.account.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportswear.sportswear.core.account.domain.Account;
import sportswear.sportswear.core.filter.domain.FilterParam;

import java.util.Optional;

@Repository
public interface AccountRep extends JpaRepository<Account, Long> {

    Optional<Account> findByPhoneNumber(String phoneNumber);

    boolean existsByPhoneNumber(String phoneNumber);

}
