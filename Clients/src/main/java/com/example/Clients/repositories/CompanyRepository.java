package com.example.Clients.repositories;

import com.example.Clients.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
    List<Company> findByTitle(String title);
}
