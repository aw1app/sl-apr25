package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Product;
import com.example.repositry.ProductRepositry;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	
	@Autowired
	ProductRepositry productRepositry;
	
	

	@GetMapping("/list-all")
	public String getProducts(Model model) {
		List<Product> products = productRepositry.findAll();

		model.addAttribute("products", products);

		return "products"; // views/products.jsp
	}

}
