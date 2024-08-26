package com.organization.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organization.organizationservice.entity.Faculty;
@Repository
public interface FacultyRepository extends JpaRepository<Faculty, String> {

//	Faculty findByBranchIdAndFirstNameAndDateOfBirth(String branchId, String firstName, String dateOfBirth);

//	Faculty findByBranchIdOrFirstNameOrDateOfBirth(String branchId, String firstName, String dateOfBirth);

	Faculty findByFacultyIdAndFirstNameAndDateOfBirth(String facultyId, String firstName, String dateOfBirth);

}
