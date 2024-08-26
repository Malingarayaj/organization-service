package com.organization.organizationservice.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Exam",uniqueConstraints={@UniqueConstraint(columnNames={"examId","date","startTime","endTime"})})
public class Exam  {
	@Id @GeneratedValue(generator = "examIdGenerator")
	@GenericGenerator(name = "examIdGenerator", strategy = "com.organization.organizationservice.entity.ExamIdGenerator")
	@Column(name="examId")
	private String examId;
	
	@Column(name="isActive")
	private boolean isActive=true;

	@Column(name = "date")
	private Date date;

	@Column(name = "startTime")
	private Time startTime;
	
	@Column(name = "endTime")
	private Time endTime;
	
	@Column(name = "subjectCode")
	private String subjectCode;
	
	@Column(name = "classRoomId")
	private String classRoomId;
	
	@Column(name = "maximumMarks")
	private int maximumMarks;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "assessmentId")
	private Assessment assessment;
		
	

}
