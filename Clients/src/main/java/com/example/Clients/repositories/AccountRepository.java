package com.example.Clients.repositories;

import com.example.Clients.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    List<Account> findByTitle(String title);
}
