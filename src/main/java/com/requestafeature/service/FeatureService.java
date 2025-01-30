package com.requestafeature.service;

import com.requestafeature.entity.Feature;
import com.requestafeature.payload.FeatureDto;

public interface FeatureService {
    Feature createFeature(FeatureDto featureDto);

}
