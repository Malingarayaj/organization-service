package com.organization.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.organizationservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
