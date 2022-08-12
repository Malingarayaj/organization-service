package com.organization.organizationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class AddFeesStructureDTO {

	private String standard;
	
	private String syllabus;

	private long admissionFees;

	private long monthlyFees;

	private long sportsFees;

	private long booksFees;

	private long vanFees;

	private String year;
	
	

}
