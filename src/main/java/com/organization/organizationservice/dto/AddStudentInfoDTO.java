package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentInfoDTO {

	private String studentFirstName;

	private String studentLastName;

	private String dateOfBirth;

	private String fatherFirstName;

	private String motherFirstName;

	private String fatherLastName;

	private String motherLastName;

	private String yearOfJoining;

	private String caste;

	private String religion;

	private String admissionDate;

	private String classRoomId;

	private String rollnumber;

	private String standard;

	private String section;

	private String correspondingYear;

	private String nationality;

	private String userName;

	private String password;

	private String localAddress;

	private String permanentAddress;
	
	private float discountAmount;
	
   private String gender;
		
   private String blood;
   
   private List<EmailDTO> emails = new ArrayList<EmailDTO>();

	private List<PhoneNumberDTO> phoneNumbers = new ArrayList<PhoneNumberDTO>();

	 
	 
  	

}
