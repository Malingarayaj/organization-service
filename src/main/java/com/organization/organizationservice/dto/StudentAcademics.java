package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;


public class StudentAcademics {
	
	private List<AcademicDetail> academics=new ArrayList<AcademicDetail>();

	public List<AcademicDetail> getAcademics() {
		return academics;
	}

	public void setAcademics(List<AcademicDetail> academics) {
		this.academics = academics;
	}
	

}
