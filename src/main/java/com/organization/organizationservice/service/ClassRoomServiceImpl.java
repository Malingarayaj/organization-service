package com.organization.organizationservice.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.constants.Constant;
import com.organization.organizationservice.dto.AddClassRoomDTO;
import com.organization.organizationservice.entity.Branch;
import com.organization.organizationservice.entity.ClassRoom;
import com.organization.organizationservice.entity.Faculty;
import com.organization.organizationservice.entity.Organization;
import com.organization.organizationservice.entity.Student;
import com.organization.organizationservice.exception.FacultyNotFoundException;
import com.organization.organizationservice.exception.classRoomisAlreadyExist;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.ClassRoomNotFound;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.repository.BranchRepository;
import com.organization.organizationservice.repository.ClassRoomServiceRepository;
import com.organization.organizationservice.repository.FacultyRepository;
import com.organization.organizationservice.repository.OrganizationRepo;
import com.organization.organizationservice.repository.StudentRepo;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {

	private ClassRoomServiceRepository classRoomServiceRepository;
	@Autowired
	private OrganizationRepo organizationRepo;
	@Autowired
	private BranchRepository branchRepository;
	@Autowired
	private FacultyRepository facultyRepository;
	@Autowired
	private StudentRepo repo;

	@Autowired
	ModelMapper mapper;

	@Autowired
	public ClassRoomServiceImpl(ClassRoomServiceRepository classRoomServiceRepository) {
		this.classRoomServiceRepository = classRoomServiceRepository;
	}

	@Override
	public AddClassRoomDTO saveClassRoom(String orgId, String branchId, String facultyId,AddClassRoomDTO dto)
			throws organizationNotFound, BranchNotFoundEception, classRoomisAlreadyExist, FacultyNotFoundException {
		ClassRoom entity = new ClassRoom();
		Optional<Organization> isExist = this.organizationRepo.findByOrgId(orgId);
		if (!isExist.isPresent()) {
			throw new organizationNotFound();
		}
		Optional<Branch> isBranchExist = branchRepository.findByBranchId(branchId);
		if (!isBranchExist.isPresent()) {
			throw new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION + branchId);
		}

		Optional<ClassRoom> isclassRoomExist = this.classRoomServiceRepository.findById(dto.getClassRoomId());

		if (isclassRoomExist.isPresent()) {
			throw new classRoomisAlreadyExist();
		}
		List<Student> studentsList=this.repo.findAll();
		Faculty faculty=this.facultyRepository.findById(facultyId).orElseThrow(() -> new FacultyNotFoundException());
		if(null!=faculty && faculty.isActive()) {
			entity.setFaculty(faculty);
		}
		
		entity.setSection(dto.getSection());
		entity.setStandard(dto.getStandard());
		entity.setSyllabus(dto.getSyllabus());
		entity.setYear(dto.getYear());
		entity.setActive(true);
		entity.setMaxstudents(dto.getMaxcount());
		// entity.setStudentLists(null);
		entity.setBranch(isBranchExist.get());
		entity.setStudentLists(studentsList);
		ClassRoom savedEntity = this.classRoomServiceRepository.save(entity);
		BeanUtils.copyProperties(savedEntity, dto);
		return dto;
	}

	@Override
	public AddClassRoomDTO updateClassRoom(String orgId, String branchId, String classRoomId, AddClassRoomDTO dto)
			throws organizationNotFound, BranchNotFoundEception, ClassRoomNotFound, classRoomisAlreadyExist {
		Organization resp = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		AddClassRoomDTO response = null;
		if (null != resp && resp.isActive()) {
			Branch branch = this.branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION + branchId));
			if (branch != null && branch.isActive()) {
				ClassRoom classRoomUpdate = this.classRoomServiceRepository.findById(classRoomId)
						.orElseThrow(() -> new ClassRoomNotFound("class room not found given by" + classRoomId));
				if (classRoomUpdate != null && classRoomUpdate.isActive()) {
					classRoomUpdate.setMaxstudents(dto.getMaxcount());
					classRoomUpdate.setSection(dto.getSection());
					classRoomUpdate.setStandard(dto.getStandard());
					classRoomUpdate.setSyllabus(dto.getSyllabus());
					ClassRoom updatedData = this.classRoomServiceRepository.save(classRoomUpdate);
					response = this.mapper.map(updatedData, AddClassRoomDTO.class);

				}
			}
		}
		return response;
	}

	@Override
	public List<AddClassRoomDTO> getAllClassRooms(String orgId, String branchId)
			throws organizationNotFound, BranchNotFoundEception {
		List<AddClassRoomDTO> dtos = null;
		Organization org = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if (org.isActive()) {
			Branch branch = this.branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION + branchId));
			if (branch.isActive()) {
				dtos = this.classRoomServiceRepository.findAll().stream()
						.map(entity -> this.mapper.map(entity, AddClassRoomDTO.class)).collect(Collectors.toList());
			}
		}
		return dtos;
	}

	@Override
	public AddClassRoomDTO getClassRoomsById(String orgId, String branchId, String classRoomId)
			throws organizationNotFound, BranchNotFoundEception, ClassRoomNotFound {
		AddClassRoomDTO addClassRoomDTO = null;
		Organization org = this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if (null != org && org.isActive()) {
			Branch branch = this.branchRepository.findById(branchId)
					.orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION + branchId));
			if (branch != null && branch.isActive()) {
				ClassRoom classroom = this.classRoomServiceRepository.findById(classRoomId)
						.orElseThrow(() -> new ClassRoomNotFound("classRoom not found given by id " + classRoomId));
				addClassRoomDTO = this.mapper.map(classroom, AddClassRoomDTO.class);
			}
		}

		return addClassRoomDTO;
	}

	@Override
	public Map<Boolean, String> disableClassRoom(String orgId, String branchId, String classRoomId) throws organizationNotFound,BranchNotFoundEception,ClassRoomNotFound {
		Map<Boolean, String> mapResponse=new HashMap<>();
         Organization orgExist=this.organizationRepo.findById(orgId).orElseThrow(() -> new organizationNotFound());
		if(null!=orgExist && orgExist.isActive()){
			Branch branchExist=this.branchRepository.findById(branchId).orElseThrow(() -> new BranchNotFoundEception(Constant.BRANCH_NOT_FOUND_EXCEPTION+branchId));
			if(null!=branchExist && branchExist.isActive() ) {
				ClassRoom classroomExist=classRoomServiceRepository.findById(classRoomId).orElseThrow(() -> new ClassRoomNotFound("classRoom not found given by id"+classRoomId));
				classroomExist.setActive(false);
				mapResponse.put(true, "successfully disabled class room");
				}
		}
		return mapResponse;
	}

}
