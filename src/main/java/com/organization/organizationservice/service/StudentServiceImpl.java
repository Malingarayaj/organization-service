package com.organization.organizationservice.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.dto.StudentRequest;
import com.organization.organizationservice.entity.Branch;
import com.organization.organizationservice.entity.Organization;
import com.organization.organizationservice.entity.Student;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.repository.BranchRepository;
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
		Optional<Student> existStudent = studentRepo.findByStudentId(request.getStudentId());
		if (!existStudent.isPresent()) {
			Student entity = new Student();

			BeanUtils.copyProperties(request, entity);
			Organization org = existData.get();
			Branch branch = checkBranch.get();
			entity.setOrg(org);
			entity.setBranch(branch);
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

}
