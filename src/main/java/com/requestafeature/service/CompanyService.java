package com.requestafeature.service;

import com.requestafeature.entity.Company;
import com.requestafeature.payload.CompanyDto;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    List<Company> findAllCompanies();
    Company createCompany(CompanyDto companyDto);
    Optional<Company> findById(int id);
}
