package com.organization.organizationservice.dto;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardingPointDetailDTO {
	
	private long boardingPointId;
	
	private Time pickTime;

	private Time dropTime;

	private String latitude;

	private String longitude;
	
	private String boardingPointName;

	

}
