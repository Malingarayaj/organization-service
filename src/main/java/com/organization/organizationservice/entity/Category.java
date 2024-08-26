package com.organization.organizationservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Category {

	@Id
	private String category_id;
	
	private String categoryName;
}
