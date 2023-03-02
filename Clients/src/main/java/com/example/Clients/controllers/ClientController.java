package com.example.Clients.controllers;

import com.example.Clients.models.Client;
import com.example.Clients.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    @GetMapping("/client/{client}")
    public String clientInfo(@PathVariable("client") Client client, Model model) {
        model.addAttribute("client", client);
        return "client-info";
    }
}
