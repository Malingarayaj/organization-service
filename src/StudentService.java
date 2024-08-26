package com.organization.organizationservice.service;

import java.util.List;

import com.organization.organizationservice.dto.AddAssessmentDTO;
import com.organization.organizationservice.dto.StudentOrgInfo;
import com.organization.organizationservice.dto.StudentRequest;
import com.organization.organizationservice.exception.FacultyNotFoundException;
import com.organization.organizationservice.exception.StudentNotFound;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;

public interface StudentService {

	public StudentRequest createStudent(String orgId, String branchId, StudentRequest request)throws organizationNotFound,BranchNotFoundEception ;

	public List<StudentRequest> getAllstudents(String orgId, String branchId)throws organizationNotFound,BranchNotFoundEception;

	public StudentRequest getstudentById(String orgId, String branchId, String studentId)throws organizationNotFound,BranchNotFoundEception;

	public StudentRequest updatetudentById(StudentRequest request,String orgId, String branchId,String studentId)throws organizationNotFound,BranchNotFoundEception;

	public Boolean deleteStudentById(String orgId, String branchId, String studentId)throws organizationNotFound,BranchNotFoundEception;


	public AddAssessmentDTO createAssemenet(AddAssessmentDTO assementDto,String branchId, String studentId);

	public AddAssessmentDTO getAssessmentById(String assessmentId, String branchId);

	public List<AddAssessmentDTO> getAllAssessments();

	public StudentOrgInfo getStudentOrginfo(String branchId, String orgId, String studentId,String facultyId)throws organizationNotFound,BranchNotFoundEception,FacultyNotFoundException,StudentNotFound;


}
