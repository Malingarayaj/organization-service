package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class StudentTcStResponseDTO {

	private String studentFirstName;

	private String studentLastName;

	private String fatherFirstName;

	private String fatherLastName;

	private String motherFirstname;

	private String motherLastName;

	private String fromStandard;

	private String toStandard;

	private String startYear;	

	private String endYear;
	
	private String userName;
	
	private String localAddress;
	
	private String permanentAddress;
	
	private String caste;
	
	private String nationality;
	
	private String dateOfBirth;
	
	private String relegion;
	
	private String syllubusType;
	
    private List<PhoneNumberDTO> phones = new ArrayList<PhoneNumberDTO>();
    
    private List<EmailDTO> emails = new ArrayList<EmailDTO>();
    
    private String gender;
		
    private String blood;
	 
	 
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
    
    public String getRelegion() {
		return relegion;
	}

	public void setRelegion(String relegion) {
		this.relegion = relegion;
	}

	public String getSyllubusType() {
		return syllubusType;
	}

	public void setSyllubusType(String syllubusType) {
		this.syllubusType = syllubusType;
	}

	public List<PhoneNumberDTO> getPhones() {
		return phones;
	}

	public void setPhones(List<PhoneNumberDTO> phones) {
		this.phones = phones;
	}

	public List<EmailDTO> getEmails() {
		return emails;
	}

	public void setEmails(List<EmailDTO> emails) {
		this.emails = emails;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
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

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}

	public String getMotherFirstname() {
		return motherFirstname;
	}

	public void setMotherFirstname(String motherFirstname) {
		this.motherFirstname = motherFirstname;
	}

	public String getMotherLastName() {
		return motherLastName;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public String getFromStandard() {
		return fromStandard;
	}

	public void setFromStandard(String fromStandard) {
		this.fromStandard = fromStandard;
	}

	public String getToStandard() {
		return toStandard;
	}

	public void setToStandard(String toStandard) {
		this.toStandard = toStandard;
	}

}
