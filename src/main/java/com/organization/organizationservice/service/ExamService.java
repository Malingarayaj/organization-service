package com.organization.organizationservice.service;

import com.organization.organizationservice.dto.ExamDetailsDTO;

public interface ExamService {

	Object createExam(ExamDetailsDTO detailsDTO,String classRoomId,String assessmentId);

}
