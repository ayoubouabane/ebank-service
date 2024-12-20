package net.ouabane.bankaccountservice.mappers;

import net.ouabane.bankaccountservice.dto.BankAccountRequestDTO;
import net.ouabane.bankaccountservice.dto.BankAccountResponseDTO;
import net.ouabane.bankaccountservice.entities.BankAccount;

public interface AccountMapper {
    BankAccount formBankAccountRequestDTO(BankAccountRequestDTO bankAccountRequestDTO);
    BankAccountResponseDTO fromBankAccount(BankAccount bankAccount);
}
