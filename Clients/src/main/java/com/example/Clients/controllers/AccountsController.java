package com.example.Clients.controllers;

import com.example.Clients.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AccountsController {
    public final AccountService accountService;

    @GetMapping("/accounts")
    public String accounts(Model model) {
        model.addAttribute("accounts", accountService.findAll());
        return "accounts/accounts";
    }
}
