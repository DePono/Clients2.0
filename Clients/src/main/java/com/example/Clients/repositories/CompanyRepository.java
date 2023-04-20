package com.example.Clients.repositories;

import com.example.Clients.models.Account;
import com.example.Clients.models.Client;
import com.example.Clients.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
    List<Company> findByTitle(String title);
    List<Company> findCompanyByAccountsByTypeAccount(Account account);

}
