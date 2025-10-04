package springfwdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import springfwdemo.IProduct;

@Component
//@Scope("singleton")
@Scope("prototype")
public class Product implements IProduct {

	String name = "Dell LED Monitor";
	String desc = " High end 4k monitor ";
	float price = 34000.0f;
	
	@Autowired
	Brand brand;
	
	public Product() {
		
	}

	public Product(String name, String desc, float price) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	
	public Product(String name, String desc, float price, Brand brand) {
		this(name, desc, price);
		this.brand = brand;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	

}