package com.example.Clients.services;

import com.example.Clients.models.Account;
import com.example.Clients.models.Company;
import com.example.Clients.repositories.AccountsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountService {
    private final AccountsRepository accountsRepository;

    public List<Account> findAll() {
        return accountsRepository.findAll();
    }

    public Account getAccountById(String title) {
        return accountsRepository.findById(title).orElse(null);
    }

    public List<Company> getCompanyByAccountId(String title) {
        Optional<Account> account = accountsRepository.findById(title);
        return account.map(value -> (List<Company>) value.getCompaniesByTitle()).orElse(null);
    }

}

