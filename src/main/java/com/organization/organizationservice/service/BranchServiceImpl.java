package com.organization.organizationservice.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.constants.Constant;
import com.organization.organizationservice.dto.BranchRequestDTO;
import com.organization.organizationservice.dto.EmailDTO;
import com.organization.organizationservice.dto.PhoneNumberDTO;
import com.organization.organizationservice.entity.Branch;
import com.organization.organizationservice.entity.Email;
import com.organization.organizationservice.entity.Organization;
import com.organization.organizationservice.entity.PhoneNumber;
import com.organization.organizationservice.exception.BranchAlreadyExist;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.repository.BranchRepository;
import com.organization.organizationservice.repository.OrganizationRepo;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	private BranchRepository branchRepo;

	@Autowired
	OrganizationRepo organizationRepo;

	@Override
	public String createBranch(BranchRequestDTO dto, String orgId) throws organizationNotFound, BranchNotFoundEception {
		Optional<Organization> existData = organizationRepo.findByOrgId(orgId);
		if (!existData.isPresent()) {
			throw new organizationNotFound();
		}
		Branch branch = new Branch();
		Optional<Branch> checkBranch = branchRepo.findByBranchId(dto.getBranchId());
		if (checkBranch.isPresent()) {
			throw new BranchAlreadyExist();
		}
		branch.setBranchId(dto.getBranchId());
		branch.setBranchName(dto.getBranchName());
		branch.setAddress(dto.getAddress());
		if (null != dto.getFaxNumber()) {
			branch.setFaxNumber(dto.getFaxNumber());
		}
		branch.setMasterEmailId(dto.getMasterEmailId());
		branch.setMasterEmailPassword(dto.getMasterEmailPassword());
		branch.setPincode(dto.getPincode());
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		branch.setCreated(timestamp);
		List<Email> convertToEntity = dto.getEmails().stream().map(req -> new Email(req.getEmail(),req.getType()))
				.collect(Collectors.toList());
		branch.setEmails(convertToEntity);
		List<PhoneNumber> convertToEntityp = dto.getPhoneNumbers().stream()
				.map(req -> new PhoneNumber(req.getPhoneNumber(),req.getType())).collect(Collectors.toList());
		branch.setPhoneNumbers(convertToEntityp);
		Organization data = existData.get();
		branch.setOrg(data);
		branchRepo.save(branch);
		return "success";
	}

	@Override
	public List<BranchRequestDTO> getAllBranches(String orgId) {
		Optional<Organization> org = organizationRepo.findById(orgId);
		List<Branch> branches = new ArrayList<>();
		List<BranchRequestDTO> branchRequestDTOs = new ArrayList<>();
		List<PhoneNumberDTO> numberDTOs = new ArrayList<>();
		List<EmailDTO> emailDTOs = new ArrayList<>();
		if (org.isPresent()) {
			branchRepo.findAll().forEach(branch -> {
				branches.add(branch);
			});
			branches.forEach(branch -> {
				BranchRequestDTO dto = new BranchRequestDTO();
				dto.setAddress(branch.getAddress());
				dto.setBranchName(branch.getBranchName());
				dto.setFaxNumber(branch.getFaxNumber());
				dto.setMasterEmailId(branch.getMasterEmailId());
				dto.setMasterEmailPassword(branch.getMasterEmailPassword());
				dto.setOrgId(branch.getOrg().getOrgId());
				dto.setPincode(branch.getPincode());
				dto.setBranchId(branch.getBranchId());

				branch.getEmails().forEach(emailResponse -> {
					EmailDTO edto = new EmailDTO();
					edto.setEmail(emailResponse.getEmail());
					edto.setType(emailResponse.getType());
					emailDTOs.add(edto);
				});
				branch.getPhoneNumbers().forEach(phResponse -> {
					PhoneNumberDTO pDto = new PhoneNumberDTO();
					pDto.setPhoneNumber(phResponse.getPhoneNumber());
					pDto.setType(phResponse.getType());
					numberDTOs.add(pDto);

				});
				dto.setEmails(emailDTOs);
				dto.setPhoneNumbers(numberDTOs);
				branchRequestDTOs.add(dto);

			});

		}

		return branchRequestDTOs;
	}
//	private static List<AddressEntity> convertDtoToEntity(List<AddressDto> aDto) {
//	    return aDto.stream()
//	        .map(dto -> new AddressEntity(dto.getUnitNo(), dto.getFloorNo(), dto.getBuildingName(), dto.getAreaName()))
//	        .collect(Collectors.toList());
//	  }

	@Override
	public BranchRequestDTO getBranchById(String orgId, String branchId)
			throws organizationNotFound, BranchNotFoundEception {
		List<PhoneNumberDTO> numberDTOs = new ArrayList<>();
		List<EmailDTO> emailDTOs = new ArrayList<>();
		Optional<Organization> existData = organizationRepo.findByOrgId(orgId);
		if (!existData.isPresent()) {
			throw new organizationNotFound();
		}
		Branch branch = new Branch();
		Optional<Branch> checkBranch = branchRepo.findByBranchId(branchId);
		if (!checkBranch.isPresent()) {
			throw new BranchNotFoundEception("Branch is already exist in database " + orgId);
		}
		BranchRequestDTO dto = new BranchRequestDTO();
		branchRepo.findById(branchId).stream().forEach(entity -> {

			dto.setBranchId(entity.getBranchId());
			dto.setAddress(entity.getAddress());
			dto.setBranchName(entity.getBranchName());
			dto.setFaxNumber(entity.getFaxNumber());
			dto.setMasterEmailId(entity.getMasterEmailId());
			dto.setPincode(entity.getPincode());
			dto.setMasterEmailPassword(entity.getMasterEmailPassword());
			entity.getPhoneNumbers().forEach(pn -> {
				PhoneNumberDTO numberDto = new PhoneNumberDTO();
				numberDto.setPhoneNumber(pn.getPhoneNumber());
				numberDto.setType(pn.getType());
				numberDTOs.add(numberDto);
			});
			entity.getEmails().forEach(em -> {
				emailDTOs.add(new EmailDTO(em.getEmail(), em.getType()));

			});
			dto.setPhoneNumbers(numberDTOs);
			dto.setEmails(emailDTOs);
			Organization o=existData.get();
			dto.setOrgId(o.getOrgId());
	//		dto.setOrgId(e.toString());

		});
		return dto;
	}

	@Override
	public BranchRequestDTO updateBranchById(String orgId, String branchId, BranchRequestDTO dto)
			throws organizationNotFound {
		List<Email> emails = new ArrayList<>();
		List<PhoneNumber> numbers = new ArrayList<>();
		Optional<Organization> existData = organizationRepo.findByOrgId(orgId);
		if (!existData.isPresent()) {
			throw new organizationNotFound();
		}
		Optional<Branch> checkBranch = branchRepo.findByBranchId(branchId);
		if (!checkBranch.isPresent()) {
			throw new organizationNotFound();
		}
		Branch oldValue = checkBranch.get();
		oldValue.setAddress(dto.getAddress());
		oldValue.setBranchName(dto.getBranchName());
		oldValue.setMasterEmailId(dto.getMasterEmailId());
		oldValue.setMasterEmailPassword(dto.getMasterEmailPassword());
		oldValue.setPincode(dto.getPincode());

		List<EmailDTO> dtoEmailDTOs = dto.getEmails();
		for (EmailDTO dt : dtoEmailDTOs) {
			emails.add(new Email(dt.getEmail(), dt.getType()));
		}
		List<PhoneNumberDTO> phoneNumberDTOs = dto.getPhoneNumbers();
		phoneNumberDTOs.forEach(pn -> {
			numbers.add(new PhoneNumber(pn.getPhoneNumber(), pn.getType()));
		});
		oldValue.setEmails(emails);
		oldValue.setPhoneNumbers(numbers);
		Branch newValue = branchRepo.save(oldValue);
		BeanUtils.copyProperties(newValue, dto);
		return dto;
	}

	@Override
	public Map<Boolean, String> diableBranch(String orgId, String branchId) throws organizationNotFound, BranchNotFoundEception {
		Map<Boolean,String> disable=new HashMap<>();
		Organization orgExist = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if(orgExist.isActive()) {
			Branch branchExist=this.branchRepo.findById(branchId).orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION));
			if(branchExist.isActive()) {
			branchExist.setActive(false);
			this.branchRepo.save(branchExist);
			disable.put(true, "Branch succssfully disbaled");

			}
		}

		return disable;
	}

	@Override
	public BranchRequestDTO getBranchByIdAndBranchName(String orgId, String branchId, String branchName) throws organizationNotFound,BranchNotFoundEception {
		BranchRequestDTO dto=new BranchRequestDTO();
		Organization exitOrg=this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if(exitOrg.isActive()) {
			Branch existBranch=this.branchRepo.findById(branchId).orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION));
			
			Branch branchNameExist=this.branchRepo.findByBranchName(branchName);
			if (null != branchNameExist) {
				dto.setBranchName(branchNameExist.getBranchName());

			} else {
				throw new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION);
			}
			dto.setOrgId(existBranch.getOrg().getOrgId());
			
			dto.setAddress(existBranch.getAddress());

			dto.setFaxNumber(existBranch.getFaxNumber());
			dto.setBranchId(existBranch.getBranchId());
			dto.setPincode(existBranch.getPincode());
			dto.setMasterEmailId(existBranch.getMasterEmailId());
			dto.setMasterEmailPassword(existBranch.getMasterEmailPassword());
			List<EmailDTO> emailDTOs=existBranch.getEmails().stream().map(response -> new EmailDTO(response.getEmail(), response.getType())).collect(Collectors.toList());
			dto.setEmails(emailDTOs);
			List<PhoneNumberDTO> phoneNumberDTOs=existBranch.getPhoneNumbers().stream().map(response -> new PhoneNumberDTO(response.getPhoneNumber(), response.getType())).collect(Collectors.toList());
			dto.setPhoneNumbers(phoneNumberDTOs);
			System.out.println(dto);
		}
		return dto;
	}

	@Override
	public List<BranchRequestDTO> getBranchsByIdAndBranchName(String orgId, String branchId, String branchName) throws organizationNotFound,BranchNotFoundEception {
		List<BranchRequestDTO> branchRequestDTOs=new ArrayList<>();
		Organization exitOrg=this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if(exitOrg.isActive()) {
			BranchRequestDTO dto=new BranchRequestDTO();
			Branch existBranch=this.branchRepo.findById(branchId).orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION));
			
            dto.setOrgId(existBranch.getOrg().getOrgId());
			dto.setAddress(existBranch.getAddress());
            dto.setFaxNumber(existBranch.getFaxNumber());
			dto.setBranchId(existBranch.getBranchId());
			dto.setPincode(existBranch.getPincode());
			dto.setMasterEmailId(existBranch.getMasterEmailId());
			dto.setMasterEmailPassword(existBranch.getMasterEmailPassword());
			List<EmailDTO> emailDTOs=existBranch.getEmails().stream().map(response -> new EmailDTO(response.getEmail(), response.getType())).collect(Collectors.toList());
			dto.setEmails(emailDTOs);
			List<PhoneNumberDTO> phoneNumberDTOs=existBranch.getPhoneNumbers().stream().map(response -> new PhoneNumberDTO(response.getPhoneNumber(), response.getType())).collect(Collectors.toList());
			dto.setPhoneNumbers(phoneNumberDTOs);
			branchRequestDTOs.add(dto);
			
		}
		return branchRequestDTOs;
	}

//	private List<AddressEntity> convertDtoToEntity(List<AddressDto> aDto) {
//	    List<AddressEntity> newAddressEntityList = new ArrayList<>();
//
//	    for (AddressDto dto : aDto) {
//	        AddressEntity addressEntity = new AddressEntity(
//	                dto.getUnitNo(),
//	                dto.getFloorNo(),
//	                dto.getBuildingName(),
//	                dto.getAreaName()
//	        );
//	        
//	        newAddressEntityList.add(addressEntity);
//	    }
//
//	    return newAddressEntityList;
//	}

}
