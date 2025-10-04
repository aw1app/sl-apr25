package com.sl.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	// Aspect 1
	@Before("execution(* com.sl.BankAccount.withdraw(..))")
	public void withdrawAspect() {
		System.out.println("INSIDE withdrawAspect  Initiating withdrawl ....");
	}

	// Aspect 2
	@Before("execution(* com.sl.BankAccount.*(..))")
	public void bankAcctAspect() {
		System.out.println("INSIDE bankAcctAspect  ....");
	}

	// Aspect 3
	// Task-1 : Write an aspect that will run only when getBalance of BankAccount is
	// invoked
	@Before("execution(* com.sl.BankAccount.getBalance( .. ))")
	public void getBalanceAspect() {
		System.out.println("INSIDE getBalanceAspect ");
	}

	// Aspect 4
	// Task-2 : Write a before aspect that will run on any method of any class
	// within com.sl package
	@Before("execution(* com.sl.*.*(..))")
	public void LogBeforeAnyMethodofPackageComDotSl() {
		System.out.println("INSIDE LogBeforeAnyMethodofPackageComDotSl");
	}
	
	/* AFTER Advice */
	// Aspect 5
	@After("execution(* com.sl.X.doubleIt(..))")
	public void LogAfterAnyMethodofPackageComDotSl() {
		System.out.println("INSIDE LogAfterAnyMethodofPackageComDotSl");
	}
	

}
