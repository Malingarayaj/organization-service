package com.organization.organizationservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.dto.BranchRequestDTO;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.service.BranchService;

@RestController
@RequestMapping("/org/{orgId}/branch")
public class BranchController {

	@Autowired
	private BranchService branchService;

	@PostMapping("/save")
	public ResponseEntity<? extends Object> createBranch(@RequestBody BranchRequestDTO dto, @PathVariable String orgId)
			throws organizationNotFound, BranchNotFoundEception {
		return new ResponseEntity<String>(branchService.createBranch(dto, orgId), HttpStatus.CREATED);
	}

	@GetMapping("/AllBranches")
	public ResponseEntity<? extends Object> getAllBranches(@PathVariable String orgId) {
		return new ResponseEntity<List<BranchRequestDTO>>(branchService.getAllBranches(orgId), HttpStatus.OK);
	}
	
	@GetMapping("/{branchId}")
	public ResponseEntity<? extends Object> getBranchById(@PathVariable String orgId,@PathVariable String branchId)throws organizationNotFound,BranchNotFoundEception {
		return new ResponseEntity<BranchRequestDTO>(branchService.getBranchById(orgId,branchId), HttpStatus.OK);
	}
	
	@PutMapping("/{branchId}/update")
	public ResponseEntity<? extends Object> updateBranchById(@PathVariable String orgId,@PathVariable String branchId,@RequestBody BranchRequestDTO dto)throws organizationNotFound,BranchNotFoundEception {
		return new ResponseEntity<BranchRequestDTO>(branchService.updateBranchById(orgId,branchId,dto), HttpStatus.OK);
	}
}
