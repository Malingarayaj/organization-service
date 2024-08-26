package com.organization.organizationservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

import com.organization.organizationservice.dto.OrgAdminDTO;
import com.organization.organizationservice.dto.OrgRequest;
import com.organization.organizationservice.exception.AffiliationNumberAlreadyExist;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.service.OrganizationDAO;

@RestController
@RequestMapping(value = "org")
public class OrganizationController {

	@Autowired
	private OrganizationDAO organizationDAO;

	@PostMapping(value="/save")
	public ResponseEntity<? extends Object> createOrganization(@RequestBody OrgRequest request)throws AffiliationNumberAlreadyExist {
		String response = organizationDAO.createOrganization(request);
		return new ResponseEntity<Object>(response, null)
	}

	@GetMapping("/all")
	public ResponseEntity<? extends Object> getAllOrgnization() {
		List<OrgRequest> response = organizationDAO.getAllOrgnization();
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("{orgId}")
	public ResponseEntity<? extends Object> getOrgnizationById(@RequestParam ("orgId") String orgId) throws organizationNotFound {
		OrgRequest response = organizationDAO.getOrgnizationById(orgId);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/{orgId}")
	public ResponseEntity<? extends Object> updateOrgById(@RequestBody OrgRequest request,@PathVariable String orgId) throws organizationNotFound {
		OrgRequest response = organizationDAO.updateOrgById(request,orgId);
		return ResponseEntity.ok(response);
	}
	
	
	@GetMapping("/adminInfo")
	public ResponseEntity<? extends Object> getAllOrgnizationAdmin() {
		List<OrgAdminDTO> response = organizationDAO.getAllOrgnizationAdmin();
		return ResponseEntity.ok(response);
	}

}
