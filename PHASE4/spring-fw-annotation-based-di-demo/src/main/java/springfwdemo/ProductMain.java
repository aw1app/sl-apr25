package springfwdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfwdemo.beans.Product;

@Configuration
@ComponentScan("springfwdemo.beans")
public class ProductMain {

	public static void main(String[] args) {

		// IProduct p1 = new Product("TV", " 55 LED television", 55000.0f);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductMain.class);

		System.out.println("\n\n Product instance is automatically created IoC/DI from the @Component annotated classes ");
		Product p3 =  context.getBean(Product.class);
		
		System.out.println("p3 is "+ p3);

		System.out.println("Product p3's name is " + p3.getName());
		System.out.println("Product p3's desc is " + p3.getDesc());
		System.out.println("Product p3's price is " + p3.getPrice());
		System.out.println("Product p3's brand is " + p3.getBrand().getName());
		
		
		
		Product p4 =  context.getBean(Product.class);
		
		System.out.println("\n p4 is "+ p4);

		System.out.println("Product p4's name is " + p4.getName());
		System.out.println("Product p4's desc is " + p4.getDesc());
		System.out.println("Product p4's price is " + p4.getPrice());
		System.out.println("Product p4's brand is " + p4.getBrand().getName());
		
	}

}
