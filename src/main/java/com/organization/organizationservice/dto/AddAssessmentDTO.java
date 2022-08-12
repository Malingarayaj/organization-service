package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddAssessmentDTO {

	private String assesmentName;
	
	private String year;
	
	private List<ExamDetailsDTO> exams = new ArrayList<ExamDetailsDTO>();
	
	
}
