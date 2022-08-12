package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class ListStudentCountInOrganizationDTO {
	
	
	private List<StudentCountInOrganizationDTO> studentCountInOrganizationDTO=new ArrayList<StudentCountInOrganizationDTO>();

	public List<StudentCountInOrganizationDTO> getStudentCountInOrganizationDTO() {
		return studentCountInOrganizationDTO;
	}

	public void setStudentCountInOrganizationDTO(
			List<StudentCountInOrganizationDTO> studentCountInOrganizationDTO) {
		this.studentCountInOrganizationDTO = studentCountInOrganizationDTO;
	}
	

	
}
