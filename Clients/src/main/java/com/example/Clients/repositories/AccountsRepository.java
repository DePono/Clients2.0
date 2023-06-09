package com.example.Clients.repositories;

import com.example.Clients.models.Account;
import com.example.Clients.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
@Repository
public interface AccountsRepository extends JpaRepository<Account, String> {
    List<Account> findByTitle(String title);
}
