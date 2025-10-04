package com.sl.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    
	
    @Before("execution(* com.sl.BankAccount.withdraw(..))")
	public void withdrawAspect() {		
		System.out.println("INSIDE withdrawAspect  Initiating withdrawl ....");		
	}
    
    @Before("execution(* com.sl.BankAccount.*(..))")
	public void bankAcctAspect() {		
		System.out.println("INSIDE bankAcctAspect  ....");		
	}

}
