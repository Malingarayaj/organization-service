package com.organization.organizationservice.rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.dto.FacultyDTO;
import com.organization.organizationservice.dto.FacultyLeaveDTO;
import com.organization.organizationservice.exception.FacultyNotFoundException;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.service.FacultyService;

@RestController
@RequestMapping("org/{orgId}/branch/{branchId}/factulty")
public class FacultyController {
	
	@Autowired
	private FacultyService facultyService;
	
	
	@PostMapping("/save")
	public ResponseEntity<? extends Object> saveFaculty(@PathVariable String orgId,@PathVariable String branchId,@RequestBody FacultyDTO request)throws organizationNotFound,BranchNotFoundEception {
		String response = this.facultyService.saveFaculty(request,orgId,branchId);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/allFaculties")
	public ResponseEntity<? extends Object> getAllFaculties(@PathVariable String orgId,@PathVariable String branchId)throws organizationNotFound,BranchNotFoundEception {
		List<FacultyDTO> facultyDTOs = this.facultyService.getAllFaculties(orgId,branchId);
		return ResponseEntity.ok(facultyDTOs);
	}
	
	@GetMapping("/{facultyId}")
	public ResponseEntity<? extends Object> getFacultyById(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String facultyId)throws organizationNotFound,BranchNotFoundEception,FacultyNotFoundException {
		FacultyDTO facultyDTO = this.facultyService.getFacultyById(orgId,branchId,facultyId);
		return ResponseEntity.ok(facultyDTO);
	}
	
	@GetMapping("/update/{facultyId}")
	public ResponseEntity<? extends Object> updateFacultyById(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String facultyId,@RequestBody FacultyDTO dto)throws organizationNotFound,BranchNotFoundEception,FacultyNotFoundException {
		FacultyDTO facultyDTO = this.facultyService.updateFacultyById(orgId,branchId,facultyId,dto);
		return ResponseEntity.ok(facultyDTO);
	}
	
	@DeleteMapping("/delete/{facultyId}")
	public ResponseEntity<? extends Object> removeFacultyById(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String facultyId)throws organizationNotFound,BranchNotFoundEception,FacultyNotFoundException{
		Map<Boolean,String> response=this.facultyService.removeFacultyById(orgId,branchId,facultyId);
		return ResponseEntity.ok(response);
		}
	
	@GetMapping("/{facultyId}/{firstName}/{dateOfBirth}")
	public ResponseEntity<? extends Object> findByBranchIdAndFirstNameAndDob(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String facultyId,@PathVariable String firstName,@PathVariable String dateOfBirth)throws organizationNotFound,BranchNotFoundEception{
		FacultyDTO response=this.facultyService.findByFacultyIdAndFirstNameAndDateOfBirth(orgId,branchId,facultyId,firstName,dateOfBirth);
		return ResponseEntity.ok(response);
		}
	
	@PostMapping("/{facultyId}/leave/save")
	public ResponseEntity<? extends Object> saveFacultyLeaveDetails(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String facultyId,@RequestBody FacultyLeaveDTO request)throws organizationNotFound,BranchNotFoundEception,FacultyNotFoundException {
		FacultyLeaveDTO response = this.facultyService.saveFacultyLeaveDetails(orgId,branchId,facultyId,request);
		return ResponseEntity.ok(response);
	}
	@GetMapping("/{facultyId}/leave/leaveDetails/{facultyLeaveId}")
	public ResponseEntity<FacultyLeaveDTO> getAllLeavesByFacutyId(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String facultyId,@PathVariable String facultyLeaveId) throws organizationNotFound, BranchNotFoundEception, FacultyNotFoundException{
		return ResponseEntity.ok(this.facultyService.getAllLeavesByFacutyId(orgId,branchId,facultyId));
	}
	
	
	

}
