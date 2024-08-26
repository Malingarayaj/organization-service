package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransferCertificateReportDTO {
	
	private String response;
	
	private List<StudentTcStResponseDTO> details = new ArrayList<StudentTcStResponseDTO>();

	public List<StudentTcStResponseDTO> getDetails() {
		return details;
	}

	public void setDetails(List<StudentTcStResponseDTO> details) {
		this.details = details;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
