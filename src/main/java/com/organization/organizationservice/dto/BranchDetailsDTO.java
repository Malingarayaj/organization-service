package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class BranchDetailsDTO {
	
	private String response;
	
    private @JsonProperty("orgName")  String orgName;
    
	private @JsonProperty("branchName") String branchName;

	private @JsonProperty("address") String address;

	private @JsonProperty("pincode") String pincode;

	private @JsonProperty("branchId") String branchId;
	
	private @JsonProperty("ManagerId") String userId;

	private String branchManagerName;

	private @JsonProperty("PhoneNumbers") List<PhoneNumberDTO> ManagerPhoneNumber = new ArrayList<PhoneNumberDTO>();


	private @JsonProperty("PhoneNumbers") List<PhoneNumberDTO> branchPhoneNumber = new ArrayList<PhoneNumberDTO>();


	private @JsonProperty("Emails") List<EmailDTO> branchEmail = new ArrayList<EmailDTO>();
	
	private String masterEmailId;

	private String masterEmailPassword;


	public BranchDetailsDTO() {
		super();
	}

	public BranchDetailsDTO(String branchName, String address, String pincode,
			String branchId) {
		super();
		this.branchName = branchName;
		this.address = address;
		this.pincode = pincode;
		this.branchId = branchId;
	}
	private String faxNumber;
	
	
	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	
	public String getMasterEmailId() {
		return masterEmailId;
	}

	public void setMasterEmailId(String masterEmailId) {
		this.masterEmailId = masterEmailId;
	}

	public String getMasterEmailPassword() {
		return masterEmailPassword;
	}

	public void setMasterEmailPassword(String masterEmailPassword) {
		this.masterEmailPassword = masterEmailPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public List<PhoneNumberDTO> getManagerPhoneNumber() {
		return ManagerPhoneNumber;
	}

	public void setManagerPhoneNumber(List<PhoneNumberDTO> managerPhoneNumber) {
		ManagerPhoneNumber = managerPhoneNumber;
	}

	public List<PhoneNumberDTO> getBranchPhoneNumber() {
		return branchPhoneNumber;
	}

	public void setBranchPhoneNumber(List<PhoneNumberDTO> branchPhoneNumber) {
		this.branchPhoneNumber = branchPhoneNumber;
	}

	public List<EmailDTO> getBranchEmail() {
		return branchEmail;
	}

	public void setBranchEmail(List<EmailDTO> branchEmail) {
		this.branchEmail = branchEmail;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
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

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchManagerName() {
		return branchManagerName;
	}

	public void setBranchManagerName(String branchManagerName) {
		this.branchManagerName = branchManagerName;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "BranchDetailsDTO [response=" + response + ", orgName="
				+ orgName + ", branchName=" + branchName + ", address="
				+ address + ", pincode=" + pincode + ", branchId=" + branchId
				+ ", userId=" + userId + ", branchManagerName="
				+ branchManagerName + ", ManagerPhoneNumber="
				+ ManagerPhoneNumber + ", branchPhoneNumber="
				+ branchPhoneNumber + ", branchEmail=" + branchEmail
				+ ", masterEmailId=" + masterEmailId + ", masterEmailPassword="
				+ masterEmailPassword + ", faxNumber=" + faxNumber + "]";
	}

	
	
	

}
