package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ClassRoomListDTO {
	
	private String response;
	
	private @JsonProperty("classRoomLists") List<ClassRoomResponseDTO> classRoomLists = new ArrayList<ClassRoomResponseDTO>();

	public List<ClassRoomResponseDTO> getClassRoomLists() {
		return classRoomLists;
	}

	public void setClassRoomLists(List<ClassRoomResponseDTO> classRoomLists) {
		this.classRoomLists = classRoomLists;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	

}
