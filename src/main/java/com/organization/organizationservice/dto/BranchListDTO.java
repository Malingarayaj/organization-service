package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BranchListDTO {
	
	private String response;

	private @JsonProperty("branches") List<BranchDetailsDTO> branches = new ArrayList<BranchDetailsDTO>();

	public BranchListDTO() {
		super();
	}

	public BranchListDTO(List<BranchDetailsDTO> branches) {
		super();
		this.branches = branches;
	}

	public List<BranchDetailsDTO> getBranches() {
		return branches;
	}

	public void setBranches(List<BranchDetailsDTO> branches) {
		this.branches = branches;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	

}
