package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class ListOfBooks {
	
	private String response;
	
	private List<LibraryBookNameDetailsResponseDTO>  libraryDetailsLists = new ArrayList<LibraryBookNameDetailsResponseDTO>();

	public List<LibraryBookNameDetailsResponseDTO> getLibraryDetailsLists() {
		return libraryDetailsLists;
	}

	public void setLibraryDetailsLists(
			List<LibraryBookNameDetailsResponseDTO> libraryDetailsLists) {
		this.libraryDetailsLists = libraryDetailsLists;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
