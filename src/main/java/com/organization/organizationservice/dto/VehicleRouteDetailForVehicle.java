package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class VehicleRouteDetailForVehicle {
	
	private String response;
	
	private long vehicleRouteId;
	
	private String name;
	
	private String routeNumber;

	private String startingPoint;
	
	private String endingPoint;
	
	private List<BoardingPointDetailDTO> boardingPoints=new ArrayList<BoardingPointDetailDTO>();
	
	private List<NonTeachStaffDetailDTO> nonTeachStaffs=new ArrayList<NonTeachStaffDetailDTO>();
	
	public List<NonTeachStaffDetailDTO> getNonTeachStaffs() {
		return nonTeachStaffs;
	}

	public void setNonTeachStaffs(List<NonTeachStaffDetailDTO> nonTeachStaffs) {
		this.nonTeachStaffs = nonTeachStaffs;
	}

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
	public String getResponse() {
			return response;
	}

	public void setResponse(String response) {
			this.response = response;
	}

}
