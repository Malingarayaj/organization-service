package com.organization.organizationservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organization.organizationservice.entity.Organization;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization, String> {

	//Organization findByOrgId(String orgId);
	Optional<Organization> findByOrgId(String orgId);

	public String findByAffiliationNumber(String affiliationNumber);


}
