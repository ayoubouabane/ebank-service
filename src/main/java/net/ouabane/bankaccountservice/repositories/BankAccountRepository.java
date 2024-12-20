package net.ouabane.bankaccountservice.repositories;

import net.ouabane.bankaccountservice.entities.BankAccount;
import net.ouabane.bankaccountservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    //@RestResource(path = "/byType")
    //List<BankAccount> findByType(@Param("t") AccountType type);
}
