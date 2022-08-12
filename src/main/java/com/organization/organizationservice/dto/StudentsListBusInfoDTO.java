package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class StudentsListBusInfoDTO {
	
	private String response;
	
	private List<StudentsBusDetailsDTO >   students = new ArrayList<StudentsBusDetailsDTO>();

	public List<StudentsBusDetailsDTO> getStudents() {
		return students;
	}

	public void setStudents(List<StudentsBusDetailsDTO> students) {
		this.students = students;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	

}
