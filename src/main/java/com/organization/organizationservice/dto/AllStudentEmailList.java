package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllStudentEmailList {
	private List<StudentEmailsDTO>    emails = new ArrayList<StudentEmailsDTO>();

	
}
