package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ListOfEmailsForClassRoom {
	
	private String response;
	
	private List<StudentEmailsDTO>    emails = new ArrayList<StudentEmailsDTO>();

	public List<StudentEmailsDTO> getEmails() {
		return emails;
	}

	public void setEmails(List<StudentEmailsDTO> emails) {
		this.emails = emails;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	
}
