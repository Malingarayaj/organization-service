package com.organization.organizationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FacultyLeaveSummaryDetails {
	
	String response;
	
    private String noOfCasualLeaves;
	
	private String noOfSickLeaves;	

	private String noOfEarnedLeave;
	
	public String getResponse() {
		return response;
	}

	public String getNoOfCasualLeaves() {
		return noOfCasualLeaves;
	}

	public void setNoOfCasualLeaves(String noOfCasualLeaves) {
		this.noOfCasualLeaves = noOfCasualLeaves;
	}

	public String getNoOfSickLeaves() {
		return noOfSickLeaves;
	}

	public void setNoOfSickLeaves(String noOfSickLeaves) {
		this.noOfSickLeaves = noOfSickLeaves;
	}

	public String getNoOfEarnedLeave() {
		return noOfEarnedLeave;
	}

	public void setNoOfEarnedLeave(String noOfEarnedLeave) {
		this.noOfEarnedLeave = noOfEarnedLeave;
	}

	public void setResponse(String response) {
		this.response = response;
	}


	

	

}
