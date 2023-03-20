package com.example.Clients.repositories;

import com.example.Clients.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository <Client, Integer> {
    List<Client> findByEmail(String email);

}
