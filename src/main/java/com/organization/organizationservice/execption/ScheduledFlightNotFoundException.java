package com.organization.organizationservice.execption;

public class ScheduledFlightNotFoundException extends RuntimeException {
	ScheduledFlightNotFoundException(String message){
		super(message);
	}

}
