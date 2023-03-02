package com.example.Clients.services;

import com.example.Clients.models.Stewart;
import com.example.Clients.models.Syctem;
import com.example.Clients.repositories.SyctemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SyctemService {
    private final SyctemRepository syctemRepository;

    public List<Syctem> listSyctem(String title) {
        if (title != null) return syctemRepository.findByTitle(title);
        return syctemRepository.findAll();
    }

    public void saveSyctem(Syctem syctem) {
        log.info("Saving new {}", syctem);
        syctemRepository.save(syctem);
    }

    public void deleteSyctem(Integer id) {
        syctemRepository.deleteById(id);
    }

    public Syctem getSyctemById(Integer id) {
        return syctemRepository.findById(id).orElse(null);
    }
}

