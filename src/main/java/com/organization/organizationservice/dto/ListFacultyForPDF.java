package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class ListFacultyForPDF {
	
	private String response;
	
	private List<FacultyResponseDTO> faculties = new ArrayList<FacultyResponseDTO>();

	public List<FacultyResponseDTO> getFaculties() {
		return faculties;
	}

	public void setFaculties(List<FacultyResponseDTO> faculties) {
		this.faculties = faculties;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
	
}
