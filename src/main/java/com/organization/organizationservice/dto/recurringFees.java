package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class recurringFees {
	private List<RecurringFeePostDTO> recurringFees=new ArrayList<RecurringFeePostDTO>();

	public List<RecurringFeePostDTO> getRecurringFees() {
		return recurringFees;
	}

	public void setRecurringFees(List<RecurringFeePostDTO> recurringFees) {
		this.recurringFees = recurringFees;
	}
	

}
