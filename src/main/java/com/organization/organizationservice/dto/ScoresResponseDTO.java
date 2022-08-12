package com.organization.organizationservice.dto;

public class ScoresResponseDTO {
	
	private String subject;

	private String grade;

	private double obtainedScore;
	
	
	
	private double maxScore;
	
	private String passed;
	
	

	public ScoresResponseDTO() {
		super();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	public double getObtainedScore() {
		return obtainedScore;
	}

	public void setObtainedScore(double obtainedScore) {
		this.obtainedScore = obtainedScore;
	}

	public double getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(double maxScore) {
		this.maxScore = maxScore;
	}

	

	

	public String getPassed() {
		return passed;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}

	

	

	public ScoresResponseDTO(String subject, String grade,
			double obtainedScore, double maxScore, String passed) {
		super();
		this.subject = subject;
		this.grade = grade;
		this.obtainedScore = obtainedScore;
		this.maxScore = maxScore;
		this.passed = passed;
	}

	public ScoresResponseDTO(String subject, double obtainedScore) {
		super();
		this.subject = subject;
		this.obtainedScore = obtainedScore;
	}

	@Override
	public String toString() {
		return "ScoresResponseDTO [subject=" + subject + ", grade=" + grade
				+ ", obtainedScore=" + obtainedScore + ", maxScore=" + maxScore
				+ ", passed=" + passed + "]";
	}

	

	
}
