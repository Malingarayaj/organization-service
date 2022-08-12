package com.organization.organizationservice.dto;

public class SuccessMessageResponseDTO {
	private String successMessage;

	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}

	public SuccessMessageResponseDTO(String successMessage) {
		super();
		this.successMessage = successMessage;
	}
	

}
