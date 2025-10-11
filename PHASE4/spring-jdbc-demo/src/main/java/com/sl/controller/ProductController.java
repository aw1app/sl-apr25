package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sl.dao.ProductDAO;
import com.sl.entity.Product;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductDAO productDAO;

	@GetMapping("/list-all")
	public String getProducts(Model model) {
		List<Product> products = productDAO.getProducts();

		model.addAttribute("products", products);

		return "products"; // views/products.jsp
	}

	@PostMapping("/add")
	public String addProduct(Product product, Model model) {
		int rowCount = productDAO.insertProduct(product);

		model.addAttribute("rowCount", rowCount);

		return "add-product-success"; // WEB-INF/views/add-product-success.jsp
	}

	@GetMapping("/delete/{id}")
	public String addProduct(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
		int rowCount = productDAO.deleteProduct(id);

		if (rowCount > 0)
			redirectAttributes.addFlashAttribute("message", "Product (id=" + id + ") deleted successfully!");
		else
			redirectAttributes.addFlashAttribute("message", "Product (id=" + id + ") not found.");

		return "redirect:/products/list-all"; // WEB-INF/views/products.jsp
	}

}
