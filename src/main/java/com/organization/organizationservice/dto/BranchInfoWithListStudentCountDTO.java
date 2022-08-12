package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class BranchInfoWithListStudentCountDTO {
	
	private	String branchId;
	private	String branchName;	
	private List<StudentCountWithYearDTO> studentCountWithYearDTO=new ArrayList<StudentCountWithYearDTO>();
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public List<StudentCountWithYearDTO> getStudentCountWithYearDTO() {
		return studentCountWithYearDTO;
	}
	public void setStudentCountWithYearDTO(
			List<StudentCountWithYearDTO> studentCountWithYearDTO) {
		this.studentCountWithYearDTO = studentCountWithYearDTO;
	}
	

}
