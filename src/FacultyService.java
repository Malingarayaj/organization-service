package com.organization.organizationservice.service;

import java.util.List;
import java.util.Map;

import com.organization.organizationservice.dto.FacultyDTO;
import com.organization.organizationservice.dto.FacultyLeaveDTO;
import com.organization.organizationservice.exception.FacultyNotFoundException;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;

public interface FacultyService {


	String saveFaculty(FacultyDTO request, String orgId, String branchId)throws organizationNotFound,BranchNotFoundEception;

	List<FacultyDTO> getAllFaculties(String orgId, String branchId)throws organizationNotFound,BranchNotFoundEception;

	FacultyDTO getFacultyById(String orgId, String branchId, String facultyId)throws organizationNotFound,BranchNotFoundEception,FacultyNotFoundException;

	FacultyDTO updateFacultyById(String orgId, String branchId,String facultyId,FacultyDTO dto)throws organizationNotFound,BranchNotFoundEception,FacultyNotFoundException;

	Map<Boolean, String> removeFacultyById(String orgId, String branchId,String facultyId)throws organizationNotFound,BranchNotFoundEception,FacultyNotFoundException;

	FacultyDTO findByFacultyIdAndFirstNameAndDateOfBirth(String orgId, String branchId,String facultyId, String firstName, String dateOfBirth)throws organizationNotFound,BranchNotFoundEception;

	FacultyLeaveDTO saveFacultyLeaveDetails(String orgId, String branchId, String facultyId, FacultyLeaveDTO request)throws organizationNotFound,BranchNotFoundEception,FacultyNotFoundException;

	FacultyLeaveDTO getAllLeavesByFacutyId(String orgId, String branchId, String facultyId)throws organizationNotFound,BranchNotFoundEception,FacultyNotFoundException;

}
