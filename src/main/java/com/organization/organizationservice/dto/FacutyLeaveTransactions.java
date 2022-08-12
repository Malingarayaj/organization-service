package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FacutyLeaveTransactions {
	
	private String response;
	
	private List<FacultyLeaveTransactionsDTO> leaveTransactionsDTOs=new ArrayList<FacultyLeaveTransactionsDTO>();

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<FacultyLeaveTransactionsDTO> getLeaveTransactionsDTOs() {
		return leaveTransactionsDTOs;
	}

	public void setLeaveTransactionsDTOs(
			List<FacultyLeaveTransactionsDTO> leaveTransactionsDTOs) {
		this.leaveTransactionsDTOs = leaveTransactionsDTOs;
	}
	
	

}
