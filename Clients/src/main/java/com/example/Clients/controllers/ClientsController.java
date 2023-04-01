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

@Controller
@RequiredArgsConstructor
public class ClientsController {
    private final ClientService clientService;

    @GetMapping("/clients")
    public String clients(String username, Model model) {
        model.addAttribute("clients", clientService.findAll(username));
        return "clients";
    }

    @GetMapping("/client/{phone}")
    public String clientInfo(@PathVariable String phone, Model model) {
        Client client = clientService.getClientById(phone);
        model.addAttribute("client", client);
        return "client-info";
    }

    @PostMapping("/client/create")
    public String saveClient(Client client){
        clientService.save(client);
        return "redirect:/";
    }

    @PostMapping("/client/delete/{id}")
    public String deleteClient(@PathVariable String id) {
        clientService.delete(id);
        return "redirect:/clients";
    }
}
