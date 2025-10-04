package com.sl.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect3ArgumentValueDemo {

	// Aspect 1
	@Before("execution(* com.sl.BankAccount.deposit(..))")
	public void beforeBankAccountDeposit(JoinPoint joinPoint) throws Throwable {
		System.out.println("INSIDE MyAspect3ArgumentValueDemo Aspect 1  beforeBankAccountDeposit BEFORE deposit....");
		
		Object[] args = joinPoint.getArgs();
		
		System.out.println("Arguments passed to deposit(): ");
		for (Object arg : args) {
			System.out.println(" -> " + arg);
		}
		
		if ((Double) args[0] > 50000.0d)
			System.out.println("Ok, you are depositing more than 50K??");

	}

}
