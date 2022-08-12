package com.organization.organizationservice.dto;

public class FeeDetailsDTO {
	
    private double amount;	
	
	private String type;
	
	private String mode;
	
	private String installmentDetails;	

	private String feeId;	
	
	public String getInstallmentDetails() {
		return installmentDetails;
	}

	public void setInstallmentDetails(String installmentDetails) {
		this.installmentDetails = installmentDetails;
	}

	public String getFeeId() {
		return feeId;
	}

	public void setFeeId(String feeId) {
		this.feeId = feeId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	

}
