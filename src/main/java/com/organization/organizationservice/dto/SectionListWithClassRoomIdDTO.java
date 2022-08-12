package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class SectionListWithClassRoomIdDTO {
	
	private String response;
	
	private List<FetchSectionsDTO>  sections = new ArrayList<FetchSectionsDTO>();

	public List<FetchSectionsDTO> getSections() {
		return sections;
	}

	public void setSections(List<FetchSectionsDTO> sections) {
		this.sections = sections;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
