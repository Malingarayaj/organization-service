package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class ListAssessmetDTO {
	
	private String response;

    private String assesmentName;    
	
	private String year;
	
	private List<ExamsResponseDTO> exams=new ArrayList<ExamsResponseDTO>();	

	public String getAssesmentName() {
		return assesmentName;
	}

	public void setAssesmentName(String assesmentName) {
		this.assesmentName = assesmentName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public List<ExamsResponseDTO> getExams() {
		return exams;
	}

	public void setExams(List<ExamsResponseDTO> exams) {
		this.exams = exams;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	
	
	
}
