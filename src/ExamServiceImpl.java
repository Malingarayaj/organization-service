package com.organization.organizationservice.service;

import java.util.Date;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.dto.ExamDetailsDTO;
import com.organization.organizationservice.entity.Assessment;
import com.organization.organizationservice.entity.ClassRoom;
import com.organization.organizationservice.entity.Exam;
import com.organization.organizationservice.exception.AssessmentNotFound;
import com.organization.organizationservice.execption.ClassRoomNotFound;
import com.organization.organizationservice.repository.ClassRoomServiceRepository;
import com.organization.organizationservice.repository.ExamRepository;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamRepository examRepository;

	@Autowired
	private AddAssessmentRepo addAssessmentRepo;

	@Autowired
	private ClassRoomServiceRepository classRoomServiceRepository;

	@Override
	public Object createExam(ExamDetailsDTO detailsDTO, String classRoomId, String assessmentId) {
		ClassRoom classRoom = classRoomServiceRepository.findById(classRoomId)
				.orElseThrow(() -> new ClassRoomNotFound("class room not found"));
		if (null != classRoom && classRoom.isActive()) {
			Assessment assessment = addAssessmentRepo.findById(assessmentId)
					.orElseThrow(() -> new AssessmentNotFound("not found"));
			if (assessment.isActive()) {
				Exam entity = new Exam();
				entity.setActive(true);
				entity.setAssessment(assessment);
				entity.setClassRoomId(classRoomId);
				entity.setSubjectCode(detailsDTO.getSubjectName());
				entity.setMaximumMarks(detailsDTO.getMaxMarks());
				Exam savedExam = examRepository.save(entity);
				if (!ObjectUtils.isEmpty(savedExam)) {
					detailsDTO.setMaxMarks(savedExam.getMaximumMarks());
					detailsDTO.setSubjectName(savedExam.getSubjectCode());
					detailsDTO.setStartTime(savedExam.getStartTime().toString());
					detailsDTO.setEndTime(savedExam.getEndTime().toString());
					detailsDTO.setDate(savedExam.getDate().toString());
				}

			}
		}
		return detailsDTO;
	}

}
