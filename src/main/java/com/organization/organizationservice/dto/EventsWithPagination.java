package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class EventsWithPagination {
	
	private String response;

	private List< EventResponseDTO> eventList = new ArrayList<EventResponseDTO>();
	
	private long total;

	private long offset;

	private long limit;

	public List<EventResponseDTO> getEventList() {
		return eventList;
	}

	public void setEventList(List<EventResponseDTO> eventList) {
		this.eventList = eventList;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getOffset() {
		return offset;
	}

	public void setOffset(long offset) {
		this.offset = offset;
	}

	public long getLimit() {
		return limit;
	}

	public void setLimit(long limit) {
		this.limit = limit;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
	
	
}
