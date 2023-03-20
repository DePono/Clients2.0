package com.example.Clients.services;

import com.example.Clients.models.Cyctem;
import com.example.Clients.repositories.CyctemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CyctemService {
    private final CyctemRepository cyctemRepository;

    public List<Cyctem> listCyctems(String title) {
        if (title != null) return cyctemRepository.findByTitle(title);
        return cyctemRepository.findAll();
    }

    public void saveCyctem(Cyctem cyctem) {
        log.info("Saving new {}", cyctem);
        cyctemRepository.save(cyctem);
    }

    public void deleteCyctem(Integer id) {
        cyctemRepository.deleteById(id);
    }

    public Cyctem getCyctemById(Integer id) {
        return cyctemRepository.findById(id).orElse(null);
    }
}

