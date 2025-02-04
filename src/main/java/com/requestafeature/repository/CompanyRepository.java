package com.requestafeature.repository;

import com.requestafeature.entity.Company;
import com.requestafeature.entity.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

    @Query(value = "SELECT db_requestAFeature.feature.title, db_requestAFeature.feature.description FROM db_requestAFeature.feature" +
            "INNER JOIN db_requestAFeature.company ON db_requestAFeature.feature.company_id = db_requestAFeature.companies.id", nativeQuery = true)
    public List<Feature> findAllFeatures();
}
