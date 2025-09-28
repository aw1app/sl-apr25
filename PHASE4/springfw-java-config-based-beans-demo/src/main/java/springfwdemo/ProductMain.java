package springfwdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springfwdemo.config.ProductConfig;

public class ProductMain {

	public static void main(String[] args) {

		// IProduct p1 = new Product("TV", " 55 LED television", 55000.0f);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
		
		System.out.println("\n\n Product Bean from Java Configuration file demo ");
		IProduct p1 = (IProduct) context.getBean("product1");

		System.out.println("Product p1's name is " + p1.getName());
		System.out.println("Product p1's desc is " + p1.getDesc());
		System.out.println("Product p1's price is " + p1.getPrice());
		
		
		IProduct p2 = (IProduct) context.getBean("product2");

		System.out.println("Product p2's name is " + p2.getName());
		System.out.println("Product p2's desc is " + p2.getDesc());
		System.out.println("Product p2's price is " + p2.getPrice());
		
		
		System.out.println("\n\n Product Bean from Java Configuration file that has a brand demo ");
		Product p3 =  context.getBean("product3", Product.class);

		System.out.println("Product p3's name is " + p3.getName());
		System.out.println("Product p3's desc is " + p3.getDesc());
		System.out.println("Product p3's price is " + p3.getPrice());
		System.out.println("Product p3's brand is " + p3.getBrand().getName());
		
	}

}
