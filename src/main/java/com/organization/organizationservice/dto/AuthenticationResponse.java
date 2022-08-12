package com.organization.organizationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse  {

	private static final long serialVersionUID = -6624726180748515507L;
	private String token;

	
}
