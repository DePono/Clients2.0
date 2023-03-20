package com.example.Clients.services;
import com.example.Clients.models.Company;
import com.example.Clients.repositories.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;

    public List<Company> listCompanies(String title) {
        if (title != null) return companyRepository.findByTitle(title);
        return companyRepository.findAll();
    }

    public void saveCompany(Company company) {
        log.info("Saving new {}", company);
        companyRepository.save(company);
    }

    public void deleteCompany(Integer id) {
        companyRepository.deleteById(id);
    }

    public Company getCompanyById(Integer id) {
        return companyRepository.findById(id).orElse(null);
    }

}

