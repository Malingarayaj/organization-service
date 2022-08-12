package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ClassroomFeeStructure {

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
	
	private  @JsonProperty("recurringFees") List<RecurringFeesDTO> recurringFees=new ArrayList<RecurringFeesDTO>();

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

	public List<RecurringFeesDTO> getRecurringFees() {
		return recurringFees;
	}

	public void setRecurringFees(List<RecurringFeesDTO> recurringFees) {
		this.recurringFees = recurringFees;
	}
	
	
	
}
