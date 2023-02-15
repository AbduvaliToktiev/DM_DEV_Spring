package com.example.dm_dev_spring.service;

import com.example.dm_dev_spring.database.repository.CompanyRepository;
import com.example.dm_dev_spring.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CompanyRepository companyRepository;

    private CompanyService companyService;

    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }
}
