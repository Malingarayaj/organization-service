package com.organization.organizationservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.mail.MessagingException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.dto.OrgAdminDTO;
import com.organization.organizationservice.dto.OrgRequest;
import com.organization.organizationservice.entity.Organization;
import com.organization.organizationservice.entity.OrganizationAdmin;
import com.organization.organizationservice.exception.AffiliationNumberAlreadyExist;
import com.organization.organizationservice.exception.AlreadyOrganizationExist;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.repository.OrganizationAdminRepo;
import com.organization.organizationservice.repository.OrganizationRepo;
import com.organization.organizationservice.util.EmailService;

@Service
public class OrganizationDAOImpl implements OrganizationDAO {

	@Autowired
	private OrganizationRepo organizationRepo;
	
	@Autowired
	private OrganizationAdminRepo organizationAdminRepo;
	
	@Autowired
	private EmailService emailService;

	@Override
	public String createOrganization(OrgRequest request) throws AffiliationNumberAlreadyExist {
		System.out.println("inside createOrganization method");
		Organization entity = new Organization();
		if (null!=request.getFaxNumber() && null!=request.getAffiliationNumber()
				&& null!= request.getRecognizedBy() && null!=request.getBoardOfEducation()) {
			Optional<Organization> orgExist = organizationRepo.findByOrgId(request.getOrgId());
			if (orgExist.isPresent()) {
				throw new AlreadyOrganizationExist();
			}
			entity.setOrgId(request.getOrgId());
			entity.setActive(true);
			entity.setAffiliationNumber(request.getAffiliationNumber());
			entity.setBoardOfEducation(request.getBoardOfEducation());
			entity.setFaxNumber(request.getFaxNumber());
			entity.setOrgName(request.getOrgName());
			entity.setPincode(request.getPincode());
			entity.setRecognizedBy(request.getRecognizedBy());
			entity.setOrgAddress(request.getOrgAddress());
			entity.setEmail(request.getEmail());
			Organization savedOrg = organizationRepo.save(entity);
//			try {
//		//		emailService.sendHtmlEmail(savedOrg.getEmail());
//			} catch (MessagingException e) {
//				e.printStackTrace();
//			}
			if (null!=savedOrg) {
				return "success";
			}
			
		}
		return "failed data inseration";
	}

	@Override
	public List<OrgRequest> getAllOrgnization() {
		List<OrgRequest> dtos = new ArrayList<>();
	    organizationRepo.findAll().forEach(s -> {
			OrgRequest res = new OrgRequest();
			BeanUtils.copyProperties(s, res);
			dtos.add(res);
		});
		return dtos;

	}

	@Override
	public OrgRequest getOrgnizationById(String orgId) throws organizationNotFound {
		Optional<Organization> entity = organizationRepo.findById(orgId);
		if(!entity.isPresent()) {
			throw new organizationNotFound();
		}
		OrgRequest response = new OrgRequest();
		Organization entityfromdb = entity.get();
		BeanUtils.copyProperties(entityfromdb, response);
		return response;

	}

	@Override
	public OrgRequest updateOrgById(OrgRequest request, String orgId) throws organizationNotFound {
		Optional<Organization> entity = organizationRepo.findByOrgId(orgId);
		if(!entity.isPresent()) {
			throw new organizationNotFound();
		}
		Organization oldData = entity.get();
	//	BeanUtils.copyProperties(request, oldData);
		oldData.setAffiliationNumber(request.getAffiliationNumber());
		oldData.setBoardOfEducation(request.getBoardOfEducation());
		oldData.setFaxNumber(request.getFaxNumber());
		oldData.setPincode(request.getPincode());
		oldData.setOrgAddress(request.getOrgAddress());
		oldData.setRecognizedBy(request.getRecognizedBy());
		Organization newData = organizationRepo.save(oldData);
		BeanUtils.copyProperties(newData, request);
		return request;
	}

	@Override
	public List<OrgAdminDTO> getAllOrgnizationAdmin() {
		 List<OrgAdminDTO> adminDTOs=new ArrayList<>();
		 List<OrganizationAdmin> admins=organizationAdminRepo.findAll();
		 admins.forEach(admin ->{
			 OrgAdminDTO dto=new OrgAdminDTO();
			 dto.setAdminId(admin.getUserId());
			 dto.setBlood(admin.getBloodGroup());
			 dto.setFirstName(admin.getFirstName());
			 dto.setGender(admin.getGender());
			 dto.setLastName(admin.getLastName());
			 dto.setOrgName(admin.getOrganization().getOrgName());
			 adminDTOs.add(dto);
		 });
		return adminDTOs;
	}



}
