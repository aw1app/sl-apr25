package com.sl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.sl")
@Configuration
@EnableAspectJAutoProxy
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Citi Bank");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		
		BankAccount acct1 = context.getBean(BankAccount.class);
		
		//System.out.println("Acct balance is : "+ acct1.getBalance());
		
		acct1.deposit(10000.0d);
		
		//System.out.println("Acct balance is : "+ acct1.getBalance());
		
		acct1.withdraw(50000.0d);
		//System.out.println("Acct balance is : "+ acct1.getBalance());
		
		
		acct1.withdraw(2000.0d);
		//System.out.println("Acct balance is : "+ acct1.getBalance());
		
	}

}
