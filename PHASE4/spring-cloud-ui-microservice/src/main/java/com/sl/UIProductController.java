package com.sl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.sl.dto.ProductDTO;

@Controller
public class UIProductController {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/ui/products/list-all")
	public String getProducts(Model model) {
		
		ProductDTO[] products = restTemplate.getForObject("http://SPRING-CLOUD-PRODUCTS-MICROSERVICE/products/list-all", ProductDTO[].class);
		
		model.addAttribute("products", products);
		
		return "products"; // WEB-INF/views/products.jsp
	}

}
