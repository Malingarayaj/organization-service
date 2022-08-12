package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class VehicleRoutesDetailsDTO {
	
	private long vehicleRouteId;
	
	private String name;
	
	private String routeNumber;

	private String startingPoint;
	
	private String endingPoint;
	
	private List<BoardingPointDetailDTO> boardingPoints=new ArrayList<BoardingPointDetailDTO>();

	public long getVehicleRouteId() {
		return vehicleRouteId;
	}

	public void setVehicleRouteId(long vehicleRouteId) {
		this.vehicleRouteId = vehicleRouteId;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getEndingPoint() {
		return endingPoint;
	}

	public void setEndingPoint(String endingPoint) {
		this.endingPoint = endingPoint;
	}

	public List<BoardingPointDetailDTO> getBoardingPoints() {
		return boardingPoints;
	}

	public void setBoardingPoints(List<BoardingPointDetailDTO> boardingPoints) {
		this.boardingPoints = boardingPoints;
	}
	public String getRouteNumber() {
		return routeNumber;
	}

	public void setRouteNumber(String routeNumber) {
		this.routeNumber = routeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
