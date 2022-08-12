package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class StudentListsForRouteDTO {
	
	private String response;
	
	private List<StudentListsForVehicleRouteDTO> studentsLists = new ArrayList<StudentListsForVehicleRouteDTO>();

	public List<StudentListsForVehicleRouteDTO> getStudentsLists() {
		return studentsLists;
	}

	public void setStudentsLists(List<StudentListsForVehicleRouteDTO> studentsLists) {
		this.studentsLists = studentsLists;
	}

	@Override
	public String toString() {
		return "StudentListsForRouteDTO [studentsLists=" + studentsLists + ", getStudentsLists()=" + getStudentsLists()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
