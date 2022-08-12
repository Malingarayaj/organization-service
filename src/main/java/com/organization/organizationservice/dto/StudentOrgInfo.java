package com.organization.organizationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author 
 *
 */
@JsonInclude(Include.NON_NULL)
public class StudentOrgInfo {
    
	
	private String response;
	
	private String firstName;
	
	private String lastName;
	
	private String correspondingYear;
	
	private String std;
	
	private String sec;
	
	private int rollnum;
	
	private BranchInfoDTO branchInfo;
	
	private OrgDetailsDTO orgInfo;
	
	private FacultyDTO facultyInfo;

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

	public String getCorrespondingYear() {
		return correspondingYear;
	}

	public void setCorrespondingYear(String correspondingYear) {
		this.correspondingYear = correspondingYear;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public BranchInfoDTO getBranchInfo() {
		return branchInfo;
	}

	public void setBranchInfo(BranchInfoDTO branchInfo) {
		this.branchInfo = branchInfo;
	}

	public OrgDetailsDTO getOrgInfo() {
		return orgInfo;
	}

	public void setOrgInfo(OrgDetailsDTO orgInfo) {
		this.orgInfo = orgInfo;
	}

	public FacultyDTO getFacultyInfo() {
		return facultyInfo;
	}

	public void setFacultyInfo(FacultyDTO facultyInfo) {
		this.facultyInfo = facultyInfo;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}