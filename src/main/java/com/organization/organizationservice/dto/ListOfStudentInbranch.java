package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudentInbranch {
	
	private String name;
	
	private String branchId;
	
	private int size;
	
	private List<StudentCountInYear> children=new ArrayList<StudentCountInYear>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<StudentCountInYear> getChildren() {
		return children;
	}

	public void setChildren(List<StudentCountInYear> children) {
		this.children = children;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListOfStudentInbranch [name=" + name + ", branchId=" + branchId
				+ ", size=" + size + ", children=" + children + "]";
	}

	

	

	
	
	

}
