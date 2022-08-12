package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EventListDTO {
	
	private String response;
	
	private List< EventResponseDTO> eventList = new ArrayList<EventResponseDTO>();

	public List<EventResponseDTO> getEventList() {
		return eventList;
	}

	public void setEventList(List<EventResponseDTO> eventList) {
		this.eventList = eventList;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	
	
}
