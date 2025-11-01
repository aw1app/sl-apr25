package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sl.entity.Product;
import com.sl.entity.dto.ProductDTO;
import com.sl.repositry.ProductRepositry;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepositry productRepositry;

	@GetMapping("/list-all")
	public List<Product> getProducts() {
		List<Product> products = productRepositry.findAll();

		return products;
	}

//	@PostMapping("/new-product")
//	public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product, BindingResult result, RedirectAttributes redirectAttributes) {
//		Product prodCreated=new Product();
//		
//		if (result.hasErrors()) {
//
//			List<ObjectError> errors = result.getAllErrors();
//			String errorMessages = "";
//			for (ObjectError errorObj : errors) {
//				errorMessages = errorMessages+ "<br>" + errorObj.getDefaultMessage();
//			};
//			
//			System.out.println("INSIDE result.hasErrors()  block of @PostMapping(\"/new-product\") ");
//			System.out.println("errorMessages= "+ errorMessages);
//			
//			return new ResponseEntity<Product>(prodCreated, HttpStatusCode.valueOf(400));
//			// 400 status code means object/product creation failed due to invalid request from the client.
//
//		} else {
//			prodCreated = productRepositry.save(product); // prodCreated will also have the id, returned from									// the DB.
//			System.out.println("INSIDE else block of result.hasErrors()  block of @PostMapping(\"/new-product\") ");
//			return new ResponseEntity<Product>(prodCreated, HttpStatusCode.valueOf(201));
//		}
//		
//	}

	@PostMapping("/new-product")
	public ResponseEntity<ProductDTO> addProduct(@Valid @RequestBody Product product, BindingResult result,
			RedirectAttributes redirectAttributes) {

		Product prodCreated = new Product();
		ProductDTO productDTO = new ProductDTO();		

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();
			String errorMessages = "";
			for (ObjectError errorObj : errors) {
				errorMessages = errorMessages + "; " + errorObj.getDefaultMessage();
			}
			;

			if (errors.size() > 0) {
				productDTO.error = true;
				productDTO.reason = errorMessages;
			}
			
			return new ResponseEntity<ProductDTO>(productDTO, HttpStatusCode.valueOf(400));

		} else {
			prodCreated = productRepositry.save(product); // prodCreated will also have the id, returned from // the DB.

			productDTO.name = prodCreated.getName();
			productDTO.price = prodCreated.getPrice();
			productDTO.category = prodCreated.getCategory();
			productDTO.id = prodCreated.getId();
			return new ResponseEntity<ProductDTO>(productDTO, HttpStatusCode.valueOf(201));
		}
	}
	
	// TASKS: Mapping for editing a product and deleting a product

}