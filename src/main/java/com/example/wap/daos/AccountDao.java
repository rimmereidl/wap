package com.example.wap.daos;


import com.example.wap.models.Account;
import com.example.wap.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@Component
@RestController
public class AccountDao {
  @Autowired
  AccountRepository accountRepository;
  @GetMapping("/findAllAccounts")
  public Iterable<Account> findAllAccounts() {
    return accountRepository.findAll();
  }
  @GetMapping("/findAccountByNumber/{number}")
  public Account findAccountByNumber(
          @PathVariable("number") Integer number) {
    return accountRepository.findById(number).get();
  }
  @GetMapping("/deleteAccount/{number}")
  public void deleteAccount(
          @PathVariable("number") Integer number) {
    accountRepository.deleteById(number);
  }
  @GetMapping("/createAccount")
  public Account createAccount() {
    Account account = new Account();
    account.setState("Active");
    return accountRepository.save(account);
  }
  @GetMapping("/changeAccountState/{number}/{newState}")
  public Account changeAccountState(
          @PathVariable("number") Integer Number,
          @PathVariable("newState") String newState) {
    Account account = accountRepository.findById(Number).get();
    account.setState(newState);
    return accountRepository.save(account);
  }
}
