package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BranchManagerListDTO {
	
	private String response;

	private List<BranchManagerDTO> branchManagers = new ArrayList<BranchManagerDTO>();

	public BranchManagerListDTO(List<BranchManagerDTO> branchManagers) {
		super();
		this.branchManagers = branchManagers;
	}

	public BranchManagerListDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<BranchManagerDTO> getBranchManagers() {
		return branchManagers;
	}

	public void setBranchManagers(List<BranchManagerDTO> branchManagers) {
		this.branchManagers = branchManagers;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}