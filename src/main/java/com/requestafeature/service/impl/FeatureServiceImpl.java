package com.requestafeature.service.impl;

import com.requestafeature.entity.Company;
import com.requestafeature.entity.Feature;
import com.requestafeature.payload.FeatureDto;
import com.requestafeature.repository.FeatureRepository;
import com.requestafeature.service.CompanyService;
import com.requestafeature.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeatureServiceImpl implements FeatureService {


    @Autowired
    private FeatureRepository featureRepository;
    @Autowired
    private CompanyService companyService;

    @Override
    public Feature createFeature(FeatureDto featureDto) throws Exception {

        Optional<Company> companyOptional = companyService.findById(featureDto.getCompanyId());
        if(companyOptional.isEmpty()){
            throw new Exception("Company doesn't exist");
        }
        Feature feature = new Feature();
        feature.setTitle(featureDto.getTitle());
        feature.setProblemDescription(featureDto.getProblemDescription());
        feature.setSuggestedFeature(featureDto.getSuggestedFeature());
        feature.setCompany(companyOptional.get());

        featureRepository.save(feature);

        return feature;

    }

    @Override
    public List<Feature> findAllFeaturesByCompany(Integer companyId) {
        return featureRepository.findAll();
    }
}
