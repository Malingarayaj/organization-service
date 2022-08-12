package com.organization.organizationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(content = Include.NON_NULL)
public class OrgRequest {

	@JsonProperty("orgId")
	private String orgId;

	@JsonProperty("orgName")
	private String orgName;

	@JsonProperty("orgAddress")
	private String orgAddress;

	@JsonProperty("pincode")
	private String pincode;

	@JsonProperty("boardOfEducation")
	private String boardOfEducation;

	@JsonProperty("affiliationNumber")
	private String affiliationNumber;

	@JsonProperty("faxNumber")
	private String faxNumber;

	@JsonProperty("recognizedBy")
	private String recognizedBy;

}
