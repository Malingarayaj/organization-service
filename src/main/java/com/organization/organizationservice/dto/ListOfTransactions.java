package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ListOfTransactions {
	
	private String response;

	private List<TransactionResponseDTO>   transactions=new ArrayList<TransactionResponseDTO>();
	
	

	public List<TransactionResponseDTO> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionResponseDTO> transactions) {
		this.transactions = transactions;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	
	
}
