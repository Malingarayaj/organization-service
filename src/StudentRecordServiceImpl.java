package com.organization.organizationservice.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.constants.Constant;
import com.organization.organizationservice.dto.AddStudentRecordDTO;
import com.organization.organizationservice.entity.Branch;
import com.organization.organizationservice.entity.Organization;
import com.organization.organizationservice.entity.Student;
import com.organization.organizationservice.entity.StudentRecords;
import com.organization.organizationservice.exception.StudentNotFound;
import com.organization.organizationservice.exception.StudentRecordAlreadyExist;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.repository.BranchRepository;
import com.organization.organizationservice.repository.OrganizationRepo;
import com.organization.organizationservice.repository.StudentRecordsRepo;
import com.organization.organizationservice.repository.StudentRepo;

@Service
public class StudentRecordServiceImpl implements StudentRecordService {

	@Autowired
	private StudentRecordsRepo studentRecordsRepo;

	@Autowired
	private OrganizationRepo organizationRepo;

	@Autowired
	private BranchRepository branchRepository;

	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	ModelMapper mapper;

	@Override
	public AddStudentRecordDTO createStudentRecord(String orgId, String branchId, String studentId,
			AddStudentRecordDTO dto)
			throws organizationNotFound, BranchNotFoundEception, StudentNotFound, StudentRecordAlreadyExist {
		Organization entityFromDB = this.organizationRepo.findById(orgId).get();
		if (null == entityFromDB) {
			throw new organizationNotFound();
		}
		Branch entityFromBranchDB = this.branchRepository.findById(branchId).get();
		if (null == entityFromBranchDB) {
			throw new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION);
		}
		Student student = this.studentRepo.findById(studentId).get();
		if (null == student || StringUtils.isBlank(studentId)) {
			throw new StudentNotFound();
		}
//		StudentRecords studentRecords=null;
//		try {
//		 studentRecords=studentRecordsRepo.findById(dto.getId()).get()
//		}catch (Exception e) {
//          System.out.println("values is not presnet given id"+studentId);		
//      }
//		if(null !=studentRecords || !StringUtils.isBlank(String.valueOf(dto.getId()))) {
//			throw new StudentRecordAlreadyExist();
//
//		}
		StudentRecords entity = new StudentRecords();
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
			java.util.Date parsedDate = dateFormat.parse(dto.getAdmissionDate());
			Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());

			entity.setAdmissionDate(timestamp);
		} catch (Exception e) { // this generic but you can control another types of exception
			e.printStackTrace();
		}
		entity.setAge(String.valueOf(dto.getAge()));
		entity.setDiscountAmount(dto.getDiscountAmount());
		entity.setRollNumber(dto.getRollnumber());
		entity.setSection(dto.getSection());
		entity.setPromoted(true);
		entity.setStandard(dto.getStandard());
		entity.setStudent(student);
		entity.setVanAvailed(true);
		entity.setYear(dto.getCorrespondingYear());
		entity.setId(dto.getId());
		StudentRecords savedEntity = studentRecordsRepo.save(entity);
		BeanUtils.copyProperties(savedEntity, dto);
		return dto;
	}

	@Override
	public List<AddStudentRecordDTO> getStudentRecords(String orgId, String branchId, String studentId)
			throws organizationNotFound, BranchNotFoundEception, StudentRecordAlreadyExist, StudentNotFound {
		List<AddStudentRecordDTO> studentRecords = null;
		Organization entityFromDB = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if (null != entityFromDB && entityFromDB.isActive()) {
			Branch entityFromBranchDB = this.branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION + branchId));
			if (null != entityFromBranchDB && entityFromBranchDB.isActive()) {
				studentRecords = this.studentRecordsRepo.findAll().stream()
						.map(stRec -> this.mapper.map(stRec, AddStudentRecordDTO.class)).collect(Collectors.toList());
			}
		}
		return studentRecords;

	}

	@Override
	public AddStudentRecordDTO updateStudentRecordById(String orgId, String branchId, String studentId,AddStudentRecordDTO dto)
			throws organizationNotFound, BranchNotFoundEception, StudentNotFound {
		Long id = null;
		Organization entityFromDB = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if (null != entityFromDB && entityFromDB.isActive()) {
			Branch entityFromBranchDB = this.branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION + branchId));
			Student studentExist=this.studentRepo.findById(studentId).orElseThrow(() -> new StudentNotFound());
			if (null != studentExist && studentExist.isActive()) {
				StudentRecords oldRecords = studentRecordsRepo.findById(id)
						.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION + branchId));
				oldRecords.setYear(dto.getCorrespondingYear());
				oldRecords.setDiscountAmount(dto.getDiscountAmount());
				oldRecords.setAge(String.valueOf(dto.getAge()));
				oldRecords.setSection(dto.getSection());
				oldRecords.setStandard(dto.getStandard());
				try {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
					Date parsedDate = dateFormat.parse(dto.getAdmissionDate());
					Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
					oldRecords.setAdmissionDate(timestamp);
				} catch (Exception e) {
					e.printStackTrace();
				}
				StudentRecords updateRecord = studentRecordsRepo.save(oldRecords);
				dto.setCorrespondingYear(updateRecord.getYear());
				dto.setDiscountAmount(updateRecord.getDiscountAmount());
				dto.setAge(Integer.valueOf(updateRecord.getAge()));
				dto.setSection(updateRecord.getSection());
				dto.setStandard(updateRecord.getStandard());
				dto.setAdmissionDate(oldRecords.toString());
			}
		}
		return dto;
	}

}
