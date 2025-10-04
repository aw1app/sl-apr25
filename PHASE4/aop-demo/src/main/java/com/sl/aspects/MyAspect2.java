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
	@AfterThrowing(pointcut="execution(* com.sl.*.tripleIt(..))", throwing = "ex")
	public void afterThrowingXTripleIt(Exception ex) {
		System.out.println("INSIDE MyAspect2 Aspect 2  afterThrowingXTripleIt ...." + ex.getMessage());
	}
	

}
