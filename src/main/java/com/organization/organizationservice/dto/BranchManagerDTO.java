package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class BranchManagerDTO {

	private @JsonProperty("userName")
	String userName;

	private @JsonProperty("password")
	String password;

	private @JsonProperty("firstName")
	String firstName;

	private @JsonProperty("lastName")
	String lastName;

	private @JsonProperty("emails")
	List<EmailDTO> emails = new ArrayList<EmailDTO>();

	private @JsonProperty("phoneNumbers")
	List<PhoneNumberDTO> phoneNumbers = new ArrayList<PhoneNumberDTO>();

	private @JsonProperty("branchId")
	String branchId;

	private @JsonProperty("branchName")
	String branchName;

	private @JsonProperty("type")
	String type = "BranchManager";

	private @JsonProperty("gender")
	String gender;

	 private @JsonProperty("blood") String blood;
	 
	 
	  	public String getBlood() {
	  		return blood;
	  	}
	  	public void setBlood(String blood) {
	  		this.blood = blood;
	  	}	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BranchManagerDTO() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<EmailDTO> getEmails() {
		return emails;
	}

	public void setEmails(List<EmailDTO> emails) {
		this.emails = emails;
	}

	public List<PhoneNumberDTO> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumberDTO> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

}
