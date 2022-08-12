package com.organization.organizationservice.dto;

public class FetchSectionsDTO {

	private String section;
	
	private String classRoomId;
	
	public String getClassRoomId() {
		return classRoomId;
	}

	public void setClassRoomId(String classRoomId) {
		this.classRoomId = classRoomId;
	}

	public FetchSectionsDTO() {
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	

}