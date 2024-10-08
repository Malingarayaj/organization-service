package com.organization.organizationservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Organization")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
	@Id @GeneratedValue(generator="organizationIdGenerator")
	@GenericGenerator(name="organizationIdGenerator", strategy = "com.organization.organizationservice.entity.OrganizationIdGenerator")
	private String orgId;
	private String orgName;
	private String orgAddress;
	private String pincode;
	private String boardOfEducation;
	private String affiliationNumber;
	private String faxNumber;
	private String recognizedBy;
	private boolean isActive;
	private String email;
	
	public Organization(String orgId,String orgName,String orgAddress,String pincode,String boardOfEducation,String affiliationNumber
			,String faxNumber,String recognizedBy,boolean isActive,String email) {
		this.orgId=orgId;
		this.orgName=orgName;
		this.orgAddress=orgAddress;
		this.pincode=pincode;
		this.boardOfEducation=boardOfEducation;
		this.affiliationNumber=affiliationNumber;
		this.faxNumber=faxNumber;
		this.recognizedBy=recognizedBy;
		this.isActive=isActive;
		this.email=email;		
	}
	@OneToOne
	private OrganizationAdmin organizationAdmin;
	
	@OneToMany(mappedBy = "org",fetch  = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Branch> branches=new ArrayList<>();

	@OneToOne
	private User user;
	
	@OneToMany(mappedBy = "org",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Student> studentsList;
}
