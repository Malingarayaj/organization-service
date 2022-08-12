package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BranchOperatorListDTO {
	
	private String response;

	private List<BranchOperatorDTO> branchOperators = new ArrayList<BranchOperatorDTO>();

	public BranchOperatorListDTO(List<BranchOperatorDTO> branchOperators) {
		super();
		this.branchOperators = branchOperators;
	}

	public BranchOperatorListDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<BranchOperatorDTO> getBranchOperators() {
		return branchOperators;
	}

	public void setBranchOperators(List<BranchOperatorDTO> branchOperators) {
		this.branchOperators = branchOperators;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}