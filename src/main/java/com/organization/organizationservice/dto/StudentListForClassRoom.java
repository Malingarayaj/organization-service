package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class StudentListForClassRoom{
	@Override
	public String toString() {
		return "StudentListForClassRoom [response=" + response + ", Students="
				+ Students + "]";
	}

	private String response;
	
	private List<StudentInfoForClassRoomDTO> Students = new ArrayList<StudentInfoForClassRoomDTO>();

	public List<StudentInfoForClassRoomDTO> getStudents() {
		return Students;
	}

	public void setStudents(List<StudentInfoForClassRoomDTO> students) {
		Students = students;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	
	
	
}
