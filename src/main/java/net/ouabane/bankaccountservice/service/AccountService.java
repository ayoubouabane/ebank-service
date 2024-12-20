package net.ouabane.bankaccountservice.service;

import net.ouabane.bankaccountservice.dto.BankAccountRequestDTO;
import net.ouabane.bankaccountservice.dto.BankAccountResponseDTO;
import net.ouabane.bankaccountservice.exceptions.BankAccountNotFoundException;

import java.util.List;

public interface AccountService {
    BankAccountResponseDTO getAccountById(String id) throws BankAccountNotFoundException;
    BankAccountResponseDTO updateAccount(BankAccountRequestDTO bankAccountRequestDTO, String id) throws BankAccountNotFoundException;
    List<BankAccountResponseDTO> getAllAccounts();
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO);
    void deleteById(String id) throws BankAccountNotFoundException;
    void populateData();

}
