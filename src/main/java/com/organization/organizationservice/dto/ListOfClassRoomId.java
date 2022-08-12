package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ListOfClassRoomId {
	
	private String response;
	
	private List<ClassRoomIdDTO> classRooms = new ArrayList<ClassRoomIdDTO>();

	public List<ClassRoomIdDTO> getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(List<ClassRoomIdDTO> classRooms) {
		this.classRooms = classRooms;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
