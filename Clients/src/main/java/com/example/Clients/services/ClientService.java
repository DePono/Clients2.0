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

    public List<Client> list() {
        return clientRepository.findAll();
    }
    public boolean createClient(Client client) {
        String email = client.getEmail();
        if (clientRepository.findByEmail(email) != null) return false;
        log.info("Saving new User with email: {}", email);
        clientRepository.save(client);
        return true;
    }
}
