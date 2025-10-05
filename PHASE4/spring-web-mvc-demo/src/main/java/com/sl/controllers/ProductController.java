package com.sl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String addProduct(@RequestParam("name") String name, @RequestParam("price") String price) {
		System.out.println("name of the product = " + name + ", price=" + price);
		return "ProductAddMessage"; // --> JSP File Name
	}

}
