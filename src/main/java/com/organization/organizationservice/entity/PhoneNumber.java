package com.organization.organizationservice.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNumber implements Serializable{
	

	
	private String phoneNumber;
	private String type;

}
