package com.organization.organizationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddVehicleDTO {

	
	private String vehicleType;
	
	private String vehicleRegNo;
	
	private String vehicleModel;
	
	private String yearOfManufacter;
	
	private int seatCapacity;
	
	private String insuranceRenewal;
	
	private String nextRenewalDate;
	
	private String dateOfPurchase;
	
	
	
}
