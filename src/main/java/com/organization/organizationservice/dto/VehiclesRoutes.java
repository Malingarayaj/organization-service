package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class VehiclesRoutes {
	
  private String response;
  
  private List<VehicleRoutesDetailsDTO> vehicleRoutes=new ArrayList<VehicleRoutesDetailsDTO>();

  public String getResponse() {
	return response;
  }

  public void setResponse(String response) {
  	this.response = response;
  }

  public List<VehicleRoutesDetailsDTO> getVehicleRoutes() {
	return vehicleRoutes;
  }

  public void setVehicleRoutes(List<VehicleRoutesDetailsDTO> vehicleRoutes) {
	this.vehicleRoutes = vehicleRoutes;
   }
  
  
  

}
