package com.organization.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.organizationservice.entity.FacultyLeave;

public interface FacultyLeaveRepository extends JpaRepository<FacultyLeave, String> {

	Integer findByLevaeBalance(String facultyId);

}
