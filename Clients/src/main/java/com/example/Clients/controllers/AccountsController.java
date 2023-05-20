package com.example.Clients.controllers;

import com.example.Clients.models.Account;
import com.example.Clients.models.Company;
import com.example.Clients.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class AccountsController {
    public final AccountService accountService;

    @GetMapping("/accounts")
    public String accounts(Model model) {
        model.addAttribute("accounts", accountService.findAll());
        return "accounts/accounts";
    }

    @GetMapping("/account/{id}")
    public String info(@PathVariable String id, Model model) {
        Account account = accountService.getAccountById(id);
        model.addAttribute("account", account);
        model.addAttribute("companies",accountService.getCompanyByAccountId(id));
        return "accounts/account-info";
    }
}
