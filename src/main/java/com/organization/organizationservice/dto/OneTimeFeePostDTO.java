package com.organization.organizationservice.dto;

public class OneTimeFeePostDTO {
	
	private String type;
	
	private double amount;
	
	private String payByDate;

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

	public String getPayByDate() {
		return payByDate;
	}

	public void setPayByDate(String payByDate) {
		this.payByDate = payByDate;
	}
	
	

}
