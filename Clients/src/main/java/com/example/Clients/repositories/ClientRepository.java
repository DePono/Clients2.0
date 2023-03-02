package com.example.Clients.repositories;

import com.example.Clients.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Integer> {
    Client findByEmail(String email);
}
