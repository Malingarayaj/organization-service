package com.organization.organizationservice.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.constants.Constant;
import com.organization.organizationservice.dto.EmailDTO;
import com.organization.organizationservice.dto.FacultyDTO;
import com.organization.organizationservice.dto.FacultyLeaveDTO;
import com.organization.organizationservice.dto.PhoneNumberDTO;
import com.organization.organizationservice.entity.Branch;
import com.organization.organizationservice.entity.Email;
import com.organization.organizationservice.entity.Faculty;
import com.organization.organizationservice.entity.FacultyLeave;
import com.organization.organizationservice.entity.Organization;
import com.organization.organizationservice.entity.PhoneNumber;
import com.organization.organizationservice.exception.FacultyNotFoundException;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.FacultyLevaeNotFoundException;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.repository.BranchRepository;
import com.organization.organizationservice.repository.FacultyLeaveRepository;
import com.organization.organizationservice.repository.FacultyRepository;
import com.organization.organizationservice.repository.OrganizationRepo;

@Service
public class FacultyServiceImpl implements FacultyService {

	@Autowired
	private FacultyRepository facultyRepository;

	@Autowired
	private BranchRepository branchRepository;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private OrganizationRepo organizationRepo;
	
	   private static MessageDigest md;

	   @Autowired
	   private FacultyLeaveRepository facultyLeaveRepository;

	@Override
	public String saveFaculty(FacultyDTO request, String orgId, String branchId)
			throws organizationNotFound, BranchNotFoundEception {
		Organization orgExist = organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());

		if (null != orgExist && orgExist.isActive()) {
			Branch brachExist = branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION));
			if (null != brachExist && brachExist.isActive()) {

				Faculty converToEntity = new Faculty();
				converToEntity.setBranch(brachExist);
				converToEntity.setDateOfBirth(request.getDateOfBirth());
				converToEntity.setDateOfJoining(request.getDateOfJoining());
				converToEntity.setActive(true);
				converToEntity.setBloodGroup(request.getBlood());
				converToEntity.setComments(request.getComments());
				converToEntity.setDesignation(request.getDesignation());
				converToEntity.setFatherFirstName(request.getFatherFirstName());
				converToEntity.setFatherLastName(request.getFatherLastName());
				converToEntity.setGender(request.getGender());
				converToEntity.setLastName(request.getLastName());
				converToEntity.setPermanent(true);
				converToEntity.setPassword(cryptWithMD5(request.getPassword()));
				converToEntity.setNoOfExperience(request.getNoOfExperience());
				converToEntity.setFirstName(request.getFirstName());
				converToEntity.setQualification(request.getQualification());
				converToEntity.setLocalAddress(request.getLocalAddress());
				converToEntity.setStaffId(request.getStaffId());
				converToEntity.setPermanentAddress(request.getPermanentAddress());
				List<Email> emails = request.getEmails().stream().map(en -> new Email(en.getEmail(), en.getType()))
						.collect(Collectors.toList());
				converToEntity.setEmails(emails);
				List<PhoneNumber> phoneNumbers = request.getPhoneNumbers().stream()
						.map(en -> new PhoneNumber(en.getPhoneNumber(), en.getType())).collect(Collectors.toList());
				converToEntity.setPhoneNumbers(phoneNumbers);
				this.facultyRepository.save(converToEntity);

			}

		}
		return "data saved succfully";

	}
	
	public static String cryptWithMD5(String pass){
	    try {
	        md = MessageDigest.getInstance("MD5");
	        byte[] passBytes = pass.getBytes();
	        md.reset();
	        byte[] digested = md.digest(passBytes);
	        StringBuffer sb = new StringBuffer();
	        for(int i=0;i<digested.length;i++){
	            sb.append(Integer.toHexString(0xff & digested[i]));
	        }
	        return sb.toString();
	    } catch (NoSuchAlgorithmException ex) {
//	        Logger.getLogger(CryptWithMD5.class.getName()).log(Level.SEVERE, null, ex);
	    }
	        return null;


	   }

	public static Timestamp convertStringToTimestamp(String strDate) {
		Timestamp timeStampDate = null;
		try {
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			// you can change format of date
			Date date = formatter.parse(strDate);
			timeStampDate = new Timestamp(date.getTime());

			return timeStampDate;
		} catch (ParseException e) {
			System.out.println("Exception :" + e);
			return timeStampDate;
		}
	}

	@Override
	public List<FacultyDTO> getAllFaculties(String orgId, String branchId)
			throws organizationNotFound, BranchNotFoundEception {
		List<FacultyDTO> facultyDTOs = null;

		Organization existrg = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if (null != existrg && existrg.isActive()) {
			Branch existBranch = this.branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION));
			if (ObjectUtils.isNotEmpty(existBranch) && existBranch.isActive()) {

				facultyDTOs = this.facultyRepository.findAll().stream()
						.map(faculty -> this.mapper.map(faculty, FacultyDTO.class)).collect(Collectors.toList());
			}

		}
		return facultyDTOs;
	}

	@Override
	public FacultyDTO getFacultyById(String orgId, String branchId, String facultyId)
			throws organizationNotFound, BranchNotFoundEception, FacultyNotFoundException {
		FacultyDTO dto = new FacultyDTO();
		Organization orgExist = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if (null != orgExist && orgExist.isActive()) {
			Branch brachExist = this.branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION));
			if (null != brachExist && brachExist.isActive()) {
				Faculty entity = this.facultyRepository.findById(facultyId)
						.orElseThrow(() -> new FacultyNotFoundException());
				dto.setComments(entity.getComments());
				dto.setBlood(entity.getBloodGroup());
				dto.setDesignation(entity.getDesignation());
				dto.setFirstName(entity.getFirstName());
				dto.setLastName(entity.getLastName());
				dto.setFatherFirstName(entity.getFatherFirstName());
				dto.setLocalAddress(entity.getLocalAddress());
				dto.setQualification(entity.getQualification());
				dto.setPermanent(true);
				dto.setStaffId(entity.getStaffId());
				dto.setNoOfExperience(entity.getNoOfExperience());

				List<EmailDTO> emailDTOs = entity.getEmails().stream().map(e -> new EmailDTO(e.getEmail(), e.getType()))
						.collect(Collectors.toList());
				dto.setEmails(emailDTOs);
				List<PhoneNumberDTO> numberDTOs = entity.getPhoneNumbers().stream()
						.map(e -> new PhoneNumberDTO(e.getPhoneNumber(), e.getType())).collect(Collectors.toList());
				dto.setPhoneNumbers(numberDTOs);
			}
		}
		return dto;
	}

	@Override
	public FacultyDTO updateFacultyById(String orgId, String branchId, String facultyId, FacultyDTO dto)
			throws organizationNotFound, BranchNotFoundEception, FacultyNotFoundException {
		Organization existOrg = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if (null != existOrg && existOrg.isActive()) {
			Branch existBranch = this.branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION));
			if (null != existBranch && existBranch.isActive()) {
				Faculty existFaculty = this.facultyRepository.findById(facultyId)
						.orElseThrow(() -> new FacultyNotFoundException());
				existFaculty.setComments(dto.getComments());
				existFaculty.setDesignation(dto.getDesignation());
				existFaculty.setLocalAddress(dto.getLocalAddress());
				existFaculty.setNoOfExperience(dto.getNoOfExperience());
				existFaculty.setFatherLastName(dto.getFatherLastName());
				existFaculty.setPermanentAddress(dto.getPermanentAddress());
				List<Email> emailss = new ArrayList<>();
				List<EmailDTO> ddd = dto.getEmails();
				for (EmailDTO d : ddd) {
					Email e = new Email();
					e.setEmail(d.getEmail());
					e.setType(d.getType());
					emailss.add(e);
				}
				existFaculty.setEmails(emailss);
				List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
				dto.getPhoneNumbers().forEach(phdto -> {
					PhoneNumber num = new PhoneNumber();
					num.setPhoneNumber(phdto.getPhoneNumber());
					num.setType(phdto.getType());
					phoneNumbers.add(num);
				});
				existFaculty.setPhoneNumbers(phoneNumbers);
				Faculty updatedFaculty = this.facultyRepository.save(existFaculty);
				dto.setComments(updatedFaculty.getComments());
				dto.setDesignation(updatedFaculty.getDesignation());
				dto.setFatherFirstName(updatedFaculty.getFatherLastName());
				dto.setLocalAddress(updatedFaculty.getLocalAddress());
				dto.setNoOfExperience(updatedFaculty.getNoOfExperience());
				dto.setFatherLastName(updatedFaculty.getFatherLastName());
				dto.setPermanentAddress(updatedFaculty.getPermanentAddress());
				List<Email> emails = updatedFaculty.getEmails();
				List<EmailDTO> emailDTOs = new ArrayList<>();
				for (Email ems : emails) {
					EmailDTO dto1 = new EmailDTO();
					dto1.setEmail(ems.getEmail());
					dto1.setType(ems.getType());
					emailDTOs.add(dto1);
				}
				dto.setEmails(emailDTOs);

				List<PhoneNumber> phoneNumbers2 = updatedFaculty.getPhoneNumbers();
				List<PhoneNumberDTO> numbers = new ArrayList<>();
				for (PhoneNumber ems : phoneNumbers2) {
					PhoneNumberDTO dto1 = new PhoneNumberDTO();
					dto1.setPhoneNumber(ems.getPhoneNumber());
					dto1.setType(ems.getType());
					numbers.add(dto1);
				}
				dto.setPhoneNumbers(numbers);
			}
		}
		return dto;
	}

	@Override
	public Map<Boolean, String> removeFacultyById(String orgId, String branchId, String facultyId)
			throws organizationNotFound, BranchNotFoundEception {
		Map<Boolean, String> response = new HashMap<>();
		Organization existOrg = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if (null != existOrg && existOrg.isActive()) {
			Branch branchExist = this.branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION));
			if (null != branchExist && branchExist.isActive()) {

				this.facultyRepository.deleteById(facultyId);
				response.put(true, Constant.FACULTY_DELETED_SUCCSSFULLY);

			}
		}
		return response;
	}

	@Override
	public FacultyDTO findByFacultyIdAndFirstNameAndDateOfBirth(String orgId, String branchId, String facultyId,
			String firstName, String dateOfBirth) throws organizationNotFound, BranchNotFoundEception {

		FacultyDTO dto = new FacultyDTO();
		Organization existOrg = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if (null != existOrg && existOrg.isActive()) {
			Branch branchExist = this.branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION));
			if (null != branchExist && branchExist.isActive()) {
				Faculty response = this.facultyRepository.findByFacultyIdAndFirstNameAndDateOfBirth(facultyId,
						firstName, dateOfBirth);
				dto.setBlood(response.getBloodGroup());
				dto.setComments(response.getComments());
				dto.setDateOfBirth(response.getDateOfBirth());
				dto.setDesignation(response.getDesignation());
				dto.setDateOfJoining(response.getDateOfJoining());
				dto.setFatherFirstName(response.getFatherFirstName());
				dto.setFatherLastName(response.getFatherLastName());
				dto.setFirstName(response.getFirstName());
				dto.setLastName(response.getLastName());
				dto.setGender(response.getGender());
				dto.setLocalAddress(response.getLocalAddress());
				dto.setNoOfExperience(response.getNoOfExperience());
				dto.setPermanentAddress(response.getPermanentAddress());
				dto.setQualification(response.getQualification());
				dto.setStaffId(response.getStaffId());
				List<EmailDTO> emailDTOs = new ArrayList<>();
				response.getEmails().forEach(email -> {
					emailDTOs.add(new EmailDTO(email.getEmail(), email.getType()));
				});
				dto.setEmails(emailDTOs);
				List<PhoneNumberDTO> numberDTOs = new ArrayList<>();
				response.getPhoneNumbers().forEach(phnum -> {
					numberDTOs.add(new PhoneNumberDTO(phnum.getPhoneNumber(), phnum.getType()));
				});
				dto.setPhoneNumbers(numberDTOs);
			}
		}

		return dto;
	}

	@Override
	public FacultyLeaveDTO saveFacultyLeaveDetails(String orgId, String branchId, String facultyId,
			FacultyLeaveDTO request) throws organizationNotFound, BranchNotFoundEception, FacultyNotFoundException {
		Organization orgExist = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		FacultyLeave facultyLeave = new FacultyLeave();
		if (null != orgExist && orgExist.isActive()) {
			Branch brachExist = this.branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION));
			if (null != brachExist && brachExist.isActive()) {
				Faculty facultyExist = this.facultyRepository.findById(facultyId)
						.orElseThrow(() -> new FacultyNotFoundException());
				if (null != facultyExist && facultyExist.isActive()) {
					this.mapper.map(request, facultyLeave);
					facultyLeave.setBranch(brachExist);
					facultyLeave.setFaculty(facultyExist);
					facultyLeave.setLevaeBalance(request.getLeaveBal());
					facultyLeave = this.facultyLeaveRepository.save(facultyLeave);

				//	this.mapper.map(facultyLeave, request);
					request.setLeaveBal(facultyLeave.getLevaeBalance());
					request.setFromDate(facultyLeave.getFromDate());
					request.setToDate(facultyLeave.getToDate());
					request.setHalfDay(true);
					request.setFacultyId(facultyLeave.getFaculty().getFacultyId());
					request.setType(facultyLeave.getType());
					request.setBranchId(facultyLeave.getBranch().getBranchId());
					
				}
			}
		}
		return request;
	}

	@Override
	public FacultyLeaveDTO getAllLeavesByFacutyId(String orgId, String branchId, String facultyId)
			throws organizationNotFound, BranchNotFoundEception, FacultyNotFoundException {
		FacultyLeaveDTO dto=new FacultyLeaveDTO();

		Organization exxitOrg=this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());

		if(null!=exxitOrg && exxitOrg.isActive()) {
			Branch exitBranch=this.branchRepository.findById(branchId).orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION));
			if(null!=exitBranch && exitBranch.isActive()) {
				Faculty facultyExist=this.facultyRepository.findById(facultyId).orElseThrow(() -> new FacultyNotFoundException());
				if(null!=facultyExist && facultyExist.isActive()) {
					
					FacultyLeave facultyLeave=this.facultyLeaveRepository.findById(facultyId).orElseThrow(() -> new FacultyLevaeNotFoundException("NO Leaves"));
				      dto.setFromDate(facultyLeave.getFromDate());
				      dto.setToDate(facultyLeave.getToDate());
				      dto.setReason(facultyLeave.getReason());
				      dto.setLeaveBal(facultyLeave.getLevaeBalance());
				      dto.setType(facultyLeave.getType());
				      dto.setTimeFrame(facultyLeave.getTimeFrame());
				      dto.setYear(facultyLeave.getYear());
				      dto.setBranchId(facultyLeave.getBranch().getBranchId());
				      dto.setFacultyId(facultyLeave.getFaculty().getFacultyId());
				      
				}
			}
		}
		return dto;
	}

//	@Override
//	public FacultyDTO saveFaculty(FacultyDTO request) {
//		Faculty entity = this.mapper.map(request, Faculty.class);
//		Faculty createFaculty = facultyRepository.save(entity);
//		return this.mapper.map(createFaculty, FacultyDTO.class);
//	}

}
