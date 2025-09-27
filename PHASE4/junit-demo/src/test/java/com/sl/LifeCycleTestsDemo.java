package com.sl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycleTestsDemo {
	Calculator cal;
	
	@BeforeAll
	static void myBeforeAll() {
		System.out.println(" INSIDE myBeforeAll. This method will run before starting the test cases in this class  ");
	}
	
	@AfterAll
	static void myAfterAll() {
		System.out.println(" INSIDE myAfterAll. This method will run after all test cases completed in this class  ");
	}

	@BeforeEach
	void myBeforeEach() {
		System.out.println("\t INSIDE myBeforeEach");
		 cal = new Calculator();
	}
	
	@AfterEach
	void myAfterEach() {
		System.out.println("\t INSIDE myAfterEach \n");
		 cal = null;
	}
	
	@Test
	void testSum1() {
		System.out.println("INSIDE testSum1 ");
		
		// inputs 
		int x=10, y =5;
		
		// expected output 
		int expectedResult = 15;
		
		Calculator calculator = new Calculator();
		
		int actualResult = calculator.sum(x, y);
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void testSum2() {
		System.out.println("INSIDE testSum2 ");

		
		// inputs 
		int x=0, y =5;
		
		// expected output 
		int expectedResult = 5;
		
		Calculator calculator = new Calculator();
		
		int actualResult = calculator.sum(x, y);
		
		assertEquals(expectedResult, actualResult);		
	}
	
	
}
