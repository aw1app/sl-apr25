package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	// Find all products given name is <name>
	@GetMapping("/list-all-by-name/{name}")
	public String getProductsByName(@PathVariable("name") String name, Model model) {
		List<Product> products = productRepositry.findAllByName(name);

		model.addAttribute("products", products);

		return "products"; // views/products.jsp
	}

	// Find all products given name has <name>
	@GetMapping("/list-all-having-name")
	public String getProductsByNameHaving(@RequestParam("name") String name, Model model) {
		List<Product> products = productRepositry.findAllByNameContaining(name);

		model.addAttribute("products", products);

		return "products"; // views/products.jsp
	}

	// Find all products having price less than
	@GetMapping("/list-all-having-price-lt")
	public String getProductsByNameHaving(@RequestParam("price") float price, Model model) {
		List<Product> products = productRepositry.findAllByPriceLessThan(price);

		model.addAttribute("products", products);

		return "products"; // views/products.jsp
	}

	// Task - 2
	// Implement below delete functionality
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

	// Task - 3
	// Implement below find a Single Product and display it's complete details
	// functionality

	// Task - 4
	// Implement add a new product functionality
	@GetMapping("/new-product")
	public String addProductForm(Product product, Model model) {

		return "new-product"; // WEB-INF/views/new-product.jsp
	}

	@PostMapping("/new-product")
	public String addProduct(Product product, RedirectAttributes redirectAttributes) {
		
		Product prodCreated = productRepositry.save(product);
		
		redirectAttributes.addFlashAttribute("message", "Product (id=" + prodCreated.getId() + ") created successfully!");
		
		return "redirect:/products/list-all"; // WEB-INF/views/products.jsp
	}

	// search product from UI
	@GetMapping("/search")
	public String search() {
		return "search-products";
	}
}
