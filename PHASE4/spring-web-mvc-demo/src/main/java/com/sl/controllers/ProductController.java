package com.sl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sl.exceptions.ProductCreateException;

@Controller
@RequestMapping("/product-controller")
public class ProductController {

//	@PostMapping("/add")
//	@ResponseBody
//	public String addProduct(@RequestParam("name") String name, @RequestParam("price") String price ) {
//		
//		System.out.println("name="+name + ", price="+price );
//		
//		
//		return " Added Product Succesfully";
//	}

	// Task-1 re implement above /add mapping where the response is rendered by a
	// JSP.

	@PostMapping("/add")	
	public String addProduct(@RequestParam("name") String name, @RequestParam("price") String price) throws ProductCreateException {
		System.out.println("name of the product = " + name + ", price=" + price);
		
		if(name.isBlank()) throw new ProductCreateException("Product name cannot be blank");
		
		return "ProductAddMessage"; // --> JSP File Name
	}

}
