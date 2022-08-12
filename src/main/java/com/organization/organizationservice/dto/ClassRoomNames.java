package com.organization.organizationservice.dto;

public class ClassRoomNames {
	
	private String name;
	
	private String classroomId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(String classroomid) {
		this.classroomId = classroomid;
	}

	@Override
	public String toString() {
		return "ClassRoomNames [name=" + name + ", classroomid=" + classroomId
				+ "]";
	}

}
