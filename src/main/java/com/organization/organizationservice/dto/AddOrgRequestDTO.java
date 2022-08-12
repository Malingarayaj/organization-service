/**
 * 
 */
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
@JsonInclude(Include.NON_NULL)
public class AddOrgRequestDTO {

	private @JsonProperty("orgName")
	String orgName;

	private @JsonProperty("address")
	String address;

	private @JsonProperty("pincode")
	String pincode;

	private @JsonProperty("boardOfEducation")
	String boardOfEducation;

	private @JsonProperty("recognizedBy")
	String recognizedBy;

	private @JsonProperty("affiliationNumber")
	String affiliationNumber;
	
   private @JsonProperty("faxNumber") String faxNumber;
	
}
