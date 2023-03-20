package com.example.Clients.services;

import com.example.Clients.models.Client;
import com.example.Clients.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public List<Client> listClients(String email) {
        if (email != null) return clientRepository.findByEmail(email);
        return clientRepository.findAll();
    }

    public void saveClient(Client client) {
        String email = client.getEmail();
        if (clientRepository.findByEmail(email) != null) return;
        log.info("Saving new User with email: {}", email);
        clientRepository.save(client);
    }

    public Client getClientById(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }

    public void deleteClient(Integer id) {
    }
}
