package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sl.dao.ProductDAO;
import com.sl.entity.Product;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductDAO productDAO;
	
	
	
	@GetMapping("/list-all")
	public String getProducts(Model model) {
		List<Product> products  = productDAO.getProducts();
		
		model.addAttribute("products", products);
		
		return "products"; // views/products.jsp
	}

}
