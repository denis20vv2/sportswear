package sportswear.sportswear.core.account.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sportswear.sportswear.core.account.domain.Account;
import sportswear.sportswear.core.account.rep.AccountRep;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRep accountRep;

    @Transactional
    public Account createAccount(String phoneNumber, String username) {
        Optional<Account> existingAccount = accountRep.findByPhoneNumber(phoneNumber);

        if (existingAccount.isPresent()) {
            return existingAccount.get();
        }

        Account account = new Account();
        account.setPhoneNumber(phoneNumber);
        account.setUsername(username);
        account.setBasket(new ArrayList<>());
        account.setOrders(new ArrayList<>());

        return accountRep.save(account);
    }

}
