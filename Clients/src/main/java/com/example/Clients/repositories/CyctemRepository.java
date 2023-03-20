package com.example.Clients.repositories;
import com.example.Clients.models.Cyctem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CyctemRepository extends JpaRepository <Cyctem, Integer> {
    List<Cyctem> findByTitle(String title);
}
