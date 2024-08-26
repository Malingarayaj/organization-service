package com.organization.organizationservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.dto.AddStudentRecordDTO;
import com.organization.organizationservice.exception.StudentNotFound;
import com.organization.organizationservice.exception.StudentRecordAlreadyExist;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.service.StudentRecordService;

@RestController
@RequestMapping("/org/{orgId}/branch/{branchId}/student/{studentId}")
public class StudentRecordController {

	@Autowired
	private StudentRecordService recordService;

	@PostMapping("/saveStRecord")
	public ResponseEntity<? extends Object> createStudentRecord(@PathVariable String orgId,
			@PathVariable String branchId, @PathVariable String studentId, @RequestBody AddStudentRecordDTO dto)
			throws organizationNotFound, BranchNotFoundEception, StudentNotFound, StudentRecordAlreadyExist {
		AddStudentRecordDTO response = recordService.createStudentRecord(orgId, branchId, studentId, dto);
		return ResponseEntity.ok(response);
}
	@GetMapping("/records")
	public ResponseEntity<? extends Object> getStudentRecords(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String studentId) throws organizationNotFound, BranchNotFoundEception, StudentRecordAlreadyExist, StudentNotFound{
		List<AddStudentRecordDTO> bodyOfRecords=recordService.getStudentRecords(orgId,branchId,studentId);
		return ResponseEntity.ok(bodyOfRecords);
	}
	@PostMapping("/update")
	public ResponseEntity<? extends Object> updateStudentRecordById(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String studentId,@RequestBody AddStudentRecordDTO dto)throws organizationNotFound, BranchNotFoundEception,StudentNotFound{
		AddStudentRecordDTO response=recordService.updateStudentRecordById(orgId,branchId,studentId,dto);
		return ResponseEntity.ok(response);
	}

}
