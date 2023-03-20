package com.example.Clients.controllers;

import com.example.Clients.models.Client;
import com.example.Clients.services.ClientService;
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
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/clients")
    public String clients(@RequestParam(name = "username", required = false) String username, Model model) {
        model.addAttribute("clients", clientService.listClients(username));
        return "clients";
    }

    @GetMapping("/client/{id}")
    public String clientInfo(@PathVariable Integer id, Model model) {
        Client client = clientService.getClientById(id);
        model.addAttribute("client", client);
        return "client-info";
    }

    @PostMapping("/client/create")
    public String saveClient(Client client){
        clientService.saveClient(client);
        return "redirect:/";
    }

    @PostMapping("/client/delete/{id}")
    public String deleteClient(@PathVariable Integer id) {
        clientService.deleteClient(id);
        return "redirect:/";
    }
}
