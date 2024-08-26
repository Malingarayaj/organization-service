package com.organization.organizationservice.entity;

public enum TypeOfLeaves {

	SICK("SICK"), FLEXI("FLEXI"), EARN("EARN"), COMP_OFF("COMP_OFF"), RESTRICTED("RESTRICTED");

	String value;

	private TypeOfLeaves(String value) {
		this.value = value;
	}

}
