package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class VehicleRouteDTO {
	
	private String name;
	
	private String routeNumber;
	
	private String startingPoint;
	
	private String endingPoint;
	
	private List<BoardingPointDTO> boardingPoints=new ArrayList<BoardingPointDTO>();
	
	public String getRouteNumber() {
		return routeNumber;
	}

	public void setRouteNumber(String routeNumber) {
		this.routeNumber = routeNumber;
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

	public List<BoardingPointDTO> getBoardingPoints() {
		return boardingPoints;
	}

	public void setBoardingPoints(List<BoardingPointDTO> boardingPoints) {
		this.boardingPoints = boardingPoints;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
