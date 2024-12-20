package net.ouabane.bankaccountservice.web;

import net.ouabane.bankaccountservice.dto.BankAccountRequestDTO;
import net.ouabane.bankaccountservice.dto.BankAccountResponseDTO;
import net.ouabane.bankaccountservice.exceptions.BankAccountNotFoundException;
import net.ouabane.bankaccountservice.repositories.BankAccountRepository;
import net.ouabane.bankaccountservice.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountRestController {
    BankAccountRepository bankAccountRepository;
    AccountService accountService;
    public AccountRestController(BankAccountRepository bankAccountRepository, AccountService accountService) {
        this.bankAccountRepository = bankAccountRepository;
        this.accountService = accountService;
    }

    @GetMapping("/bankAccounts") //refactoring done
    public List<BankAccountResponseDTO> bankAccounts(){
        return accountService.getAllAccounts();
    }
    @GetMapping("/bankAccounts/{id}")// refactoring done
    public BankAccountResponseDTO bankAccount(@PathVariable String id) throws BankAccountNotFoundException {
        return accountService.getAccountById(id);
    }
    @PostMapping("/bankAccounts") //refactoring done
    public BankAccountResponseDTO saveAccount(@RequestBody BankAccountRequestDTO bankAccountRequestDTO){
        return accountService.addAccount(bankAccountRequestDTO);
    }
    @PutMapping("/bankAccounts/{id}")//refactoring done
    public BankAccountResponseDTO updateAccount(@RequestBody BankAccountRequestDTO bankAccountRequestDTO, @PathVariable String id) throws BankAccountNotFoundException {
        return accountService.updateAccount(bankAccountRequestDTO, id);
    }
    @DeleteMapping("/bankAccounts/{id}")//refactoring done
    public void deleteAccount(@PathVariable String id) throws BankAccountNotFoundException {
        accountService.deleteById(id);
    }
}
