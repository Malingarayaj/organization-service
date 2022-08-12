package com.organization.organizationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class VehicleStaff {
	
	private String name;
	
	private String role;
	
	private String phoneNumber;
	
	private String secondryPhoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSecondryPhoneNumber() {
		return secondryPhoneNumber;
	}

	public void setSecondryPhoneNumber(String secondryPhoneNumber) {
		this.secondryPhoneNumber = secondryPhoneNumber;
	}
	
	
	

}
