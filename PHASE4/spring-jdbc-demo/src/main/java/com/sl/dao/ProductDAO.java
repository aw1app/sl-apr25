package com.sl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sl.entity.Product;

public class ProductDAO {

	@Autowired
	JdbcTemplate jdbctemplate;

	public void setTemplate(JdbcTemplate template) {
		this.jdbctemplate = template;
	}

	// CRUD methods
	
	//1. QUERY
	public List<Product> getProducts() {
		String sql = "select * from products";
		return jdbctemplate.query(sql, new ProductRowMapper());		
	}
	
	// Task: 1b
	// Create a query that will return products with  price > some amount
	public List<Product> getProductsHavingPriceGreaterThan(float price) {
		return null;
	}
	
	//Task-2 
	//Create a query that will return products containing a given string in the name
	
	
	// 2. INSERT a new Product
	public int insertProduct(Product product) {
		String sql = "INSERT INTO products(name,price,category) VALUES(?,?,?)";
		return jdbctemplate.update(sql,new Object[] {product.getName(), product.getPrice(), product.getCategory()});		
	}
	
	
	// 3. DELETE a product
	// Task-3
	public int deleteProduct(int productId) {
		
		return -1;
	}
	
	
	
	// 4. Update existing product

}

// RowMapper implementation
class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int arg1) throws SQLException {

		Product product = new Product();

		product.setId(rs.getInt("id"));
		product.setName(rs.getString("name"));
		product.setPrice(rs.getFloat("price"));
		product.setCategory(rs.getString("category"));

		return product;
	}

}