package com.organization.organizationservice.service;

import java.util.List;
import java.util.Map;

import com.organization.organizationservice.dto.BranchRequestDTO;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;

public interface BranchService {

	String createBranch(BranchRequestDTO dto, String orgId)throws organizationNotFound,BranchNotFoundEception;

	List<BranchRequestDTO> getAllBranches(String orgId);

	BranchRequestDTO getBranchById(String orgId, String branchId)throws organizationNotFound,BranchNotFoundEception;

	BranchRequestDTO updateBranchById(String orgId, String branchId, BranchRequestDTO dto)throws organizationNotFound;

	Map<Boolean, String> diableBranch(String orgId, String branchId)throws organizationNotFound,BranchNotFoundEception;

	BranchRequestDTO getBranchByIdAndBranchName(String orgId, String branchId, String branchName)throws organizationNotFound,BranchNotFoundEception;

	List<BranchRequestDTO> getBranchsByIdAndBranchName(String orgId, String branchId, String branchName)throws organizationNotFound,BranchNotFoundEception;

}
