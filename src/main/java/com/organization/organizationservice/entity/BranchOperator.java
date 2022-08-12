package com.organization.organizationservice.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@PrimaryKeyJoinColumn(name="userId")
@Table(name="BranchOperator")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchOperator extends User {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orgId")
	private Organization org;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "branchId")
	private Branch branch;

}
