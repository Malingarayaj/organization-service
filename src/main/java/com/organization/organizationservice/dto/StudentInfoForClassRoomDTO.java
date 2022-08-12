package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class StudentInfoForClassRoomDTO {

	@Override
	public String toString() {
		return "StudentInfoForClassRoomDTO [studentId=" + studentId
				+ ", studentName=" + studentName + ", rollNumber=" + rollNumber
				+ ", year=" + year + ", standard=" + standard
				+ ", dateOfBirth=" + dateOfBirth + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", yearOfJoining="
				+ yearOfJoining + ", emails=" + emails + ", phoneNumber="
				+ phoneNumber + ", phoneNumbers=" + phoneNumbers + ", gender="
				+ gender + ", blood=" + blood + ", isPromoted=" + isPromoted
				+ "]";
	}

	private String studentId;

	private String studentName;

	private String rollNumber;

	private String year;

	private String standard;

	private String dateOfBirth;

	private String fatherName;

	private String motherName;

	private String yearOfJoining;

	private List<EmailDTO> emails = new ArrayList<EmailDTO>();
	
	private String phoneNumber;

	private List<PhoneNumberDTO> phoneNumbers = new ArrayList<PhoneNumberDTO>();

	private String gender;

	private String blood;
	
    private String isPromoted;

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

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(String yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIsPromoted() {
		return isPromoted;
	}

	public void setIsPromoted(String isPromoted) {
		this.isPromoted = isPromoted;
	}
	
	

}
