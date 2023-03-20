package com.example.Clients.controllers;

import com.example.Clients.models.Law;
import com.example.Clients.services.LawService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequiredArgsConstructor
public class LawController {

    private final LawService lawService;

    @GetMapping("/laws")
    public String laws(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("laws", lawService.listLaws(title));
        return "laws";
    }

    @GetMapping("/law/{id}")
    public String lawInfo(@PathVariable Integer id, Model model) {
        Law law = lawService.getLawById(id);
        model.addAttribute("law", law);
        return "law-info";
    }

    @PostMapping("/law/create")
    public String saveLaw(Law law){
        lawService.saveLaw(law);
        return "redirect:/";
    }

    @PostMapping("/law/delete/{id}")
    public String deleteLaw(@PathVariable Integer id) {
        lawService.deleteLaw(id);
        return "redirect:/";
    }
}

