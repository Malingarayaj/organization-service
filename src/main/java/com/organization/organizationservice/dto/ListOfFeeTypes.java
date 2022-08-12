package com.organization.organizationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ListOfFeeTypes {

	private String response;
	
	private String feeTypes[];

	public String[] getFeeTypes() {
		return feeTypes;
	}

	public ListOfFeeTypes() {
		super();
	}

	public void setFeeTypes(String[] feeTypes) {
		this.feeTypes = feeTypes;
	}

	public ListOfFeeTypes(String[] feeTypes) {
		super();
		this.feeTypes = feeTypes;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
	
}
