package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SubjectListDTO {
	
	private String response;

	private List<SubjectResponseDTO> subjects = new ArrayList<SubjectResponseDTO>();

	public List<SubjectResponseDTO> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectResponseDTO> subjects) {
		this.subjects = subjects;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	

}
