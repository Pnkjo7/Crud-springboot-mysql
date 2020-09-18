package com.resume.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resume.dashboard.entity.Product;

public interface ProductRespository extends JpaRepository<Product,Integer>{

	Product findByName(String name);

}
