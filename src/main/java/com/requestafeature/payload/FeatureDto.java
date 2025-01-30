package com.requestafeature.payload;

import lombok.Data;

@Data
public class FeatureDto {
    private int id;
    private String title;
    private String problemDescription;
    private String suggestedFeature;
}

