package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class FacultyListDTO {
	
	private String response;

	private List<FacultyResponseDTO> faculties = new ArrayList<FacultyResponseDTO>();
	
	private long total;
	
	private long offset;
	
	private long limit;

	public List<FacultyResponseDTO> getFaculties() {
		return faculties;
	}

	public void setFaculties(List<FacultyResponseDTO> faculties) {
		this.faculties = faculties;
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

	@Override
	public String toString() {
		return "FacultyListDTO [response=" + response + ", faculties="
				+ faculties + ", total=" + total + ", offset=" + offset
				+ ", limit=" + limit + "]";
	}
	
	
	
}