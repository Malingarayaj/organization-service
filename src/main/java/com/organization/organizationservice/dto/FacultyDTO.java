package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FacultyDTO {

	private String firstName;

	private String lastName;

	private String fatherFirstName;

	private String fatherLastName;

	private String qualification;

	private String dateOfJoining;

	private String dateOfBirth;

	private String comments;

	private String localAddress;

	private String permanentAddress;

	private @JsonProperty("emails")
	List<EmailDTO> emails = new ArrayList<EmailDTO>();

	private @JsonProperty("phoneNumbers")
	List<PhoneNumberDTO> phoneNumbers = new ArrayList<PhoneNumberDTO>();

	private int noOfExperience;

	private String designation;

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
		return "FacultyDTO [firstName=" + firstName + ", lastName=" + lastName
				+ ", fatherFirstName=" + fatherFirstName + ", fatherLastName="
				+ fatherLastName + ", qualification=" + qualification
				+ ", dateOfJoining=" + dateOfJoining + ", dateOfBirth="
				+ dateOfBirth + ", comments=" + comments + ", localAddress="
				+ localAddress + ", permanentAddress=" + permanentAddress
				+ ", emails=" + emails + ", phoneNumbers=" + phoneNumbers
				+ ", noOfExperience=" + noOfExperience + ", designation="
				+ designation + ", gender=" + gender + ", blood=" + blood
				+ ", permanent=" + permanent + ", staffId=" + staffId + "]";
	}

}
