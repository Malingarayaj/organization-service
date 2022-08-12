package com.organization.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.organizationservice.entity.OrganizationAdmin;

public interface OrganizationAdminRepo extends JpaRepository<OrganizationAdmin, String>{

}
