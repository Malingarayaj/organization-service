package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class ExpandFeeStrurePostDTO {
	
	
	private String name;
	
	private String year;
	
    private List<OneTimeFeePostDTO> oneTimeFees =new ArrayList<OneTimeFeePostDTO>();
    
    private List<RecurringFeePostDTO> recurringFees=new ArrayList<RecurringFeePostDTO>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public List<OneTimeFeePostDTO> getOneTimeFees() {
		return oneTimeFees;
	}

	public void setOneTimeFees(List<OneTimeFeePostDTO> oneTimeFees) {
		this.oneTimeFees = oneTimeFees;
	}

	public List<RecurringFeePostDTO> getRecurringFees() {
		return recurringFees;
	}

	public void setRecurringFees(List<RecurringFeePostDTO> recurringFees) {
		this.recurringFees = recurringFees;
	}
    
    
}
