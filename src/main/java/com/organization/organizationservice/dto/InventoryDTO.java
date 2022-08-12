package com.organization.organizationservice.dto;

public class InventoryDTO {
	
	private String inventoryType;
	
	private String SerialNumber;
	
	private String yearOfManufacturer;
	
    private String approximateCost;
	
	private String  category;
	

	private String dateOfPurchase;
	
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}

	public String getYearOfManufacturer() {
		return yearOfManufacturer;
	}

	public void setYearOfManufacturer(String yearOfManufacturer) {
		this.yearOfManufacturer = yearOfManufacturer;
	}

	public String getApproximateCost() {
		return approximateCost;
	}

	public void setApproximateCost(String approximateCost) {
		this.approximateCost = approximateCost;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
