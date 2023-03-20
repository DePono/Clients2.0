package com.example.Clients.controllers;
import com.example.Clients.models.Client;
import com.example.Clients.models.Company;
import com.example.Clients.services.ClientService;
import com.example.Clients.services.CompanyService;
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
public class CompanyController {
    private final CompanyService companyService;
    private final ClientService clientService;

    @GetMapping("/company")
    public String companies(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("companies", companyService.listCompanies(title));
        return "companies";
    }

    @GetMapping("/company/{id}")
    public String companyInfo(@PathVariable Integer id, Model model) {
        Company company = companyService.getCompanyById(id);
        Client client = clientService.getClientById(id);
        model.addAttribute("company", company);
        model.addAttribute("company", company);
        return "company-info";
    }

    @PostMapping("/company/create")
    public String createCompany(Company company) {
        companyService.saveCompany(company);
        return "redirect:/company";
    }

    @PostMapping("/company/delete/{id}")
    public String deleteCompany(@PathVariable Integer id) {
        companyService.deleteCompany(id);
        return "redirect:/company";
    }
}
//добавить через сервлеты на отлично, пара запросов по паре табличек