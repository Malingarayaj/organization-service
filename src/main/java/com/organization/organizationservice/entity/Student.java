package com.organization.organizationservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	
	@Id @GeneratedValue(generator="studentIdGenerator")
	@GenericGenerator(name="studentIdGenerator", strategy = "com.organization.organizationservice.entity.StudentIdGenerator")
	
	private String studentId;
	
	private String userName;
	
	private String password;
	
	private String studentFirstName;
	
	private String studentLastName;
	
	private String dob;
	
	private String fatherFirstName;
	
	private String fatherLastName;
	
	private String motherFirstName;
	
	private String motherLastName;
	
	private boolean isActive=true;
	
	private String yearOfJoining;
	
	private String currentClass;
	
	private String currentSeection;
	
	private String currentAdmissionYear;
	
	private String currentRollNumber;
	
	private String caste;
	
	private String syllabusType;
	
	private String religion;
	
	private String nationality;
	
	private String localAddress;
	
	private String paramananentAddress;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "student",cascade = CascadeType.ALL)
	private List<StudentRecords> studentRecords=new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "orgId",nullable = false)
	private Organization org;
	
	@ManyToOne
	@JoinColumn(name="branchId",nullable = false)
	private Branch branch;
	
	
	

}
