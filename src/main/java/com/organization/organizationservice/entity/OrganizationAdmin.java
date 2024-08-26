package com.organization.organizationservice.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@PrimaryKeyJoinColumn(name = "userId")
@Table(name = "organizationAdmin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationAdmin extends User{
	
	@OneToOne
	@JoinColumn(name = "orgId",nullable = false)
	private Organization organization;

}
