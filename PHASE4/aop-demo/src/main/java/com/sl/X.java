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

}
