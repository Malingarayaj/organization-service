package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class FeesTransactionListDTO {

	private List<FeesTransactionResponseDTO> transactions = new ArrayList<FeesTransactionResponseDTO>();

	public List<FeesTransactionResponseDTO> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<FeesTransactionResponseDTO> transactions) {
		this.transactions = transactions;
	}	
	
	
}
