package com.sl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	

}


// RowMapper implementation
class ProductRowMapper implements RowMapper<Product>{

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