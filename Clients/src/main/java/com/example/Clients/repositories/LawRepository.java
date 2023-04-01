package com.example.Clients.repositories;

import com.example.Clients.models.Law;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LawRepository extends JpaRepository<Law, Integer> {
    List<Law> findByLawType(String lawType);
}
