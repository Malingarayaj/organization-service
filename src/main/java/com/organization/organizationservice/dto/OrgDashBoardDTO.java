package com.organization.organizationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OrgDashBoardDTO {

	private long branches = 0;
	
	private long students = 0;
	
	private long faculty = 0;
	
	private long vehicles = 0;
	
	private long feesTransactions = 0;
	
	private long assessments=0;
	
	private long events=0;
	
	private long holidays=0;
	
	private long classroom=0;
	
	private long books=0;
	
	private long listofTransactions=0;
	
	private long nooffacultyLeave=0;	
	
	private long noOfStudentBirthDay=0;
	
	
	
	
	
	public long getNoOfStudentBirthDay() {
		return noOfStudentBirthDay;
	}

	public void setNoOfStudentBirthDay(long noOfStudentBirthDay) {
		this.noOfStudentBirthDay = noOfStudentBirthDay;
	}

	public long getListofTransactions() {
		return listofTransactions;
	}

	public void setListofTransactions(long listofTransactions) {
		this.listofTransactions = listofTransactions;
	}

	public long getNooffacultyLeave() {
		return nooffacultyLeave;
	}

	public void setNooffacultyLeave(long nooffacultyLeave) {
		this.nooffacultyLeave = nooffacultyLeave;
	}

	public long getBooks() {
		return books;
	}

	public void setBooks(long books) {
		this.books = books;
	}

	public long getAssessments() {
		return assessments;
	}

	public void setAssessments(long assessments) {
		this.assessments = assessments;
	}

	public long getEvents() {
		return events;
	}

	public void setEvents(long events) {
		this.events = events;
	}

	public long getHolidays() {
		return holidays;
	}

	public void setHolidays(long holidays) {
		this.holidays = holidays;
	}

	public long getClassroom() {
		return classroom;
	}

	public void setClassroom(long classroom) {
		this.classroom = classroom;
	}

	public long getFeesTransactions() {
		return feesTransactions;
	}

	public void setFeesTransactions(long feesTransactions) {
		this.feesTransactions = feesTransactions;
	}

	public long getBranches() {
		return branches;
	}

	public void setBranches(long branches) {
		this.branches = branches;
	}

	public long getStudents() {
		return students;
	}

	public void setStudents(long students) {
		this.students = students;
	}

	public long getFaculty() {
		return faculty;
	}

	public void setFaculty(long faculty) {
		this.faculty = faculty;
	}

	public long getVehicles() {
		return vehicles;
	}

	public void setVehicles(long vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "OrgDashBoardDTO [branches=" + branches + ", students="
				+ students + ", faculty=" + faculty + ", vehicles=" + vehicles
				+ ", feesTransactions=" + feesTransactions + ", assessments="
				+ assessments + ", events=" + events + ", holidays=" + holidays
				+ ", classroom=" + classroom + ", books=" + books
				+ ", listofTransactions=" + listofTransactions
				+ ", nooffacultyLeave=" + nooffacultyLeave
				+ ", noOfStudentBirthDay=" + noOfStudentBirthDay + "]";
	}	
	
	
}