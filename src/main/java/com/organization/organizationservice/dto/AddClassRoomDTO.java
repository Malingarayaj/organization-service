package com.organization.organizationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddClassRoomDTO {

	
	private String classRoomId;
	
	private String standard;

	private String section;

	private String year;

	private String syllabus;
	
	private int maxcount;
	
}
