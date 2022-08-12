package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class oneTimeFees {
	
	 private List<OneTimeFeePostDTO> oneTimeFees =new ArrayList<OneTimeFeePostDTO>();

	public List<OneTimeFeePostDTO> getOneTimeFees() {
		return oneTimeFees;
	}

	public void setOneTimeFees(List<OneTimeFeePostDTO> oneTimeFees) {
		this.oneTimeFees = oneTimeFees;
	}
	 
}
