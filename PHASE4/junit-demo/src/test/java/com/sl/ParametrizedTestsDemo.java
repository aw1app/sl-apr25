package com.sl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ParametrizedTestsDemo {

	@ParameterizedTest
	@CsvSource(
			{ 
				"1, 1, 2",
				"-2, 3, 1",
				"10, -5, 5",
			}
			)
	void testSum(int x, int y, int expectedResult ) {	
		
		
		Calculator calculator = new Calculator();
		
		int actualResult = calculator.sum(x, y);
		
		assertEquals(expectedResult, actualResult);
		
	}
	

}
