package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class ExamListsDTO {

	private List<ExamDetailsDTO> examLists = new ArrayList<ExamDetailsDTO>();

	public List<ExamDetailsDTO> getExamLists() {
		return examLists;
	}

	public void setExamLists(List<ExamDetailsDTO> examLists) {
		this.examLists = examLists;
	}

}
