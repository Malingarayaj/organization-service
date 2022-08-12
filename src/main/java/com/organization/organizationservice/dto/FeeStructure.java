package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FeeStructure {

	private @JsonProperty("name") String name;

	private @JsonProperty("year") String year;

	private @JsonProperty("feeId") String feeId;

	private  @JsonProperty("oneTimeFees") List<OneTimeFeeResponseDTO> oneTimeFees = new ArrayList<OneTimeFeeResponseDTO>();

	private @JsonProperty("monthyFees") List<RecurringFeeResponseDTO> monthyFees = new ArrayList<RecurringFeeResponseDTO>();	

	private @JsonProperty("quterlyFees") List<RecurringFeeResponseDTO> quterlyFees = new ArrayList<RecurringFeeResponseDTO>();

	private @JsonProperty("halfYearlyFees") List<RecurringFeeResponseDTO> halfYearlyFees = new ArrayList<RecurringFeeResponseDTO>();

	private @JsonProperty("yearlyFees") List<RecurringFeeResponseDTO> yearlyFees = new ArrayList<RecurringFeeResponseDTO>();

	private @JsonProperty("halfYearlyTotalFee") double halfYearlyTotalFee;
	
	private @JsonProperty("oneTimeTotalFee")  double oneTimeTotalFee;
	
	private @JsonProperty("quterlyTotalFee") double quterlyTotalFee;
	
	private @JsonProperty("monthyTotalFee") double monthyTotalFee;

	private @JsonProperty("yearlyTotalFee") double yearlyTotalFee;
	
	public double getOneTimeTotalFee() {
		return oneTimeTotalFee;
	}

	public void setOneTimeTotalFee(double oneTimeTotalFee) {
		this.oneTimeTotalFee = oneTimeTotalFee;
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

	public List<RecurringFeeResponseDTO> getMonthyFees() {
		return monthyFees;
	}

	public void setMonthyFees(List<RecurringFeeResponseDTO> monthyFees) {
		this.monthyFees = monthyFees;
	}

	public List<RecurringFeeResponseDTO> getQuterlyFees() {
		return quterlyFees;
	}

	public void setQuterlyFees(List<RecurringFeeResponseDTO> quterlyFees) {
		this.quterlyFees = quterlyFees;
	}

	public List<RecurringFeeResponseDTO> getHalfYearlyFees() {
		return halfYearlyFees;
	}

	public void setHalfYearlyFees(List<RecurringFeeResponseDTO> halfYearlyFees) {
		this.halfYearlyFees = halfYearlyFees;
	}

	public List<RecurringFeeResponseDTO> getYearlyFees() {
		return yearlyFees;
	}

	public void setYearlyFees(List<RecurringFeeResponseDTO> yearlyFees) {
		this.yearlyFees = yearlyFees;
	}

	public double getHalfYearlyTotalFee() {
		return halfYearlyTotalFee;
	}

	public void setHalfYearlyTotalFee(double halfYearlyTotalFee) {
		this.halfYearlyTotalFee = halfYearlyTotalFee;
	}

	public double getQuterlyTotalFee() {
		return quterlyTotalFee;
	}

	public void setQuterlyTotalFee(double quterlyTotalFee) {
		this.quterlyTotalFee = quterlyTotalFee;
	}

	public double getMonthyTotalFee() {
		return monthyTotalFee;
	}

	public void setMonthyTotalFee(double monthyTotalFee) {
		this.monthyTotalFee = monthyTotalFee;
	}

	public double getYearlyTotalFee() {
		return yearlyTotalFee;
	}

	public void setYearlyTotalFee(double yearlyTotalFee) {
		this.yearlyTotalFee = yearlyTotalFee;
	}

	

}
