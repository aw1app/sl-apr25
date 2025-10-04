package com.sl.aspects;

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
		System.out.println("INSIDE getBalance method");
	}

	// Aspect 4
	// Task-2 : Write an before aspect that will run on any method of any class within com.sl package

}
