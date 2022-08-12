package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardingPointsDTO {

	private long veicleRouteId;
	
	private List<BoardingPointDTO> boardingPoints=new ArrayList<BoardingPointDTO>();

	
}
