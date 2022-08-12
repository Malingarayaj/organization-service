package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class ListBranchInfoWithListStudentCountDTO {
	String response;
	
List<StudentCountWithYear> studentCountWithYear=new ArrayList<StudentCountWithYear>();

public String getResponse() {
	return response;
}

public void setResponse(String response) {
	this.response = response;
}

public List<StudentCountWithYear> getStudentCountWithYear() {
	return studentCountWithYear;
}

public void setStudentCountWithYear(
		List<StudentCountWithYear> studentCountWithYear) {
	this.studentCountWithYear = studentCountWithYear;
}

}
