package com.example.Clients.services;

import com.example.Clients.models.Client;
import com.example.Clients.models.Company;
import com.example.Clients.repositories.ClientRepository;
import com.example.Clients.repositories.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;
    private final CompanyRepository companyRepository;

    public List<Client> findAll(String email) {
        if (email != null) return clientRepository.findByEmail(email);
        return clientRepository.findAll();
    }

    public void save(Client client) {
        clientRepository.save(client);
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    public void update(Long phone, Client updadetClient) {
        updadetClient.setPhone(phone);
        clientRepository.save(updadetClient);
    }

    public List<Client> findByCompany(Company owner) {
        return clientRepository.findByOwner(owner);
    }
    public List<Client> findByClientByName(String clientName) {
        return clientRepository.findClientByName(clientName);
    }

}