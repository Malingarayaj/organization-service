package com.organization.organizationservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.entity.Category;
import com.organization.organizationservice.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/addCat")
	public String addCategory(Model model) {
		model.addAttribute("category", categoryService.addCategory(new Category()));
		return "shop";
	}
	
	@GetMapping("/getCategories")
	public String getAllCategories(Model model) {
		List<Category> categories=categoryService.getAllCategories();
		model.addAttribute("categories", categories);
		return "categories";
	}
	
	@GetMapping("/category/{categoryName}")
	public String getCatgeoryByName(Model model,@PathVariable String categoryName) {
		model.addAttribute("category", categoryService.getCatgeoryByName(categoryName));
		return "category";
	}

}
