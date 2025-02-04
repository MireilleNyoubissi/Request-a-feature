package com.requestafeature.controller;

import com.requestafeature.entity.Company;
import com.requestafeature.payload.CompanyDto;
import com.requestafeature.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping("/create")
    public ResponseEntity<Company> createCompany(@RequestBody CompanyDto companyDto){
        return new ResponseEntity<>(companyService.createCompany(companyDto), HttpStatus.CREATED);
    }

}
