package com.example.Clients.services;
import com.example.Clients.models.Cyctem;
import com.example.Clients.models.Stewart;
import com.example.Clients.repositories.CompanyRepository;
import com.example.Clients.repositories.CyctemRepository;
import com.example.Clients.repositories.StewartRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class CyctemService {
    private final CompanyRepository companyRepository;
    private final StewartRepository stewartRepository;
    private final CyctemRepository cyctemRepository;

    public List<Cyctem> findAll(String title) {
        if (title != null) return cyctemRepository.findByTitle(title);
        return cyctemRepository.findAll();
    }

    public void save(Cyctem cyctem) {
        log.info("Saving new {}", cyctem);
        cyctemRepository.save(cyctem);
    }

    public void delete(String id) {
        cyctemRepository.deleteById(id);
    }

    public Cyctem getCyctemById(String id) {
        return cyctemRepository.findById(id).orElse(null);
    }

    public List<Stewart> getStewartByCyctemId (String title){
        Optional<Cyctem> cyctem = cyctemRepository.findById(title);
        return cyctem.map(value -> (List<Stewart>) value.getStewarts()).orElse(null);
    }

}

