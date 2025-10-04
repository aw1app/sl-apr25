package com.sl.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect2 {

	// Aspect 1
	@Around("execution(* com.sl.BankAccount.deposit(..))")
	public void aroundBankAccountDeposit(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("INSIDE MyAspect2 Aspect 1  aroundBankAccountDeposit BEFORE deposit....");
		
		pjp.proceed();
		
		System.out.println("INSIDE MyAspect2 Aspect 1  aroundBankAccountDeposit AFTER deposit....");
	}

	// Aspect 2
	@AfterThrowing("execution(* com.sl.*.tripleIt(..))")
	public void afterThrowingXTripleIt() {
		System.out.println("INSIDE MyAspect2 Aspect 2  afterThrowingXTripleIt ....");
	}
	

}
