package com.organization.organizationservice.service;

import java.util.List;

import com.organization.organizationservice.dto.AddStudentRecordDTO;
import com.organization.organizationservice.exception.StudentNotFound;
import com.organization.organizationservice.exception.StudentRecordAlreadyExist;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;

public interface StudentRecordService {

	AddStudentRecordDTO createStudentRecord(String orgId, String branchId, String studentId, AddStudentRecordDTO dto)throws organizationNotFound,BranchNotFoundEception,StudentRecordAlreadyExist, StudentNotFound;

	List<AddStudentRecordDTO> getStudentRecords(String orgId, String branchId, String studentId)throws organizationNotFound,BranchNotFoundEception,StudentRecordAlreadyExist, StudentNotFound;

	AddStudentRecordDTO updateStudentRecordById(String orgId, String branchId, String studentId,AddStudentRecordDTO dto)throws organizationNotFound,BranchNotFoundEception,StudentNotFound;

}
