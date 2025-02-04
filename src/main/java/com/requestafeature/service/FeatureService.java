package com.requestafeature.service;

import com.requestafeature.entity.Feature;
import com.requestafeature.payload.FeatureDto;

import java.util.List;

public interface FeatureService {
    Feature createFeature(FeatureDto featureDto) throws Exception;
    List<Feature> findAllFeaturesByCompany(Integer companyId);
}
