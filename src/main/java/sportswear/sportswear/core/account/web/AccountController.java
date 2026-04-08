package sportswear.sportswear.core.account.web;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sportswear.sportswear.core.account.domain.Account;
import sportswear.sportswear.core.account.service.AccountService;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/getId")
    public ResponseEntity<Map<String, Long>> register(@RequestBody RegisterRequest request) {
        Account account = accountService.createAccount(request.getPhoneNumber(), request.getUsername());
        return ResponseEntity.ok(Map.of("id", account.getId()));
    }

}
