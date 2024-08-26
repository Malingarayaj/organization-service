package com.organization.organizationservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Assessment", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "assessmentId", "assessmentName", "year" }) })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Assessment {
	@Id
	@GeneratedValue(generator = "acessIdGenerator")
	@GenericGenerator(name = "acessIdGenerator", strategy = "com.organization.organizationservice.entity.AssessmentGenerator")
	@Column(name = "assessmentId")
	private String assessmentId;

	@Column(name = "assessmentName")
	private String assessmentName;

	@Column(name = "year")
	private String year;

//	@ManyToMany(fetch = FetchType.LAZY)
//	private List<ClassRoom> classRooms = new ArrayList<ClassRoom>();
//
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Exam> exams = new ArrayList<Exam>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "branchId")
	private Branch branch;

	@Column(name = "isActive")
	private boolean isActive = true;

	@Column(name = "completed")
	private boolean completed = false;

	@Column(name = "passPercentage")
	private double passPercentage;

}
