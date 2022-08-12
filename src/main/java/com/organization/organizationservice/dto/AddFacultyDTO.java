package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class AddFacultyDTO {
	
	
	private String response;

	private @JsonProperty("firstName")
	String firstName;

	private @JsonProperty("lastName")
	String lastName;

	private String qualification;

	private String dateOfJoining;

	private String dateOfBirth;

	private String comments;

	private String fatherFirstName;

	private String fatherlastName;

	private String localAddress;

	private String permanentAddress;

	private String branchName;

	private String branchAddress;

	private String userName;

	private String password;

	private int noOfExperience;

	private String designation;

	private String gender;

	private String blood;

	private boolean permanent;

	private String staffId;	
  
	private @JsonProperty("emails")
	List<EmailDTO> emails = new ArrayList<EmailDTO>();

	private @JsonProperty("phoneNumbers")
	List<PhoneNumberDTO> phoneNumbers = new ArrayList<PhoneNumberDTO>();

	
	
}
