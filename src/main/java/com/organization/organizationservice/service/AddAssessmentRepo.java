package com.organization.organizationservice.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organization.organizationservice.entity.Assessment;
@Repository
public interface AddAssessmentRepo extends JpaRepository<Assessment, String>{

}
