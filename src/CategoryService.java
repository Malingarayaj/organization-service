package com.organization.organizationservice.service;

import java.util.List;

import com.organization.organizationservice.entity.Category;

public interface CategoryService {

	Object addCategory(Category category);

	List<Category> getAllCategories();

	Object getCatgeoryByName(String categoryName);

}
