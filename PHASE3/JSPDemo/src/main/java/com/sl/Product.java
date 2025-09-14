package com.sl;

import java.io.Serializable;

// Following is a Java bean 
public class Product implements Serializable{
	
	private String name;
	private float price;
	
	public Product() {
		
	}
	
	public Product(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}	

}
