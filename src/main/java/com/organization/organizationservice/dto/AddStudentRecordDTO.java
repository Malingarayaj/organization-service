package com.organization.organizationservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentRecordDTO {

	private int age;
	
	private String admissionDate;

	private String rollnumber;

	private String standard;

	private String section;

	private String correspondingYear;
	
	private float discountAmount;	

}
