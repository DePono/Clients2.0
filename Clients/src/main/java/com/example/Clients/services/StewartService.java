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

    public List<Stewart> listStewart(String title) {
        if (title != null) return stewartRepository.findByTitle(title);
        return stewartRepository.findAll();
    }

    public void saveStewart(Stewart stewart) {
        log.info("Saving new {}", stewart);
        stewartRepository.save(stewart);
    }

    public void deleteStewart(Integer id) {
        stewartRepository.deleteById(id);
    }

    public Stewart getStewartById(Integer id) {
        return stewartRepository.findById(id).orElse(null);
    }
}

