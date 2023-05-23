package com.example.Clients.controllers;
import com.example.Clients.models.Company;
import com.example.Clients.services.AccountService;
import com.example.Clients.services.ClientService;
import com.example.Clients.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class CompaniesController {
    private final CompanyService companyService;
    private final ClientService clientService;
    private final AccountService accountService;

    @GetMapping("/companies")
    public String companies(Model model) {
        model.addAttribute("companies", companyService.findAll());
        return "companies/companies";
    }

    @GetMapping("/company/{id}")
    public String info(@PathVariable Long id, Model model) {
        Company company = companyService.getCompanyById(id);
        model.addAttribute("company", company);
        model.addAttribute("clients",companyService.getClientByCompanyId(id));
        return "companies/company-info";
    }
    @PostMapping("/company/create")
    public String create(Company company) {
        companyService.save(company);
        return "redirect:/companies";
    }
    @PostMapping("/company/delete/{id}")
    public String delete(@PathVariable Long id) {
        companyService.delete(id);
        return "redirect:/companies";
    }
    @PatchMapping("/company/{id}")
    public String update(@PathVariable Long id, @ModelAttribute("company") Company company){
        companyService.update(id,company);
        return "companies/company-info";
    }
    @PostMapping("/company/{id}/edit")
    public String edit(Model model, @PathVariable Long id){
        model.addAttribute("company",companyService.getCompanyById(id));
        return "companies/edit";
    }

}
//добавить через сервлеты на отлично, пара запросов по паре табличек