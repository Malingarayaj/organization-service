package com.organization.organizationservice.rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public ResponseEntity<? extends Object> createBranch(@RequestBody BranchRequestDTO dto, @PathVariable String orgId)throws organizationNotFound, BranchNotFoundEception {
		return ResponseEntity.ok(branchService.createBranch(dto, orgId));
	}

	@GetMapping("/AllBranches")
	public ResponseEntity<List<BranchRequestDTO>> getAllBranches(@PathVariable String orgId) {
//		return new ResponseEntity<List<BranchRequestDTO>>(branchService.getAllBranches(orgId), HttpStatus.OK);
		return ResponseEntity.ok(branchService.getAllBranches(orgId));
	}
	
	@GetMapping("/{branchId}")
	public ResponseEntity<? extends Object> getBranchById(@PathVariable String orgId,@PathVariable String branchId)throws organizationNotFound,BranchNotFoundEception {
	//	return new ResponseEntity<BranchRequestDTO>(branchService.getBranchById(orgId,branchId), HttpStatus.OK);
		return ResponseEntity.ok(branchService.getBranchById(orgId, branchId));
	}
	
	@PutMapping("/{branchId}/update")
	public ResponseEntity<? extends Object> updateBranchById(@PathVariable String orgId,@PathVariable String branchId,@RequestBody BranchRequestDTO dto)throws organizationNotFound,BranchNotFoundEception {
		return  ResponseEntity.ok(branchService.updateBranchById(orgId,branchId,dto));
	}
	@DeleteMapping("/diableBranch/{branchId}")
	public Map<Boolean,String> diableBranch(@PathVariable String orgId,@PathVariable String branchId) throws organizationNotFound, BranchNotFoundEception{
		Map<Boolean,String> response=branchService.diableBranch(orgId,branchId);
		return response;
	}
	@GetMapping("/getBranchByNameAndBranchId/{branchId}/{branchName}")
	public ResponseEntity<BranchRequestDTO> getBranchByIdAndBranchName(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String branchName)throws organizationNotFound,BranchNotFoundEception{
		return ResponseEntity.ok(this.branchService.getBranchByIdAndBranchName(orgId,branchId,branchName));
	}
	
	@GetMapping("/getBranchsByNameAndBranchId/{branchId}/{branchName}")
	public ResponseEntity<List<BranchRequestDTO>> getBranchsByIdAndBranchName(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String branchName)throws organizationNotFound,BranchNotFoundEception{
		return ResponseEntity.ok(this.branchService.getBranchsByIdAndBranchName(orgId,branchId,branchName));
	}
}
