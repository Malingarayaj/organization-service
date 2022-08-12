package com.organization.organizationservice.dto;

public class ErrorMessageResponseDTO {
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ErrorMessageResponseDTO(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
}
