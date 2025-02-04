package com.requestafeature.service.impl;

import com.requestafeature.entity.Company;
import com.requestafeature.payload.CompanyDto;
import com.requestafeature.repository.CompanyRepository;
import com.requestafeature.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public Company createCompany(CompanyDto companyDto) {
        //Convert DTO to entity
        Company company = new Company();
        company.setCompanyName(companyDto.getCompanyName());
        company.setLocation(companyDto.getLocation());


        companyRepository.save(company);

        return company;
    }
}
