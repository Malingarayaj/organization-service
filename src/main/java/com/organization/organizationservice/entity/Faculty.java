package com.organization.organizationservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
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

import lombok.Data;
@Data
@Entity
@Table(name = "Faculty", uniqueConstraints = {@UniqueConstraint(columnNames = {"branchId", "firstName","dateOfBirth"})})
public class Faculty {
	@Id @GeneratedValue(generator = "facultyIdGenerator")
	@GenericGenerator(name = "facultyIdGenerator", strategy = "com.organization.organizationservice.entity.FacultyIdGenerator")
	@Column(name="facultyId")
	private String facultyId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="staffId")
	private String staffId;
	
	@Column(name="fatherFirstName")
	private String fatherFirstName;
	
	@Column(name="fatherLastName")
	private String fatherLastName;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="dateOfJoining")
	private String dateOfJoining;
	
	@Column(name="dateOfBirth")
	private String dateOfBirth;
	
	@Column(name="isActive")
	private boolean isActive = true;	
	
	@Column(name="comments")
	private String comments;
	
	@Column(name="localAddress")
	private String localAddress;
	
	@Column(name="permanentAddress")
	private String permanentAddress;
	
	@Column(name="userName", unique=true)
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="noOfExperience")
	private int noOfExperience;
	
	@Column(name="designation")
	private String designation;	
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="bloodGroup")
	private String bloodGroup;
	
	@Column(name="isPermanent")
	private boolean isPermanent;	
	
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="branchId")
	private Branch branch;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy="faculty",cascade = CascadeType.REMOVE)
	private List<ClassRoom> classRooms = new ArrayList<ClassRoom>();
	
		
	@ElementCollection
	@CollectionTable(name="FacultyEmails", joinColumns=@JoinColumn(name="facultyId"))
	private List<Email> emails = new ArrayList<Email>();
	
	@ElementCollection
	@CollectionTable(name="FacultyPhoneNumbers", joinColumns=@JoinColumn(name="facultyId"))
	private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
	
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy="faculty",cascade = CascadeType.REMOVE)
	private List<FacultyLeave> facultyLeave = new ArrayList<FacultyLeave>();
//	
//	@OneToMany(fetch = FetchType.LAZY,mappedBy="faculty",cascade = CascadeType.ALL)
//	private List<FacultyLeaveTranscations> facultyLeaveTransactions = new ArrayList<FacultyLeaveTranscations>();
//	
//	@OneToOne(mappedBy="faculty", cascade=CascadeType.ALL)
//	private FacultyLeaveSummary facultyLeaveSummary;
}
