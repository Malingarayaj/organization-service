package com.organization.organizationservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FacultyLeave")
public class FacultyLeave {
	@Id
	@GeneratedValue(generator = "faculty_Id")
	@GenericGenerator(name = "faculty_Id", strategy = "com.organization.organizationservice.entity.FacultyLeaveIdGenerator")
	@Column(name = "facultyLeaveId")
	private String facultyLeaveId;

	@Column(name = "fromDate")
	private String fromDate;

	@Column(name = "toDate")		
	private String toDate;

	@Column(name = "reason",length = 100000)		
	private String reason;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "halfDay")
	private boolean halfDay=false;
	
	@Column(name = "timeFrame")
	private String timeFrame;
	
	@Column(name = "levaeBalance")
    private Integer levaeBalance;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="facultyId")
	private Faculty faculty;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "branchId")
	private Branch branch;
	
	
	
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "state")
//	private FacultyLeaveState state;
}
