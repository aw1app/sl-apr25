package com.sl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum1() {
		
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
		
		// inputs 
		int x=0, y =5;
		
		// expected output 
		int expectedResult = 5;
		
		Calculator calculator = new Calculator();
		
		int actualResult = calculator.sum(x, y);
		
		assertEquals(expectedResult, actualResult);		
	}
	
	@Test
	void testSum3() {
		
		// inputs 
		int x=-1, y =5;
		
		// expected output 
		int expectedResult = 4;
		
		Calculator calculator = new Calculator();
		
		int actualResult = calculator.sum(x, y);
		
		assertEquals(expectedResult, actualResult);		
	}


}
