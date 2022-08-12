package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentBasicInfoListDTO {

	private @JsonProperty("students") List<StudentInfFileDTO> studentsInfoBasic = new ArrayList<StudentInfFileDTO>();

	public List<StudentInfFileDTO> getStudentsInfoBasic() {
		return studentsInfoBasic;
	}

	public void setStudentsInfoBasic(List<StudentInfFileDTO> studentsInfoBasic) {
		this.studentsInfoBasic = studentsInfoBasic;
	}
	
	
}
