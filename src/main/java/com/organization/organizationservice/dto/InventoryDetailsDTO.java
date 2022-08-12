package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class InventoryDetailsDTO {
	
	private String response;
	
	private List<InventoryResponseDTO> inventories = new ArrayList<InventoryResponseDTO>();

	public List<InventoryResponseDTO> getInventories() {
		return inventories;
	}

	public void setInventories(List<InventoryResponseDTO> inventories) {
		this.inventories = inventories;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
