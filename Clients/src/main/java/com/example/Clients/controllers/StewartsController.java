package com.example.Clients.controllers;
import com.example.Clients.models.Stewart;
import com.example.Clients.services.LawService;
import com.example.Clients.services.StewartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class StewartsController {
    private final StewartService stewartService;
    private final LawService lawService;
   @GetMapping("/stewarts")
    public String stewarts(Model model) {
        model.addAttribute("stewarts", stewartService.findAll());
        return "stewarts/stewarts";
    }
    @GetMapping("/stewart/{port}")
    public String info(@PathVariable String port, Model model) {
        Stewart stewart = stewartService.getStewartById(port);
        model.addAttribute("stewart", stewart);
        return "stewarts/stewart-info";
    }

    @PostMapping("/stewarts/create")
    public String create(Stewart stewart) {
        stewartService.save(stewart);
        return "redirect:/stewarts";
    }
    @PostMapping("/stewarts/delete/{id}")
    public String delete(@PathVariable String id) {
        stewartService.delete(id);
        return "redirect:/stewarts";
    }
}
