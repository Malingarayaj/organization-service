package com.organization.organizationservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.dto.AddClassRoomDTO;
import com.organization.organizationservice.exception.classRoomisAlreadyExist;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.service.ClassRoomService;

@RestController
@RequestMapping("org/{orgId}/branch/{branchId}/classroom")
public class ClassRoomController {
	
	@Autowired
	private ClassRoomService classRoomService;
	
	
	@PostMapping("/save")
	public ResponseEntity<? extends Object> saveClassRoom(@PathVariable String orgId,@PathVariable String branchId,@RequestBody AddClassRoomDTO dto) throws organizationNotFound, BranchNotFoundEception, classRoomisAlreadyExist{
		AddClassRoomDTO res=classRoomService.saveClassRoom(orgId,branchId,dto);
		return ResponseEntity.ok(res);
	}

}
