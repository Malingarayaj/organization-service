package com.organization.organizationservice.rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.dto.AddClassRoomDTO;
import com.organization.organizationservice.exception.FacultyNotFoundException;
import com.organization.organizationservice.exception.classRoomisAlreadyExist;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.ClassRoomNotFound;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.service.ClassRoomService;

@RestController
@RequestMapping("org/{orgId}/branch/{branchId}/classroom")
public class ClassRoomController {
	
	@Autowired
	private ClassRoomService classRoomService;
	
	
	@PostMapping("/save/{facultyId}")
	public ResponseEntity<? extends Object> saveClassRoom(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String facultyId,@RequestBody AddClassRoomDTO dto) throws organizationNotFound, BranchNotFoundEception, classRoomisAlreadyExist, FacultyNotFoundException{
		AddClassRoomDTO res=classRoomService.saveClassRoom(orgId,branchId,facultyId,dto);
		return ResponseEntity.ok(res);
	}

	@PutMapping("/update/{classRoomId}")
	public ResponseEntity<? extends Object> updateClassRoom(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String classRoomId,@RequestBody AddClassRoomDTO dto) throws organizationNotFound, BranchNotFoundEception,ClassRoomNotFound, classRoomisAlreadyExist{
		AddClassRoomDTO updateres=classRoomService.updateClassRoom(orgId,branchId,classRoomId,dto);
		return ResponseEntity.ok(updateres);
	}
	
	@GetMapping("/allClasses")
	public ResponseEntity<? extends Object> getAllClassRooms(@PathVariable String orgId,@PathVariable String branchId) throws organizationNotFound, BranchNotFoundEception{
		List<AddClassRoomDTO> dtos=classRoomService.getAllClassRooms(orgId,branchId);
		return ResponseEntity.ok(dtos);
	}
	
	@GetMapping("/{classRoomId}")
	public ResponseEntity<? extends Object> getClassRoomsById(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String classRoomId) throws organizationNotFound, BranchNotFoundEception,ClassRoomNotFound{
		AddClassRoomDTO classRoom=classRoomService.getClassRoomsById(orgId,branchId,classRoomId);
		return ResponseEntity.ok(classRoom);
	}
	
	@DeleteMapping("/{classRoomId}")
	public ResponseEntity<? extends Object> disableClassRoom(@PathVariable String orgId,@PathVariable String branchId,@PathVariable String classRoomId) throws ClassRoomNotFound, organizationNotFound, BranchNotFoundEception{
		Map<Boolean,String> response=classRoomService.disableClassRoom(orgId,branchId,classRoomId);
		return ResponseEntity.ok(response);
	}
	
	


}
