package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ClassroomRecurringFee {
	
	private @JsonProperty("monthyFees") List<RecurringFeeResponseDTO> monthyFees = new ArrayList<RecurringFeeResponseDTO>();	

	private @JsonProperty("quterlyFees") List<RecurringFeeResponseDTO> quterlyFees = new ArrayList<RecurringFeeResponseDTO>();

	private @JsonProperty("halfYearlyFees") List<RecurringFeeResponseDTO> halfYearlyFees = new ArrayList<RecurringFeeResponseDTO>();

	private @JsonProperty("yearlyFees") List<RecurringFeeResponseDTO> yearlyFees = new ArrayList<RecurringFeeResponseDTO>();

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

}
