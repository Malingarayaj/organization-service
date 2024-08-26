//package com.organization.organizationservice.entity;
//
//import java.sql.Timestamp;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//
//import org.hibernate.annotations.GenericGenerator;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.NonNull;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "Vehicle", uniqueConstraints = { @UniqueConstraint(columnNames = { "branchId", "vehicleRegNo" }) })
//public class Vehicle {
//	@Id
//	@GeneratedValue(generator = "vehicleIdGenerator")
//	@GenericGenerator(name = "vehicleIdGenerator", strategy = "com.organization.organizationservice.entity.VehicleIdGenerator")
//	private String vehicleId;
//
//	@Column(name = "vehicleType")
//	@NonNull
//	private String vehicleType;
//
//	@Column(name = "vehicleRegNo")
//	@NonNull
//	private String vehicleRegNo;
//
//	@Column(name = "vehicleModel")
//	@NonNull
//	private String vehicleModel;
//
//	@Column(name = "dateOfPurchase")
//	private Timestamp dateOfPurchase;
//
//	@Column(name = "yearOfManufacter")
//	private String yearOfManufacter;
//
//	@Column(name = "insuranceRenewal")
//	private Timestamp insuranceRenewal;
//
//	@Column(name = "nextRenewalDate")
//	private Timestamp nextRenewalDate;
//
//	@Column(name = "seatCapacity")
//	private int seatCapacity;
//
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "branchId")
//	private Branch branch;
//
//	@Column(name = "isActive")
//	private boolean isActive = true;
//
////	@OneToOne
////	// @JoinColumn(name="vehicleRouteId")
////	private VehicleRoute vehicleRoute;
//
////	@OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
////	private List<NonTeachingStaff> nonTeachingStaffs = new ArrayList<NonTeachingStaff>();
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicle")
//	private List<Student> students = new ArrayList<Student>();
//}
