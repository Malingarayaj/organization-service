package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class FeesStructureDTOList {
	
	private List<FeesStructureDTO> fees = new ArrayList<FeesStructureDTO>();

	public FeesStructureDTOList(List<FeesStructureDTO> fees) {
		super();
		this.fees = fees;
	}

	public FeesStructureDTOList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<FeesStructureDTO> getFees() {
		return fees;
	}

	public void setFees(List<FeesStructureDTO> fees) {
		this.fees = fees;
	}
	
}