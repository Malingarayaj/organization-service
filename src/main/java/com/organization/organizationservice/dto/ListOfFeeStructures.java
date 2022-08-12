package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ListOfFeeStructures {
	
    private long total;

	private long offset;
	
	private long limit;
	
	
	private String response;

	private List<ExpandFeeStructureResponseDTO>  feeStructures=new ArrayList<ExpandFeeStructureResponseDTO>();
	
	

	public List<ExpandFeeStructureResponseDTO> getFeeStructures() {
		return feeStructures;
	}

	public void setFeeStructures(List<ExpandFeeStructureResponseDTO> feeStructures) {
		this.feeStructures = feeStructures;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
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

	@Override
	public String toString() {
		return "ListOfFeeStructures [total=" + total + ", offset=" + offset
				+ ", limit=" + limit + ", response=" + response
				+ ", feeStructures=" + feeStructures + "]";
	}
	
	
}
