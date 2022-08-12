package com.organization.organizationservice.entity;

import java.sql.Timestamp;

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

@Entity
@Table(name = "studentRecords")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRecords {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private long id;

	private String rollNumber;

	private String standard;

	private String section;

	private String year;

	private String age;

	private boolean vanAvailed = false;

	private Timestamp admissionDate;

	private boolean isPromoted;

	private float discountAmount;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "studentId",nullable = false)
	private Student student;

}
