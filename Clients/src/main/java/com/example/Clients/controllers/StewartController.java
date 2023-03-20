package com.example.Clients.controllers;

import com.example.Clients.models.Stewart;
import com.example.Clients.services.StewartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequiredArgsConstructor
public class StewartController {
    private final StewartService stewartService;
   @GetMapping("/stewarts")
    public String stewarts(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("stewarts", stewartService.listStewart(title));
        return "stewarts";
    }

    @GetMapping("/stewart/{id}")
    public String stewartInfo(@PathVariable Integer id, Model model) {
        model.addAttribute("stewarts", stewartService.getStewartById(id));
        return "stewart-info";
    }

    @PostMapping("/stewart/create")
    public String createStewart(Stewart stewart) {
        stewartService.saveStewart(stewart);
        return "redirect:/";
    }

    @PostMapping("/stewart/delete/{id}")
    public String deleteStewart(@PathVariable Integer id) {
        stewartService.deleteStewart(id);
        return "redirect:/";
    }
}
