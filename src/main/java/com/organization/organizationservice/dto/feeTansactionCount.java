package com.organization.organizationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class feeTansactionCount {
	
	private String response;

	private int feeTransactions;

	public int getFeeTransactions() {
		return feeTransactions;
	}

	public void setFeeTransactions(int feeTransactions) {
		this.feeTransactions = feeTransactions;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
