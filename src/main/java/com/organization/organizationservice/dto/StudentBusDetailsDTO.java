package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class StudentBusDetailsDTO {
	
	public List<VehicleStaff> getVehicaleStaff() {
		return vehicaleStaff;
	}

	public void setVehicaleStaff(List<VehicleStaff> vehicaleStaff) {
		this.vehicaleStaff = vehicaleStaff;
	}

	private String response;
	
	private String vehicleId;
	
	private String vehicleNumber;	

	private String routeName;	
	
	private String boardingPoint;
	
	private String pickUpTime;
	
	private String dropTime;
	
	private String seatCapacity;
	
	private String routeNumber;
	
	private List<VehicleStaff> vehicaleStaff=new ArrayList<VehicleStaff>();
	
	public String getRouteNumber() {
		return routeNumber;
	}

	public void setRouteNumber(String routeNumber) {
		this.routeNumber = routeNumber;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(String seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public String getDropTime() {
		return dropTime;
	}

	public void setDropTime(String dropTime) {
		this.dropTime = dropTime;
	}



	
	
	

}
