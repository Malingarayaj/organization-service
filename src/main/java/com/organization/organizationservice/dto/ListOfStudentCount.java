package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ListOfStudentCount {
	
	
	private String response;
	
	private String name;
	
	private int size;
	
	private List<ListOfStudentInbranch> children=new ArrayList<ListOfStudentInbranch>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<ListOfStudentInbranch> getChildren() {
		return children;
	}

	public void setChildren(List<ListOfStudentInbranch> children) {
		this.children = children;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListOfStudentCount [name=" + name + ", size=" + size
				+ ", children=" + children + "]";
	}

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	

	


	
	

}
