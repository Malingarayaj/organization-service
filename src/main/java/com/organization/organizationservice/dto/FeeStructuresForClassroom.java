package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class FeeStructuresForClassroom {
	
	private String response;

	private List<FeeStructureForClassroom> feestructures=new ArrayList<FeeStructureForClassroom>();

	public List<FeeStructureForClassroom> getFeestructures() {
		return feestructures;
	}

	public void setFeestructures(List<FeeStructureForClassroom> feestructures) {
		this.feestructures = feestructures;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
}
