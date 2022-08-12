package com.organization.organizationservice.dto;

public class BookDetailsOfStudentDTO {

	private String bookName;

	private String author;

	private String publication;

	private String studentId;

	private String approximateCost;

	private String issuedDate;

	private String returnDate;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getApproximateCost() {
		return approximateCost;
	}

	public void setApproximateCost(String approximateCost) {
		this.approximateCost = approximateCost;
	}

	public String getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}



}
