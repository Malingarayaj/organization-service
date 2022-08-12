package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;


public class UpdatedAssessmentDTO {

    private String assesmentName;
	
	private String year;
	
	private List<ExamsResponseDTO> updatedExams = new ArrayList<ExamsResponseDTO>();
	
	private List<ExamsResponseDTO> addedExams = new ArrayList<ExamsResponseDTO>();
	
	private List<String> deletedExamsId = new ArrayList<String>();

	public String getAssesmentName() {
		return assesmentName;
	}

	public void setAssesmentName(String assesmentName) {
		this.assesmentName = assesmentName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public List<ExamsResponseDTO> getUpdatedExams() {
		return updatedExams;
	}

	public void setUpdatedExams(List<ExamsResponseDTO> updatedExams) {
		this.updatedExams = updatedExams;
	}

	public List<ExamsResponseDTO> getAddedExams() {
		return addedExams;
	}

	public void setAddedExams(List<ExamsResponseDTO> addedExams) {
		this.addedExams = addedExams;
	}

	public List<String> getDeletedExamsId() {
		return deletedExamsId;
	}

	public void setDeletedExamsId(List<String> deletedExamsId) {
		this.deletedExamsId = deletedExamsId;
	}
	
	
}
