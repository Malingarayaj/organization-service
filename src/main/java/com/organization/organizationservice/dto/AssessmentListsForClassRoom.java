package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class AssessmentListsForClassRoom {
	
	String response;
	
	private List<AssessementsForCLassRoomDTO>  assessmentLists = new ArrayList<AssessementsForCLassRoomDTO>();

	
}
