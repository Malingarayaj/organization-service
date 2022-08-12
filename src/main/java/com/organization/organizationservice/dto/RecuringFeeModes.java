package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecuringFeeModes {

	
	private String mode;
	
	private  @JsonProperty("recurringFees") List<RecurringFeeResponseDTO> feeTypes=new ArrayList<RecurringFeeResponseDTO>();

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public List<RecurringFeeResponseDTO> getFeeTypes() {
		return feeTypes;
	}

	public void setFeeTypes(List<RecurringFeeResponseDTO> feeTypes) {
		this.feeTypes = feeTypes;
	}

	
	@Override
	public String toString() {
		return "RecuringFeeModes [mode=" + mode + ", feeTypes=" + feeTypes
				+ "]";
	}

	
}
