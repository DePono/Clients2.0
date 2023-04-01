package com.example.Clients.repositories;

import com.example.Clients.models.Stewart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StewartRepository extends JpaRepository <Stewart, Integer> {
    List<Stewart> findByPort(Integer port);
}
