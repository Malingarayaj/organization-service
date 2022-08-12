package com.organization.organizationservice.service;

import java.util.List;

import com.organization.organizationservice.dto.UserDTO;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;

public interface UserService {

	UserDTO createOgAdmin(String orgId, UserDTO request)throws organizationNotFound;

	UserDTO createBranchManager(String orgId,  String branchId,UserDTO request) throws organizationNotFound,BranchNotFoundEception;

	UserDTO createBranchOperator(String orgId, String branchId, UserDTO request)throws organizationNotFound,BranchNotFoundEception;
	
	List<UserDTO> getAllBranchOperator(String orgId, String branchId)throws organizationNotFound,BranchNotFoundEception;


}
