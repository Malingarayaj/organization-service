package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class ListFacultyIdResponse {
	
	private String response;
	
	private List<FacultyIdResponseDTO> faculties = new ArrayList<FacultyIdResponseDTO>();

	public List<FacultyIdResponseDTO> getFaculties() {
		return faculties;
	}

	public void setFaculties(List<FacultyIdResponseDTO> faculties) {
		this.faculties = faculties;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	

}
