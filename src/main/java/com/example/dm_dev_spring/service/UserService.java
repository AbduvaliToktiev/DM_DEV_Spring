package com.example.dm_dev_spring.service;

import com.example.dm_dev_spring.database.entity.Company;
import com.example.dm_dev_spring.database.repository.CrudRepository;
import com.example.dm_dev_spring.database.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(UserRepository userRepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
