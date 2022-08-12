package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class VehicleIdsListsDTO {
	
	private List<VehcileIdsDTO>  vehicleLists = new ArrayList<VehcileIdsDTO>();

	public List<VehcileIdsDTO> getVehicleLists() {
		return vehicleLists;
	}

	public void setVehicleLists(List<VehcileIdsDTO> vehicleLists) {
		this.vehicleLists = vehicleLists;
	}
	
	

}
