package com.organization.organizationservice.entity;

public enum AbsenceRequestType {
	SICK(6), FLEXI(2), EARNED(12), RESTRICTED(2), COMP(1);

	int value;

	 AbsenceRequestType(int val) {
		this.value = val;
	}
}
