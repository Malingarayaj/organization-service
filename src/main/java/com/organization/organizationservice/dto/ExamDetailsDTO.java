package com.organization.organizationservice.dto;

public class ExamDetailsDTO {

	private String subjectName;

	private String date;

	private String startTime;
	
	private String endTime;
	
	private int maxMarks;
	
		
	public ExamDetailsDTO(String subjectName, String date, String startTime, String endTime, int maxMarks) {
		super();
		this.subjectName = subjectName;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.maxMarks = maxMarks;
		
	}	

	public ExamDetailsDTO() {
		super();
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectId(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	
}
