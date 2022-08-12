package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class ListOfVehicalesDTO {
	
	private List<VehicleCountWithYear> vehicales=new ArrayList<VehicleCountWithYear>();

	public List<VehicleCountWithYear> getVehicales() {
		return vehicales;
	}

	public void setVehicales(List<VehicleCountWithYear> vehicales) {
		this.vehicales = vehicales;
	}	

}
