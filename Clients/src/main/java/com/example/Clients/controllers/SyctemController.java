package com.example.Clients.controllers;

import com.example.Clients.models.Syctem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class SyctemController {
    private final SyctemController syctemController;
    @GetMapping("/syctem/{syctem}")
    public String systemInfo(@PathVariable("syctem") Syctem syctem, Model model) {
        model.addAttribute("syctem", syctem);
        return "syctem-info";
    }
}
