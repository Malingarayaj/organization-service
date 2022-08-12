package com.organization.organizationservice.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.dto.AddClassRoomDTO;
import com.organization.organizationservice.entity.Branch;
import com.organization.organizationservice.entity.ClassRoom;
import com.organization.organizationservice.entity.Organization;
import com.organization.organizationservice.exception.classRoomisAlreadyExist;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.repository.BranchRepository;
import com.organization.organizationservice.repository.ClassRoomServiceRepository;
import com.organization.organizationservice.repository.OrganizationRepo;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {

	private ClassRoomServiceRepository classRoomServiceRepository;
    @Autowired
	private OrganizationRepo organizationRepo;
	@Autowired
	private BranchRepository branchRepository;

	@Autowired
	public ClassRoomServiceImpl(ClassRoomServiceRepository classRoomServiceRepository) {
		this.classRoomServiceRepository = classRoomServiceRepository;
	}

	@Override
	public AddClassRoomDTO saveClassRoom(String orgId, String branchId, AddClassRoomDTO dto)
			throws organizationNotFound, BranchNotFoundEception, classRoomisAlreadyExist {
		ClassRoom entity = new ClassRoom();
		Optional<Organization> isExist = organizationRepo.findByOrgId(orgId);
		if (!isExist.isPresent()) {
			throw new organizationNotFound();
		}
		Optional<Branch> isBranchExist = branchRepository.findByBranchId(branchId);
		if (!isBranchExist.isPresent()) {
			throw new BranchNotFoundEception("not found branch given by " + branchId);
		}

		Optional<ClassRoom> isclassRoomExist = classRoomServiceRepository.findById(dto.getClassRoomId());

		if (isclassRoomExist.isPresent()) {
			throw new classRoomisAlreadyExist();
		}
		
		entity.setSection(dto.getSection());
		entity.setStandard(dto.getStandard());
		entity.setSyllabus(dto.getSyllabus());
		entity.setYear(dto.getYear());
		entity.setActive(true);
		entity.setMaxstudents(60);
		// entity.setStudentLists(null);
		entity.setBranch(isBranchExist.get());
		ClassRoom savedEntity = classRoomServiceRepository.save(entity);
		BeanUtils.copyProperties(savedEntity, dto);
        return dto;
	}

}
