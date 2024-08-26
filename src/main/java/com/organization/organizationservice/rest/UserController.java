package com.organization.organizationservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.dto.UserDTO;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.service.UserService;

@RestController
@RequestMapping("org/{orgId}/{branchId}")
public class UserController {
	
	@Autowired  UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity<? extends Object> createOgAdmin(@PathVariable String orgId,@RequestBody UserDTO request) throws organizationNotFound{
		//return new ResponseEntity<UserDTO>(userService.createOgAdmin(orgId,request),HttpStatus.CREATED);
		return ResponseEntity.ok(userService.createOgAdmin(orgId,request));
	}
	

	@PostMapping("/branchAdd")
	public ResponseEntity<? extends Object> createBranchManager(@PathVariable String orgId,@PathVariable String branchId,@RequestBody UserDTO request) throws organizationNotFound,BranchNotFoundEception{
		return new ResponseEntity<UserDTO>(userService.createBranchManager(orgId,branchId,request),HttpStatus.CREATED);
	}


	@PostMapping("/addBranchOp")
	public ResponseEntity<? extends Object> createBranchOperator(@PathVariable String orgId,@PathVariable String branchId,@RequestBody UserDTO request) throws organizationNotFound,BranchNotFoundEception{
		return new ResponseEntity<UserDTO>(userService.createBranchOperator(orgId,branchId,request),HttpStatus.CREATED);
	}
	
	@GetMapping("/getBranchOperats")
	public ResponseEntity<? extends Object> getAllBranchOperator(@PathVariable String orgId,@PathVariable String branchId) throws organizationNotFound,BranchNotFoundEception{
		return new ResponseEntity<List<UserDTO>>(userService.getAllBranchOperator(orgId,branchId),HttpStatus.OK);
	}
	
}
