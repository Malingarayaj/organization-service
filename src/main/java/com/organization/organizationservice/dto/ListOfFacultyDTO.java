package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class ListOfFacultyDTO {

	private List<FacultyCountwithYear> facultyListWithYear=new ArrayList<FacultyCountwithYear>();

	public List<FacultyCountwithYear> getFacultyListWithYear() {
		return facultyListWithYear;
	}

	public void setFacultyListWithYear(
			List<FacultyCountwithYear> facultyListWithYear) {
		this.facultyListWithYear = facultyListWithYear;
	}
	
	
}
