package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class FeeStructures {

	private String response;
	
	 private long total;

		private long offset;
		
		private long limit;
		
	
	private List<FeeStructure> feeStructure=new ArrayList<FeeStructure>();

	public List<FeeStructure> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(List<FeeStructure> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "FeeStructures [response=" + response + ", feeStructure="
				+ feeStructure + "]";
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

	
	
	
}
