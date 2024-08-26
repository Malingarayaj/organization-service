package com.organization.organizationservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organization.organizationservice.entity.Branch;
@Repository
public interface BranchRepository extends JpaRepository<Branch, String> {

	public Optional<Branch> findByBranchId(String branchId);

	public Branch findByBranchIdAndBranchName(String branchId, String branchName);

	public Branch findByBranchName(String branchName);

}
