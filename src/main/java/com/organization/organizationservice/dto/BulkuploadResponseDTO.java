package com.organization.organizationservice.dto;

public class BulkuploadResponseDTO {
	
private String errorMessage;

public String getErrorMessage() {
	return errorMessage;
}

public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}

public BulkuploadResponseDTO(String errorMessage) {
	super();
	this.errorMessage = errorMessage;
}

}
