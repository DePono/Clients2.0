package com.example.Clients.controllers;

import com.example.Clients.models.Account;
import com.example.Clients.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class AccountController {
    public final AccountService accountService;

    @GetMapping("/accounts")
    public String accounts(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("accounts", accountService.listAccounts(title));
        return "accounts";
    }

}
