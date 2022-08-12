package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class ExpandFeeStructureResponseDTO {
	
	private String response;
	
	private String name;
	
	private String year;
	
	private String feeId;
	
	private List<OneTimeFeeResponseDTO> oneTimeFees=new ArrayList<OneTimeFeeResponseDTO>();
	
	private List<RecurringFeeResponseDTO> recurringFees=new ArrayList<RecurringFeeResponseDTO>();
	
	private double  oneTimeFeeTotal=0.0;		

	private double recurringFeeTotal=0.0;
	
	private double oneTimeFeeTotalWithDiscount=0.0;
	
	private double recurringFeeTotalWithDiscount=0.0;
	
	private String message;		

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getOneTimeFeeTotalWithDiscount() {
		return oneTimeFeeTotalWithDiscount;
	}

	public void setOneTimeFeeTotalWithDiscount(double oneTimeFeeTotalWithDiscount) {
		this.oneTimeFeeTotalWithDiscount = oneTimeFeeTotalWithDiscount;
	}

	public double getRecurringFeeTotalWithDiscount() {
		return recurringFeeTotalWithDiscount;
	}

	public void setRecurringFeeTotalWithDiscount(
			double recurringFeeTotalWithDiscount) {
		this.recurringFeeTotalWithDiscount = recurringFeeTotalWithDiscount;
	}

	public double getOneTimeFeeTotal() {
		return oneTimeFeeTotal;
	}

	public void setOneTimeFeeTotal(double oneTimeFeeTotal) {
		this.oneTimeFeeTotal = oneTimeFeeTotal;
	}

	public double getRecurringFeeTotal() {
		return recurringFeeTotal;
	}

	public void setRecurringFeeTotal(double recurringFeeTotal) {
		this.recurringFeeTotal = recurringFeeTotal;
	}

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

	public List<RecurringFeeResponseDTO> getRecurringFees() {
		return recurringFees;
	}

	public void setRecurringFees(List<RecurringFeeResponseDTO> recurringFees) {
		this.recurringFees = recurringFees;
	}

	public String getResponse() {
			return response;
		}

	public void setResponse(String response) {
			this.response = response;
		}
	
}
