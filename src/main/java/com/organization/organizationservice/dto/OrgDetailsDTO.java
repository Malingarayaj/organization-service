package com.organization.organizationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OrgDetailsDTO {
	
	private String response;

	private @JsonProperty("orgName") String orgName;
	
	private @JsonProperty("address") String address;
	
	private @JsonProperty("pincode") String pincode;
	
	private @JsonProperty("orgId") String orgId;
	
	private @JsonProperty("boardOfEducation")
	String boardOfEducation;

	private @JsonProperty("recognizedBy")
	String recognizedBy;

	private @JsonProperty("affiliationNumber")
	String affiliationNumber;
	
	private @JsonProperty("faxNumber") String faxNumber;
		
		
	public String getFaxNumber() {
			return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
			this.faxNumber = faxNumber;
	}
	
	private String adminName;

	public String getBoardOfEducation() {
		return boardOfEducation;
	}

	public void setBoardOfEducation(String boardOfEducation) {
		this.boardOfEducation = boardOfEducation;
	}

	public String getRecognizedBy() {
		return recognizedBy;
	}

	public void setRecognizedBy(String recognizedBy) {
		this.recognizedBy = recognizedBy;
	}

	public String getAffiliationNumber() {
		return affiliationNumber;
	}

	public void setAffiliationNumber(String affiliationNumber) {
		this.affiliationNumber = affiliationNumber;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}