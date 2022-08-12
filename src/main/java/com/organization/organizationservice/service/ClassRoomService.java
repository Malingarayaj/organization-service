package com.organization.organizationservice.service;

import com.organization.organizationservice.dto.AddClassRoomDTO;
import com.organization.organizationservice.exception.classRoomisAlreadyExist;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;

public interface ClassRoomService {

	AddClassRoomDTO saveClassRoom(String orgId, String branchId, AddClassRoomDTO dto) throws organizationNotFound,BranchNotFoundEception,classRoomisAlreadyExist;

}
