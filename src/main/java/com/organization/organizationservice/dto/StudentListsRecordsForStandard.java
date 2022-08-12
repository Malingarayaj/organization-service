package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class StudentListsRecordsForStandard {
	
	private List<StudentRecordsPerStandardDTO> studentLists = new ArrayList<StudentRecordsPerStandardDTO>();

	public List<StudentRecordsPerStandardDTO> getStudentLists() {
		return studentLists;
	}

	public void setStudentLists(List<StudentRecordsPerStandardDTO> studentLists) {
		this.studentLists = studentLists;
	}
	
}
