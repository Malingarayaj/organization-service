package com.organization.organizationservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "ClassRoom",uniqueConstraints = {@UniqueConstraint(columnNames = {"branchId","standard","section","year"})})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassRoom {
	
	@Id @GeneratedValue(generator="idGenerator")
	@GenericGenerator(name="idGenerator", strategy = "com.organization.organizationservice.entity.ClassRoomIdGenerator")
	private String classroomId;
	
	private String standard;
	
	private String section;
	
	private String year;
	
	private String syllabus;
	
	private Integer maxstudents;
	
	private boolean isActive=true;
//	
////	@ManyToMany(fetch = FetchType.LAZY)
////	private List<Student> studentLists=new ArrayList<>();
//	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "branchId",nullable = false)
	private Branch branch;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "facultyId",nullable = false)
	private Faculty faculty;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Student> studentLists = new ArrayList<Student>();	
	

}
