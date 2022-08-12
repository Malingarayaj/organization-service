package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(Include.NON_NULL)
public class FacultyResponseDTO {

	private String facultyId;

	private String qualification;

	private String dateOfJoining;

	private String fullName;

	private String dateOfBirth;

	private String comments;

	private String localAddress;

	private String permanentAddress;

	private String fatherFirstName;

	private String fatherLastName;
	
	private String gender;
		
	private String blood;
	 
	private boolean permanent;
		
	private String staffId;
	

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
	public boolean isPermanent() {
			return permanent;
	}

	public void setPermanent(boolean permanent) {
			this.permanent = permanent;
	}
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

	private @JsonProperty("firstName")
	String firstName;

	private @JsonProperty("lastName")
	String lastName;

	private @JsonProperty("emails")
	List<EmailDTO> emails = new ArrayList<EmailDTO>();

	private @JsonProperty("phoneNumbers")
	List<PhoneNumberDTO> phoneNumbers = new ArrayList<PhoneNumberDTO>();

	private int noOfExperience;

	private String designation;

	public int getNoOfExperience() {
		return noOfExperience;
	}

	public void setNoOfExperience(int noOfExperience) {
		this.noOfExperience = noOfExperience;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getFatherFirstName() {
		return fatherFirstName;
	}

	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}

	public String getFatherLastName() {
		return fatherLastName;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getFacultyId() {
		return facultyId;
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

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "FacultyResponseDTO [facultyId=" + facultyId
				+ ", qualification=" + qualification + ", dateOfJoining="
				+ dateOfJoining + ", fullName=" + fullName + ", dateOfBirth="
				+ dateOfBirth + ", comments=" + comments + ", localAddress="
				+ localAddress + ", permanentAddress=" + permanentAddress
				+ ", fatherFirstName=" + fatherFirstName + ", fatherLastName="
				+ fatherLastName + ", gender=" + gender + ", blood=" + blood
				+ ", permanent=" + permanent + ", staffId=" + staffId
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emails=" + emails + ", phoneNumbers=" + phoneNumbers
				+ ", noOfExperience=" + noOfExperience + ", designation="
				+ designation + "]";
	}
	
	
	

}
