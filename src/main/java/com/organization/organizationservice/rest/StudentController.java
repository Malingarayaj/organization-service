package com.organization.organizationservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.dto.StudentRequest;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.service.StudentService;

@RestController
@RequestMapping("/org/{orgId}/branch/{branchId}")
public class StudentController {
	
	@Autowired 
	private StudentService studentService;
	
	@PostMapping("/newAdmission")
	public ResponseEntity<? extends Object> createStudent(@PathVariable String orgId,@PathVariable String branchId,@RequestBody StudentRequest request)throws organizationNotFound,BranchNotFoundEception{
		return new ResponseEntity<StudentRequest>(studentService.createStudent(orgId,branchId,request), HttpStatus.CREATED);
	}
	

	@GetMapping("/allStudents")
	public ResponseEntity<? extends Object> getAllstudents(@PathVariable String orgId,@PathVariable String branchId) throws organizationNotFound, BranchNotFoundEception{
		return new ResponseEntity<List<StudentRequest>>(studentService.getAllstudents(orgId,branchId), HttpStatus.OK);
		
	}
	
	@GetMapping("/{studentId}")
	public ResponseEntity<? extends Object> getstudentById(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String studentId) throws organizationNotFound, BranchNotFoundEception{
		return new ResponseEntity<StudentRequest>(studentService.getstudentById(orgId,branchId,studentId), HttpStatus.OK);
		
	}
	@PutMapping("/update/{studentId}")
	public ResponseEntity<? extends Object> updatetudentById(@RequestBody StudentRequest request,@PathVariable String orgId,@PathVariable String branchId,@PathVariable String studentId) throws organizationNotFound, BranchNotFoundEception{
		return new ResponseEntity<StudentRequest>(studentService.updatetudentById(request,orgId,studentId,branchId), HttpStatus.OK);
	}
	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<? extends Object> deleteStudentById(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String studentId)throws organizationNotFound,BranchNotFoundEception{
		return new ResponseEntity<Boolean>(studentService.deleteStudentById(orgId,branchId,studentId), HttpStatus.OK);
	}
	
	
	
	

}
