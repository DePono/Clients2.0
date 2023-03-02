package com.example.Clients.repositories;
import com.example.Clients.models.Syctem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SyctemRepository extends JpaRepository <Syctem, Integer> {
    List<Syctem> findByTitle(String title);
}
