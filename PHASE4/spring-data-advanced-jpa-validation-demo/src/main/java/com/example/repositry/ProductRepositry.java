package com.example.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Product;

@Repository
public interface ProductRepositry extends JpaRepository<Product, Integer>{

	// Exact product name match
	List<Product> findAllByName(String name);
	
	
	List<Product> findAllByNameContaining(String partialName);
	
	
	List<Product> findAllByPriceLessThan(float price);
	
}
