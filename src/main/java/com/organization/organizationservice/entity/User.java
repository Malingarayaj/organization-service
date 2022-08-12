package com.organization.organizationservice.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	
	private String userId;
	
	private String userName;
	
	private String password;
	
	private String firstName;

	
	private String lastName;
	
	private Timestamp created;
	
	private Timestamp lastModifiedTime;
	
	private boolean isActive;
	
	private String gender;
	
	private String bloodGroup;
	
	
	 

}
