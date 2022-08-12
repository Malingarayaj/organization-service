package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class UserResponseDTO {
	
	private String response;

	private @JsonProperty("userId")
	String userId;

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

	private @JsonProperty("type")
	String type;

	private @JsonProperty("orgName")
	String orgName;

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

	
	public String getOrgName() {
		return orgName;
	}


	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public UserResponseDTO() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	
}
