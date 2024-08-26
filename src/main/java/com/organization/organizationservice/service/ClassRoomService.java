package com.organization.organizationservice.service;

import java.util.List;
import java.util.Map;

import com.organization.organizationservice.dto.AddClassRoomDTO;
import com.organization.organizationservice.exception.FacultyNotFoundException;
import com.organization.organizationservice.exception.classRoomisAlreadyExist;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.ClassRoomNotFound;
import com.organization.organizationservice.execption.organizationNotFound;

public interface ClassRoomService {

	AddClassRoomDTO saveClassRoom(String orgId, String branchId,String facultyId, AddClassRoomDTO dto) throws organizationNotFound,BranchNotFoundEception,classRoomisAlreadyExist,FacultyNotFoundException ;

	AddClassRoomDTO updateClassRoom(String orgId, String branchId, String classRoomId, AddClassRoomDTO dto) throws organizationNotFound,BranchNotFoundEception,ClassRoomNotFound,
	classRoomisAlreadyExist;

	List<AddClassRoomDTO> getAllClassRooms(String orgId, String branchId) throws organizationNotFound, BranchNotFoundEception;

	AddClassRoomDTO getClassRoomsById(String orgId, String branchId, String classRoomId)throws organizationNotFound, BranchNotFoundEception,ClassRoomNotFound;

	Map<Boolean, String> disableClassRoom(String orgId, String branchId, String classRoomId)throws organizationNotFound, BranchNotFoundEception,ClassRoomNotFound;

}
