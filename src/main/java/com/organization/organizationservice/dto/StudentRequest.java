package com.organization.organizationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {

	private String studentId;
	
	private String userName;

	private String password;

	private String studentFirstName;

	private String studentLastName;

	private String dob;

	private String fatherFirstName;

	private String fatherLastName;

	private String motherFirstName;

	private String motherLastName;

	private boolean isActive = true;

	private String yearOfJoining;

	private String currentClass;

	private String currentSeection;

	private String currentAdmissionYear;

	private String currentRollNumber;

	private String caste;

	private String syllabusType;

	private String religion;

	private String nationality;

	private String localAddress;

	private String paramananentAddress;

	private float discountAmount;

	private String classRoomId;

}
