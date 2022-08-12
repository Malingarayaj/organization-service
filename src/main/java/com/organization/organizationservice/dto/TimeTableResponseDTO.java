//package com.organization.organizationservice.dto;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonInclude.Include;
//import com.icarat.eshiksha.mongodb.dto.DayPeriodsDTO;
//
//@JsonInclude(Include.NON_NULL)
//public class TimeTableResponseDTO {
//	
//	private String response;
//	
//	private String standard;
//	
//	private String section;
//	
//	private String year;
//	
//	private List<DayPeriodsDTO> monday = new ArrayList<DayPeriodsDTO>();
//
//	private List<DayPeriodsDTO> tuesday=new ArrayList<DayPeriodsDTO>();;
//
//	private List<DayPeriodsDTO> wednesday=new ArrayList<DayPeriodsDTO>();;
//
//	private List<DayPeriodsDTO> thursday=new ArrayList<DayPeriodsDTO>();;
//
//	private List<DayPeriodsDTO> friday=new ArrayList<DayPeriodsDTO>();;
//
//	private List<DayPeriodsDTO> saturday=new ArrayList<DayPeriodsDTO>();
//	
//	
//
//	public TimeTableResponseDTO() {
//		super();
//	}
//
//	public TimeTableResponseDTO(String standard, String section, String year,
//			List<DayPeriodsDTO> monday, List<DayPeriodsDTO> tuesday,
//			List<DayPeriodsDTO> wednesday, List<DayPeriodsDTO> thursday,
//			List<DayPeriodsDTO> friday, List<DayPeriodsDTO> saturday) {
//		super();
//		this.standard = standard;
//		this.section = section;
//		this.year = year;
//		this.monday = monday;
//		this.tuesday = tuesday;
//		this.wednesday = wednesday;
//		this.thursday = thursday;
//		this.friday = friday;
//		this.saturday = saturday;
//	}
//
//	public String getStandard() {
//		return standard;
//	}
//
//	public void setStandard(String standard) {
//		this.standard = standard;
//	}
//
//	public String getSection() {
//		return section;
//	}
//
//	public void setSection(String section) {
//		this.section = section;
//	}
//
//	public String getYear() {
//		return year;
//	}
//
//	public void setYear(String year) {
//		this.year = year;
//	}
//
//	public List<DayPeriodsDTO> getMonday() {
//		return monday;
//	}
//
//	public void setMonday(List<DayPeriodsDTO> monday) {
//		this.monday = monday;
//	}
//
//	public List<DayPeriodsDTO> getTuesday() {
//		return tuesday;
//	}
//
//	public void setTuesday(List<DayPeriodsDTO> tuesday) {
//		this.tuesday = tuesday;
//	}
//
//	public List<DayPeriodsDTO> getWednesday() {
//		return wednesday;
//	}
//
//	public void setWednesday(List<DayPeriodsDTO> wednesday) {
//		this.wednesday = wednesday;
//	}
//
//	public List<DayPeriodsDTO> getThursday() {
//		return thursday;
//	}
//
//	public void setThursday(List<DayPeriodsDTO> thursday) {
//		this.thursday = thursday;
//	}
//
//	public List<DayPeriodsDTO> getFriday() {
//		return friday;
//	}
//
//	public void setFriday(List<DayPeriodsDTO> friday) {
//		this.friday = friday;
//	}
//
//	public List<DayPeriodsDTO> getSaturday() {
//		return saturday;
//	}
//
//	public void setSaturday(List<DayPeriodsDTO> saturday) {
//		this.saturday = saturday;
//	}
//
//	public String getResponse() {
//		return response;
//	}
//
//	public void setResponse(String response) {
//		this.response = response;
//	}
//
//	@Override
//	public String toString() {
//		return "TimeTableResponseDTO [response=" + response + ", standard="
//				+ standard + ", section=" + section + ", year=" + year
//				+ ", monday=" + monday + ", tuesday=" + tuesday
//				+ ", wednesday=" + wednesday + ", thursday=" + thursday
//				+ ", friday=" + friday + ", saturday=" + saturday + "]";
//	};
//
//	
//
//
//}
