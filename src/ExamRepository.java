package com.organization.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organization.organizationservice.entity.Exam;
@Repository
public interface ExamRepository extends JpaRepository<Exam, String>{

}
