package com.example.Clients.repositories;

import com.example.Clients.models.Law;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LawRepository extends JpaRepository<Law, Integer> {
    List<Law> findByTitle(String title);
}
