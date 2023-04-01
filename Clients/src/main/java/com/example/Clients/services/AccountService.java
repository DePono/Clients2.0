package com.example.Clients.services;

import com.example.Clients.models.Account;
import com.example.Clients.repositories.AccountsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
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
}

