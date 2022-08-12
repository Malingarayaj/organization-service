package com.organization.organizationservice.dto;

public class FeeDetailsResponseDTO {
	
	
    private double amount;	
	
	private String type;	
	
	private String mode;
	
	private int feeDetailsId;
	
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

	public int getFeeDetailsId() {
		return feeDetailsId;
	}

	public void setFeeDetailsId(int feeDetailsId) {
		this.feeDetailsId = feeDetailsId;
	}
	
	
}
