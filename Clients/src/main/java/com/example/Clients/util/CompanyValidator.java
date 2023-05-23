package com.example.Clients.util;

import com.example.Clients.models.Company;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class CompanyValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Company.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Company company = (Company) target;

        // посмтореть, если такая же комапание с таким телефоном
    }
}
