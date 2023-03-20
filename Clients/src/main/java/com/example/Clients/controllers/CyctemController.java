package com.example.Clients.controllers;

import com.example.Clients.models.Client;
import com.example.Clients.models.Cyctem;
import com.example.Clients.services.CyctemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class CyctemController {
    private final CyctemService cyctemService;

   @GetMapping("/cyctems")
    public String cyctems(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("cyctems", cyctemService.listCyctems(title));
        return "cyctems";
    }

    @GetMapping("/cyctem/{id}")
    public String cyctemInfo(@PathVariable Integer id, Model model) {
        Cyctem cyctem = cyctemService.getCyctemById(id);
        model.addAttribute("cyctem", cyctem);
        return "client-info";
    }

    @PostMapping("/cyctem/create")
    public String saveCyctem(Cyctem cyctem) throws IOException {
        cyctemService.saveCyctem(cyctem);
        return "redirect:/";
    }

    @PostMapping("/cyctem/delete/{id}")
    public String deleteCyctem(@PathVariable Integer id) {
        cyctemService.deleteCyctem(id);
        return "redirect:/";
    }
}

