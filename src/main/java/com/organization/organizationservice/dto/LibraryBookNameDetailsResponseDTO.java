package com.organization.organizationservice.dto;

public class LibraryBookNameDetailsResponseDTO {

	private String publication;

	private String bookName;

	private String author;

	private String approximateCost;

	private String bookId;

	private String bookVersion;

	private String issuedTo;

	private String issuedDate;

	private String returnDate;
	
	private String returnByDate;	

	public String getReturnByDate() {
		return returnByDate;
	}

	public void setReturnByDate(String returnByDate) {
		this.returnByDate = returnByDate;
	}

	public String getIssuedTo() {
		return issuedTo;
	}

	public void setIssuedTo(String issuedTo) {
		this.issuedTo = issuedTo;
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

	public String getBookVersion() {
		return bookVersion;
	}

	public void setBookVersion(String bookVersion) {
		this.bookVersion = bookVersion;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
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

	public String getApproximateCost() {
		return approximateCost;
	}

	public void setApproximateCost(String approximateCost) {
		this.approximateCost = approximateCost;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}


}
