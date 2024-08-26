package com.organization.organizationservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.dto.ExamDetailsDTO;
import com.organization.organizationservice.service.ExamService;

@RestController
@	RequestMapping("/exam/assemenet/{classRoomId}/{assessmentId}")
public class ExamController {
	
	@Autowired
	private ExamService examService;
	
	
	@PostMapping("/addExam")
	public ResponseEntity<? extends Object> createExam(@RequestBody ExamDetailsDTO detailsDTO,@PathVariable String classRoomId,@PathVariable String assessmentId){
		return ResponseEntity.ok(examService.createExam(detailsDTO,classRoomId,assessmentId));
	}
	

}
