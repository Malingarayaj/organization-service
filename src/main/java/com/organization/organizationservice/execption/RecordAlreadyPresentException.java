package com.organization.organizationservice.execption;

public class RecordAlreadyPresentException extends RuntimeException {
	public RecordAlreadyPresentException(String msg) {
		super(msg);
	}

}
