package com.requestafeature.controller;

import com.requestafeature.entity.Feature;
import com.requestafeature.payload.FeatureDto;
import com.requestafeature.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/features")
public class FeatureController {

    @Autowired
    private FeatureService featureService;

    @PostMapping("/create")
    public ResponseEntity<Feature> createFeature(@RequestBody FeatureDto featureDto) throws Exception {
        return new ResponseEntity<>(featureService.createFeature(featureDto), HttpStatus.CREATED);
    }
}
