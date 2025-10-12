package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

	// Task - 2
	// Implement below functionality
	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
		Optional<Product> optionalProduct = productRepositry.findById(id);

		if (optionalProduct.isPresent()) {
			productRepositry.deleteById(id);

			redirectAttributes.addFlashAttribute("message", "Product (id=" + id + ") deleted successfully!");
		} else {
			redirectAttributes.addFlashAttribute("message", "Product (id=" + id + ") not found.");
		}

		return "redirect:/products/list-all"; // WEB-INF/views/products.jsp
	}

}
