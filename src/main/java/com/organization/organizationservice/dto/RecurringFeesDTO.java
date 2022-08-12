package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RecurringFeesDTO {

private String feeType;

private @JsonProperty("feeDetails") RecurringFeeResponseDTO feeDetails =new RecurringFeeResponseDTO();



public RecurringFeeResponseDTO getFeeDetails() {
	return feeDetails;
}

public void setFeeDetails(RecurringFeeResponseDTO feeDetails) {
	this.feeDetails = feeDetails;
}

public String getFeeType() {
	return feeType;
}

public void setFeeType(String feeType) {
	this.feeType = feeType;
}	



}
