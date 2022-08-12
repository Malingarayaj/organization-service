package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class ClassroomFeestructurenew {
	
	
	private String response;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	private @JsonProperty("name") String name;

	private @JsonProperty("year") String year;

	private @JsonProperty("feeId") String feeId;
	
	private  @JsonProperty("oneTimeFees") List<OneTimeFeeResponseDTO> oneTimeFees = new ArrayList<OneTimeFeeResponseDTO>();
	
	private List<RecuringFeeModes> modes=new ArrayList<RecuringFeeModes>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getFeeId() {
		return feeId;
	}

	public void setFeeId(String feeId) {
		this.feeId = feeId;
	}

	public List<OneTimeFeeResponseDTO> getOneTimeFees() {
		return oneTimeFees;
	}

	public void setOneTimeFees(List<OneTimeFeeResponseDTO> oneTimeFees) {
		this.oneTimeFees = oneTimeFees;
	}

	public List<RecuringFeeModes> getModes() {
		return modes;
	}

	public void setModes(List<RecuringFeeModes> modes) {
		this.modes = modes;
	}

	@Override
	public String toString() {
		return "ClassroomFeestructurenew [name=" + name + ", year=" + year
				+ ", feeId=" + feeId + ", oneTimeFees=" + oneTimeFees
				+ ", modes=" + modes + "]";
	}
	
	
	
	
}
