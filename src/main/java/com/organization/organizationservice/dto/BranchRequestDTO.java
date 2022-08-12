package com.organization.organizationservice.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchRequestDTO implements Serializable {
	
	@JsonProperty("branchId")
	private String branchId;
	
	@JsonProperty("branchName")
	private String branchName;

	@JsonProperty("address")
	private String address;

	@JsonProperty("pincode")
	private String pincode;

	@JsonProperty("Emails")
	List<EmailDTO> Emails = new ArrayList<>();

	@JsonProperty("PhoneNumbers")
	List<PhoneNumberDTO> PhoneNumbers = new ArrayList<>();

	private String masterEmailId;

	private String masterEmailPassword;
	
	private String orgId;

	private String faxNumber;

}
