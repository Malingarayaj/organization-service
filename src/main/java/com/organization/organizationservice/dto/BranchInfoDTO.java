/**
 * 
 */
package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class BranchInfoDTO {

	private @JsonProperty("branchName")
	String branchName;

	private @JsonProperty("address")
	String address;

	private @JsonProperty("pincode")
	String pincode;

	private @JsonProperty("Emails")
	List<EmailDTO> Emails = new ArrayList<EmailDTO>();

	private @JsonProperty("PhoneNumbers")
	List<PhoneNumberDTO> PhoneNumbers = new ArrayList<PhoneNumberDTO>();
	
	private String masterEmailId;

	private String masterEmailPassword;	

	private String faxNumber;

	/**
	 * 
	 */
	
	
	public BranchInfoDTO() {
		super();
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

	public List<EmailDTO> getEmails() {
		return Emails;
	}

	public void setEmails(List<EmailDTO> emails) {
		Emails = emails;
	}

	public List<PhoneNumberDTO> getPhoneNumbers() {
		return PhoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumberDTO> phoneNumbers) {
		PhoneNumbers = phoneNumbers;
	}

	
	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	
	
}
