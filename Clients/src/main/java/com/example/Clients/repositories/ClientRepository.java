package com.example.Clients.repositories;

import com.example.Clients.models.Client;
import com.example.Clients.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ClientRepository extends JpaRepository <Client, String> {
    List<Client> findByEmail(String email);
    List<Client> findByOwner(Company owner);
    List<Client> findClientByName(String clientName);
    List<Client> findClientByNameStartingWith(String startingWith);
    List<Client> findClientByNameOrEmail(String name, String email);
}
