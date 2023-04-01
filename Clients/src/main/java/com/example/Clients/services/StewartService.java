package com.example.Clients.services;

import com.example.Clients.models.Stewart;
import com.example.Clients.repositories.StewartRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
@RequiredArgsConstructor
public class StewartService {
    private final StewartRepository stewartRepository;

    public List<Stewart> findAll() {
        return stewartRepository.findAll();
    }

    public void save(Stewart stewart) {
        log.info("Saving new {}", stewart);
        stewartRepository.save(stewart);
    }
    public void update(int port, Stewart updatedStewart) {
        updatedStewart.setPort(port);
        stewartRepository.save(updatedStewart);
    }

    public void delete(int id) {
        stewartRepository.deleteById(id);
    }

    public Stewart getStewartById(int id) {
        return stewartRepository.findById(id).orElse(null);
    }
}

