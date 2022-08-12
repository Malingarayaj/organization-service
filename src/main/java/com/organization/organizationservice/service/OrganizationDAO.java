package com.organization.organizationservice.service;

import java.util.List;

import com.organization.organizationservice.dto.OrgAdminDTO;
import com.organization.organizationservice.dto.OrgRequest;
import com.organization.organizationservice.exception.AffiliationNumberAlreadyExist;
import com.organization.organizationservice.execption.organizationNotFound;

public interface OrganizationDAO {

	String createOrganization(OrgRequest request)throws AffiliationNumberAlreadyExist;

	List<OrgRequest> getAllOrgnization();

	OrgRequest getOrgnizationById(String orgId);

	OrgRequest updateOrgById(OrgRequest request, String orgId)throws organizationNotFound;

	List<OrgAdminDTO> getAllOrgnizationAdmin();



}
