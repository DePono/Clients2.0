package com.example.Clients.services;

import com.example.Clients.models.Client;
import com.example.Clients.models.Company;
import com.example.Clients.models.Law;
import com.example.Clients.models.Stewart;
import com.example.Clients.repositories.LawRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class LawService {
    private final LawRepository lawRepository;
    public List<Law> findAll() {
        return lawRepository.findAll();
    }

    public void save(Law law) {
        lawRepository.save(law);
    }

    public Law getLawById(String title) {
        return lawRepository.findById(title).orElse(null);
    }

    public void delete(String id) {
        lawRepository.deleteById(id);
    }

    public List<Stewart> getStewartByLaw(String id) {
        Optional<Law> law = lawRepository.findById(id);
        return law.map(value -> (List<Stewart>) value.getStewartsByTitle()).orElse(null);
    }
}
