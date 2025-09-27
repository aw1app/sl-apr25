package com.sl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		
		// inputs 
		int x=10, y =5;
		
		// expected output 
		int expectedResult = 15;
		
		Calculator calculator = new Calculator();
		
		int actualResult = calculator.sum(x, y);
		
		assertEquals(expectedResult, actualResult);
		
	}

}
