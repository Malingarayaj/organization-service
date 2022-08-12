package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class ListOfVehicleIds {
	
	private String response;
	
    private List<RepsonseVehicleId> vehicles = new ArrayList<RepsonseVehicleId>();

	public List<RepsonseVehicleId> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<RepsonseVehicleId> vehicles) {
		this.vehicles = vehicles;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
