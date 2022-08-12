package com.organization.organizationservice.dto;

public class RecurringFeePostDTO {
	
	private String type;
	
	private double amount;
	
	private String mode;

	private int noOfInstalments;	
	
	public int getNoOfInstalments() {
		return noOfInstalments;
	}

	public void setNoOfInstalments(int noOfInstalments) {
		this.noOfInstalments = noOfInstalments;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	

}
