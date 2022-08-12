package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BookListDTO {
	
	private String response;

	private List<BookDetailsOfStudentDTO>   booksTakenByStud = new ArrayList<BookDetailsOfStudentDTO>();

	public List<BookDetailsOfStudentDTO> getBooksTakenByStud() {
		return booksTakenByStud;
	}

	public void setBooksTakenByStud(List<BookDetailsOfStudentDTO> booksTakenByStud) {
		this.booksTakenByStud = booksTakenByStud;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
	
}
