package com.example.Clients.repositories;
import com.example.Clients.models.Cyctem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CyctemRepository extends JpaRepository <Cyctem, String> {
    List<Cyctem> findByTitle(String title);
}
