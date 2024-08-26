package com.organization.organizationservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.constants.Constant;
import com.organization.organizationservice.dto.AddAssessmentDTO;
import com.organization.organizationservice.dto.BranchInfoDTO;
import com.organization.organizationservice.dto.EmailDTO;
import com.organization.organizationservice.dto.FacultyDTO;
import com.organization.organizationservice.dto.OrgDetailsDTO;
import com.organization.organizationservice.dto.PhoneNumberDTO;
import com.organization.organizationservice.dto.StudentOrgInfo;
import com.organization.organizationservice.dto.StudentRequest;
import com.organization.organizationservice.entity.Assessment;
import com.organization.organizationservice.entity.Branch;
import com.organization.organizationservice.entity.ClassRoom;
import com.organization.organizationservice.entity.Email;
import com.organization.organizationservice.entity.Faculty;
import com.organization.organizationservice.entity.Organization;
import com.organization.organizationservice.entity.Student;
import com.organization.organizationservice.exception.FacultyNotFoundException;
import com.organization.organizationservice.exception.StudentNotFound;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.ClassRoomNotFound;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.repository.BranchRepository;
import com.organization.organizationservice.repository.ClassRoomServiceRepository;
import com.organization.organizationservice.repository.FacultyRepository;
import com.organization.organizationservice.repository.OrganizationRepo;
import com.organization.organizationservice.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private OrganizationRepo organizationRepo;

	@Autowired
	private BranchRepository branchRepo;

	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private ClassRoomServiceRepository classRoomServiceRepository;
	
	@Autowired 	AddAssessmentRepo addAssessmentRepo;
	
	@Autowired FacultyRepository facultyRepository;

	@Override
	public StudentRequest createStudent(String orgId, String branchId, StudentRequest request)
			throws organizationNotFound, BranchNotFoundEception {

		Optional<Organization> existData = organizationRepo.findByOrgId(orgId);
		if (!existData.isPresent()) {
			throw new organizationNotFound();
		}
		Optional<Branch> checkBranch = branchRepo.findByBranchId(branchId);
		if (!checkBranch.isPresent()) {
			throw new BranchNotFoundEception("Branch is already exist in database " + orgId);
		}
		List<ClassRoom> classRoomExist=classRoomServiceRepository.findAll();
		
		Optional<Student> existStudent = studentRepo.findByStudentId(request.getStudentId());
		if (!existStudent.isPresent()) {
			Student entity = new Student();

			BeanUtils.copyProperties(request, entity);
			Organization org = existData.get();
			Branch branch = checkBranch.get();
			
			entity.setOrg(org);
			entity.setBranch(branch);
			entity.setClassRoom(classRoomExist);
			if (entity != null && entity.isActive()) {
				Student student = studentRepo.save(entity);
				BeanUtils.copyProperties(student, request);
			}
		}
		return request;
	}

	@Override
	public List<StudentRequest> getAllstudents(String orgId, String branchId)
			throws organizationNotFound, BranchNotFoundEception {
		Optional<Organization> existData = organizationRepo.findByOrgId(orgId);
		if (!existData.isPresent()) {
			throw new organizationNotFound();
		}
		Optional<Branch> checkBranch = branchRepo.findByBranchId(branchId);
		if (!checkBranch.isPresent()) {
			throw new BranchNotFoundEception("Branch is not found in database " + branchId);
		}
		return studentRepo.findAll().stream().map(student -> modelMapper.map(student, StudentRequest.class))
				.collect(Collectors.toList());

//		studentRepo.findAll().forEach(res ->{
//			List<Student> allStudeents=new ArrayList<>();
//			allStudeents.add(res);
//			allStudeents.forEach(dd ->{
//				StudentRequest dto=new StudentRequest();
//				dto.setUserName(dd.getUserName());
//			});
//		});

	}

	@Override
	public StudentRequest getstudentById(String orgId, String branchId, String studentId)
			throws organizationNotFound, BranchNotFoundEception {
		Optional<Organization> existData = organizationRepo.findByOrgId(orgId);
		if (!existData.isPresent()) {
			throw new organizationNotFound();
		}
		Optional<Branch> checkBranch = branchRepo.findByBranchId(branchId);
		if (!checkBranch.isPresent()) {
			throw new BranchNotFoundEception("Branch is not found in database " + orgId);
		}
		Student entity = studentRepo.findByStudentId(studentId).get();
		StudentRequest request = new StudentRequest();
		BeanUtils.copyProperties(entity, request);
		return request;

	}

	@Override
	public Boolean deleteStudentById(String orgId, String branchId, String studentId)
			throws organizationNotFound, BranchNotFoundEception {
		studentRepo.deleteByStudentId(studentId);
		return true;

	}

	@Override
	public StudentRequest updatetudentById(StudentRequest request, String orgId, String branchId, String studentId)
			throws organizationNotFound, BranchNotFoundEception {
		Optional<Organization> existData = organizationRepo.findByOrgId(orgId);
		if (!existData.isPresent()) {
			throw new organizationNotFound();
		}
		Optional<Branch> checkBranch = branchRepo.findByBranchId(branchId);
		if (!checkBranch.isPresent()) {
			throw new BranchNotFoundEception("Branch is already exist in database " + orgId);
		}
		
		Student entity = studentRepo.findByStudentId(studentId).get();
		
		BeanUtils.copyProperties(request, entity);
		Student updatedRecord = studentRepo.save(entity);
		BeanUtils.copyProperties(updatedRecord, request);
		return request;
	}

	@Override
	public AddAssessmentDTO createAssemenet(AddAssessmentDTO assementDto, String branchId,
			String studentId) {
		Assessment entity=new Assessment();
		Branch existBranch=branchRepo.findById(branchId).get();
		if(null!=existBranch) {
			entity.setBranch(existBranch);
		}
		entity.setActive(true);
		entity.setAssessmentName(assementDto.getAssesmentName());
		entity.setCompleted(true);
		entity.setPassPercentage(70.00);
		entity.setYear("2023");
		Assessment savedEnity=addAssessmentRepo.save(entity);
		BeanUtils.copyProperties(savedEnity, assementDto);
		
		return assementDto;
	}

	@Override
	public AddAssessmentDTO getAssessmentById(String assessmentId, String branchId) {
		Branch existBranch=this.branchRepo.findById(branchId).get();
		AddAssessmentDTO dto=new AddAssessmentDTO();
		if(null!=existBranch) {
			
			Assessment assessment=addAssessmentRepo.findById(assessmentId).get();
			if(null!=assessment) {
				dto.setAssesmentName(assessment.getAssessmentName());
				dto.setYear(assessment.getYear());
			}
		}
		return dto;
	}

	@Override
	public List<AddAssessmentDTO> getAllAssessments() {
		List<AddAssessmentDTO> dtos=new ArrayList<>();
		addAssessmentRepo.findAll().forEach(entity ->{
			dtos.add(new AddAssessmentDTO(entity.getAssessmentName(), entity.getYear(), null));
		});
		return dtos;
	}

	@Override
	public StudentOrgInfo getStudentOrginfo(String branchId, String orgId, String studentId,String facultyId) throws organizationNotFound, BranchNotFoundEception, FacultyNotFoundException, StudentNotFound {
		StudentOrgInfo studentOrgInfo=new StudentOrgInfo();
		OrgDetailsDTO orgDetailsDto=new OrgDetailsDTO();
		BranchInfoDTO branchInfoDto=new BranchInfoDTO();
		Organization organization=organizationRepo.findById(orgId).get();
		if(!organization.isActive()) {
			throw new organizationNotFound();
		}
		orgDetailsDto.setAddress(organization.getOrgAddress());
	//	orgDetailsDto.setAdminName(organization.getOrganizationAdmin().getUserName());
		orgDetailsDto.setAffiliationNumber(organization.getAffiliationNumber());
		orgDetailsDto.setBoardOfEducation(organization.getBoardOfEducation());
		orgDetailsDto.setOrgId(organization.getOrgId());
		orgDetailsDto.setOrgName(organization.getOrgName());
		orgDetailsDto.setPincode(organization.getPincode());
		orgDetailsDto.setRecognizedBy(organization.getRecognizedBy());
		studentOrgInfo.setOrgInfo(orgDetailsDto);
		
		Branch branch=branchRepo.findById(branchId).get();
		if(!branch.isActive()) {
			throw new BranchNotFoundEception(branchId);
		}
		branchInfoDto.setAddress(branch.getAddress());
		branchInfoDto.setBranchName(branch.getBranchName());
		branchInfoDto.setFaxNumber(branch.getFaxNumber());
		branchInfoDto.setMasterEmailId(branch.getMasterEmailId());
		branchInfoDto.setMasterEmailPassword(branch.getMasterEmailPassword());
		branchInfoDto.setPincode(branch.getPincode());
		List<EmailDTO> emailDTOs=new ArrayList<>();
		branch.getEmails().stream().forEach(response ->{
			emailDTOs.add(new EmailDTO(response.getEmail(),response.getType()));
			
		});
		
		
		branchInfoDto.setEmails(emailDTOs);
		List<PhoneNumberDTO> phoneNumberDTOs=new ArrayList<>();
		branch.getPhoneNumbers().forEach(phoneNumber ->{
			phoneNumberDTOs.add(new PhoneNumberDTO(phoneNumber.getPhoneNumber(), phoneNumber.getType()));
		});
		branchInfoDto.setPhoneNumbers(phoneNumberDTOs);
		
		FacultyDTO facultyInfoDto=new FacultyDTO();
		
		Faculty faculty=facultyRepository.findById(facultyId).get();
		if(!faculty.isActive()) {
			throw new FacultyNotFoundException();
		}
		facultyInfoDto.setBlood(faculty.getBloodGroup());
		facultyInfoDto.setComments(faculty.getComments());
		facultyInfoDto.setDateOfBirth(faculty.getDateOfBirth());
		facultyInfoDto.setDateOfJoining(faculty.getDateOfJoining());
		facultyInfoDto.setDesignation(faculty.getDesignation());
		facultyInfoDto.setFatherFirstName(faculty.getFatherFirstName());
		facultyInfoDto.setFatherLastName(faculty.getFatherLastName());
		facultyInfoDto.setFirstName(faculty.getFirstName());
		facultyInfoDto.setGender(faculty.getGender());
		facultyInfoDto.setLastName(faculty.getLastName());
		facultyInfoDto.setLocalAddress(faculty.getLocalAddress());
		facultyInfoDto.setNoOfExperience(faculty.getNoOfExperience());
		facultyInfoDto.setPassword(faculty.getPassword());
		facultyInfoDto.setPermanentAddress(faculty.getPermanentAddress());
		facultyInfoDto.setQualification(faculty.getQualification());
		facultyInfoDto.setStaffId(faculty.getStaffId());
		List<EmailDTO> emailDTOs2=new ArrayList<>();
		faculty.getEmails().forEach(email ->{
			emailDTOs2.add(new EmailDTO(email.getEmail(),email.getType()));
		});
		facultyInfoDto.setEmails(emailDTOs2);
		List<PhoneNumberDTO> phoneNumberDTOs2=new ArrayList<>();
		faculty.getPhoneNumbers().forEach(pNumber ->{
			phoneNumberDTOs2.add(new PhoneNumberDTO(pNumber.getPhoneNumber(), pNumber.getType()));
		});
		facultyInfoDto.setPhoneNumbers(phoneNumberDTOs2);
		  
		Student student=studentRepo.findById(studentId).get();
		if(!student.isActive()) {
			throw new StudentNotFound();
		}
		studentOrgInfo.setCorrespondingYear(student.getCurrentAdmissionYear());
		studentOrgInfo.setBranchInfo(branchInfoDto);
		studentOrgInfo.setFacultyInfo(facultyInfoDto);
		studentOrgInfo.setFirstName(student.getStudentFirstName());
		studentOrgInfo.setLastName(student.getStudentLastName());
		studentOrgInfo.setOrgInfo(orgDetailsDto);
		studentOrgInfo.setRollnum(Integer.parseInt(student.getCurrentRollNumber()));
		studentOrgInfo.setSec(student.getCurrentSeection());
		studentOrgInfo.setStd(student.getCurrentClass());
		return studentOrgInfo;
	}

	

	

}
