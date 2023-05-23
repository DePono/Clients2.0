package com.example.Clients.services;
import com.example.Clients.models.Cyctem;
import com.example.Clients.models.Stewart;
import com.example.Clients.repositories.StewartRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void update(Integer port, Stewart updatedStewart) {
        updatedStewart.setPort(port);
        stewartRepository.save(updatedStewart);
    }

    public void delete(Integer id) {
        stewartRepository.deleteById(id);
    }

    public Stewart getStewartById(Integer id) {
        return stewartRepository.findById(id).orElse(null);
    }

    public List<Stewart> findByCyctem(Cyctem owner) {
        return stewartRepository.findByOwner(owner);
    }
    public List<Stewart> findByStewartByTitle(String stewartTitle) {
        return stewartRepository.findStewartByTitle(stewartTitle);
    }

}

