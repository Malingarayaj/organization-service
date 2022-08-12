package com.organization.organizationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrgAdminDTO {
	
	private String adminId;
	
	private String firstName;
	
	private String lastName;
	
	private String orgName;
	
	private String gender;
	
	private String blood;
	
	private String email;
	
	private String phoneNumber;

}
