package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class ListFacultyLeaveResponseDTO {
private List<FacultyLeaveResponseDTO> facultyLeaveResponseDTO=new ArrayList<FacultyLeaveResponseDTO>();

public List<FacultyLeaveResponseDTO> getFacultyLeaveResponseDTO() {
	return facultyLeaveResponseDTO;
}

public void setFacultyLeaveResponseDTO(
		List<FacultyLeaveResponseDTO> facultyLeaveResponseDTO) {
	this.facultyLeaveResponseDTO = facultyLeaveResponseDTO;
}

}
