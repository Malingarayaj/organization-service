package com.organization.organizationservice.dto;


public class FacultyLeaveSummaryDTO {

	private double noOfCasualLeaves;
	
	private double noOfSickLeaves;	

	private double noOfEarnedLeave;

	public double getNoOfCasualLeaves() {
		return noOfCasualLeaves;
	}

	public void setNoOfCasualLeaves(double noOfCasualLeaves) {
		this.noOfCasualLeaves = noOfCasualLeaves;
	}

	public double getNoOfSickLeaves() {
		return noOfSickLeaves;
	}

	public void setNoOfSickLeaves(double noOfSickLeaves) {
		this.noOfSickLeaves = noOfSickLeaves;
	}

	public double getNoOfEarnedLeave() {
		return noOfEarnedLeave;
	}

	public void setNoOfEarnedLeave(double noOfEarnedLeave) {
		this.noOfEarnedLeave = noOfEarnedLeave;
	}

	
}
