package com.sl;

import org.springframework.stereotype.Component;

@Component
public class X {

	public void m1() {

	}

	public int doubleIt(int x) {
		System.out.println("INSIDE class X method doubleIt");
		return 2*x;
	}
	
	public int tripleIt(int x) throws Exception {
		System.out.println("INSIDE class X method tripleIt");
		
		if(x == 0) throw new Exception();
		
		return 3*x;
	}

}
