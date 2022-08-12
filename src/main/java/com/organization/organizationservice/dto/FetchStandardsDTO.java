package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FetchStandardsDTO {
	
	private String response;

	private String[] standards;
	
	private List<ClassRoomNames> classroomnames=new ArrayList<ClassRoomNames>();
	
	public FetchStandardsDTO() {
	}
	public List<ClassRoomNames> getClassroomnames() {
		return classroomnames;
	}
	public void setClassroomnames(List<ClassRoomNames> classroomnames) {
		this.classroomnames = classroomnames;
	}
	public FetchStandardsDTO(String[] standards) {
		super();
		this.standards = standards;
	}

	public String[] getStandards() {
		return standards;
	}

	public void setStandards(String[] standards) {
		this.standards = standards;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "FetchStandardsDTO [response=" + response + ", standards="
				+ Arrays.toString(standards) + ", classroomnames="
				+ classroomnames + "]";
	}



	
	

	
	
	
}
