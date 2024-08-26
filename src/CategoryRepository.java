package com.organization.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.organizationservice.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

	Object findByCategoryName(String categoryName);

}
