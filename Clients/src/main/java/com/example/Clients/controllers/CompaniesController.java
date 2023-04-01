package com.example.Clients.controllers;
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

@Controller
@RequiredArgsConstructor
public class CompaniesController {
    private final CompanyService companyService;
    private final ClientService clientService;

    @GetMapping("/company")
    public String companies(Model model) {
        model.addAttribute("companies", companyService.findAll());
        return "companies";
    }

    @GetMapping("/company/{id}")
    public String companyInfo(@PathVariable String id, Model model) {
        Company company = companyService.getCompanyById(id);
        model.addAttribute("company", company);
        model.addAttribute("clients",companyService.getClientByCompanyId(id));
        return "company-info";
    }

    @PostMapping("/company/create")
    public String createCompany(Company company) {
        companyService.save(company);
        return "redirect:/company";
    }

    @PostMapping("/company/delete/{id}")
    public String deleteCompany(@PathVariable String id) {
        companyService.delete(id);
        return "redirect:/company";
    }
}
//добавить через сервлеты на отлично, пара запросов по паре табличек