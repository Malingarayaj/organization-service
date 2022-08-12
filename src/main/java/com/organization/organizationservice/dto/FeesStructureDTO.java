package com.organization.organizationservice.dto;


public class FeesStructureDTO {

	private String branchId;
	
	private String standard;
	
	private String syllabus;

	private long admissionFees;

	private long monthlyFees;

	private long sportsFees;

	private long booksFees;

	private long vanFees;

	private String year;
	
	private String feesId;
	
	private String totalAmount;
	
	public String getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getFeesId() {
		return feesId;
	}

	public void setFeesId(String feesId) {
		this.feesId = feesId;
	}

	public FeesStructureDTO() {
		super();
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public long getAdmissionFees() {
		return admissionFees;
	}

	public void setAdmissionFees(long admissionFees) {
		this.admissionFees = admissionFees;
	}

	public long getMonthlyFees() {
		return monthlyFees;
	}

	public void setMonthlyFees(long monthlyFees) {
		this.monthlyFees = monthlyFees;
	}

	public long getSportsFees() {
		return sportsFees;
	}

	public void setSportsFees(long sportsFees) {
		this.sportsFees = sportsFees;
	}

	public long getBooksFees() {
		return booksFees;
	}

	public void setBooksFees(long booksFees) {
		this.booksFees = booksFees;
	}

	public long getVanFees() {
		return vanFees;
	}

	public void setVanFees(long vanFees) {
		this.vanFees = vanFees;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}


}
