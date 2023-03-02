package com.example.Clients.controllers;
import com.example.Clients.models.Client;
import com.example.Clients.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.Map;

@Controller
@RequiredArgsConstructor
public class AdminController {
    private final ClientService clientService;
    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("clients", clientService.list());
        return "admin";
    }
    @GetMapping("/admin/client/edit/{client}")
    public String clientEdit(@PathVariable("client") Client client, Model model) {
        model.addAttribute("client", client);
        return "client-edit";
    }
}
