package com.organization.organizationservice.service;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.entity.Category;
import com.organization.organizationservice.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Object addCategory(Category category) {
		Object response=null;
		if(ObjectUtils.allNotNull(category)) {
		 response= categoryRepository.save(category);
		}
		return response;
		
	}

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Object getCatgeoryByName(String categoryName) {
		Object response=null;
		if(null!=categoryName && !"".isEmpty()) {
		 response=categoryRepository.findByCategoryName(categoryName);
		}
		return response;
	}

}
