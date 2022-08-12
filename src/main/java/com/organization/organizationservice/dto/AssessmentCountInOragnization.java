package com.organization.organizationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssessmentCountInOragnization {
	private	String branchId;
	private	String branchName;
	private String assessmentCount;

}
