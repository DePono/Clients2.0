package com.example.Clients.services;

import com.example.Clients.models.Law;
import com.example.Clients.repositories.LawRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class LawService {
    private final LawRepository lawRepository;
    public List<Law> listLaws(String title) {
        return lawRepository.findAll();
    }

    public void saveLaw(Law law) {
        String title = law.getTitle();
        log.info("Saving new Laws with title: {}", title);
        lawRepository.save(law);
    }

    public Law getLawById(Integer id) {
        return lawRepository.findById(id).orElse(null);
    }

    public void deleteLaw(Integer id) {
    }
}
