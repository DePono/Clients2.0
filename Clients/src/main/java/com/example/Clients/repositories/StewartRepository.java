package com.example.Clients.repositories;

import com.example.Clients.models.Stewart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StewartRepository extends JpaRepository <Stewart, Integer> {
    List<Stewart> findByTitle(String title);
}
