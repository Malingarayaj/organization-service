package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class StudentListDTO {
	
	private String response;

	private @JsonProperty("students") List<StudentInfoDTO> students = new ArrayList<StudentInfoDTO>();

	public StudentListDTO() {
		super();
	}
	public List<StudentInfoDTO> getStudents() {
		return students;
	}

	public void setStudents(List<StudentInfoDTO> students) {
		this.students = students;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
