package com.organization.organizationservice.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="BranchManagerTable")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchManager extends User {

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orgId")
	private Organization org;
	
	
	@OneToOne
	@JoinColumn(name = "branchId")
	private Branch branch;
}
