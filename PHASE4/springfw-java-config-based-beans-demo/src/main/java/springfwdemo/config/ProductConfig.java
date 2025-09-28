package springfwdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfwdemo.Brand;
import springfwdemo.Product;

@Configuration
public class ProductConfig {
	
	
	@Bean(name="product1")
	public Product createProduct() {
		
		Product p = new Product("Laptop","HP AI laptop 2025",100000.0f );
		
		return p;		
	}

	
	@Bean(name="product2")
	public Product createProduct2() {
		
		Product p = new Product("Laptop","Dell Co Pilot laptop 2025",100300.0f );
		
		return p;		
	}
	
	@Bean(name="product3")
	public Product createProduct3WithBrand() {
		
		Brand b1 = new Brand("Phillips");
		
		Product p = new Product("Laptop","Dell Co Pilot laptop 2025",100300.0f, b1);
		
		return p;		
	}

}
