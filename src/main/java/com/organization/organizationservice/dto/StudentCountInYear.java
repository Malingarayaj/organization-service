package com.organization.organizationservice.dto;

public class StudentCountInYear {

	private String name;
	
	private int size;

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentCountInYear [name=" + name + ", size=" + size + "]";
	}

	
	
}
