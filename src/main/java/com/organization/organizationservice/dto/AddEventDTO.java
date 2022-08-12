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
public class AddEventDTO {
	
	private String eventType;
	
	private String date;	
	
	private String time;
	
	private String to;

	private String standard;

	private String classRoomId;
	
	private String dressType;
	
	private String year;
	
	private String description;
	
	
	

}
