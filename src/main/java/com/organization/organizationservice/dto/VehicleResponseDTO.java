package com.organization.organizationservice.dto;

public class VehicleResponseDTO {
	  	
	private String vehicleId;
	
	private String vehicleType;
	
	private String vehicleRegNo;
  
	private String vehicleModel;
	
	private int seatCapacity;
	
	private String yearOfManufacter;
	
	private String insuranceRenewal;
	
	private String nextRenewalDate;
	
	private String dateOfPurchase;
	
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
		
	public String getVehicleRegNo() {
		return vehicleRegNo;
	}

	public void setVehicleRegNo(String vehicleRegNo) {
		this.vehicleRegNo = vehicleRegNo;
	}

	public String getInsuranceRenewal() {
		return insuranceRenewal;
	}

	public void setInsuranceRenewal(String insuranceRenewal) {
		this.insuranceRenewal = insuranceRenewal;
	}

	public String getNextRenewalDate() {
		return nextRenewalDate;
	}

	public void setNextRenewalDate(String nextRenewalDate) {
		this.nextRenewalDate = nextRenewalDate;
	}


	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getYearOfManufacter() {
		return yearOfManufacter;
	}

	public void setYearOfManufacter(String yearOfManufacter) {
		this.yearOfManufacter = yearOfManufacter;
	}

}
