package com.example.Clients.services;
import com.example.Clients.models.Client;
import com.example.Clients.models.Company;
import com.example.Clients.repositories.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.net.StandardProtocolFamily;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public void save(Company company) {
        log.info("Saving new {}", company);
        companyRepository.save(company);
    }

    public void delete(Long id) {
        companyRepository.deleteById(id);
    }

    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }
    public void update(Long id, Company updatedCompany) {
        updatedCompany.setPhone(id);
        companyRepository.save(updatedCompany);
    }


    public List<Client> getClientByCompanyId(Long phone) {
        Optional<Company> company = companyRepository.findById(phone);
        return company.map(value -> (List<Client>) value.getClients()).orElse(null);
    }
}

