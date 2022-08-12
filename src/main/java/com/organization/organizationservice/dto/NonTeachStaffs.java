package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class NonTeachStaffs {
	
	private String response;
	
	private List<NonTeachStaffDetailDTO> nonTeachStaffs=new ArrayList<NonTeachStaffDetailDTO>();

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<NonTeachStaffDetailDTO> getNonTeachStaffs() {
		return nonTeachStaffs;
	}

	public void setNonTeachStaffs(List<NonTeachStaffDetailDTO> nonTeachStaffs) {
		this.nonTeachStaffs = nonTeachStaffs;
	}
	
	
	

}
