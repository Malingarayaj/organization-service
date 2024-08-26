package com.organization.organizationservice.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.organization.organizationservice.dto.UserDTO;
import com.organization.organizationservice.entity.Users;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;

public interface UserService {

	UserDTO createOgAdmin(String orgId, UserDTO request)throws organizationNotFound;

	UserDTO createBranchManager(String orgId,  String branchId,UserDTO request) throws organizationNotFound,BranchNotFoundEception;

	UserDTO createBranchOperator(String orgId, String branchId, UserDTO request)throws organizationNotFound,BranchNotFoundEception;
	
	List<UserDTO> getAllBranchOperator(String orgId, String branchId)throws organizationNotFound,BranchNotFoundEception;

	ResponseEntity<?> addUser(Users user);

	Iterable<Users> displayAllUsers();

	ResponseEntity<?> searchUsersById(BigInteger searchUserId);

	Object updateUser(Users user, BigInteger uId);

	void deleteUser(BigInteger userId);


}
