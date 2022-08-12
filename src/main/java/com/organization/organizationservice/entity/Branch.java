package com.organization.organizationservice.entity;

import java.sql.Timestamp;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "Branch_Tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Branch {
	@Id @GeneratedValue(generator="branchIdGenerator")
	@GenericGenerator(name="branchIdGenerator", strategy = "com.organization.organizationservice.entity.BranchGenerator")
	
	private String branchId;

	@Column(name = "branchName")
	@NonNull
	private String branchName;

	@Column(name = "address")
	@NonNull
	private String address;

	@Column(name = "created")
	private Timestamp created;

	@Column(name = "isActive")
	private boolean isActive = true;

	@Column(name = "masterEmailId")
	private String masterEmailId;

	@Column(name = "masterEmailPassword")
	private String masterEmailPassword;

	@Column(name = "faxNumber")
	private String faxNumber;

	@ElementCollection
	@CollectionTable(name = "email", joinColumns = @JoinColumn(name = "branchId"))
//	@OneToMany(cascade = CascadeType.ALL)
	private List<Email> emails = new ArrayList<Email>();

	@ElementCollection
	@CollectionTable(name = "phoneNumber", joinColumns = @JoinColumn(name = "branchId"))
	private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

	@Column(name = "pincode")
	private String pincode;

//	private String orgId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orgId")
	private Organization org;

	@OneToOne(fetch = FetchType.LAZY)
	private BranchManager manager;
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
//	private List<BranchOperator> branchOperators = new ArrayList<BranchOperator>();
//
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
	private List<Student> students = new ArrayList<Student>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.ALL)
	private List<ClassRoom> classRooms = new ArrayList<>();

	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy="branch",
	 * cascade=CascadeType.REMOVE) private List<FeesStructure> feesStructures = new
	 * ArrayList<FeesStructure>();
	 */
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
//	private List<Faculty> faculties = new ArrayList<Faculty>();
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
//	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
//	private List<Inventory> inventories = new ArrayList<Inventory>();
//
	
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
//	private List<Event> events = new ArrayList<Event>();
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
//	private List<Subject> subjects = new ArrayList<Subject>();
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
//	private List<Assessment> assessments = new ArrayList<Assessment>();

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
//	private List<FacultyLeave> facultyLeave = new ArrayList<FacultyLeave>();
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
//	private List<ExpandFeeStructure> expandFeeStructure = new ArrayList<ExpandFeeStructure>();
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
//	private List<NonTeachingStaff> nonTeachingStaffs = new ArrayList<NonTeachingStaff>();
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch", cascade = CascadeType.REMOVE)
//	private List<VehicleRoute> vehicleRoutes = new ArrayList<VehicleRoute>();

}
