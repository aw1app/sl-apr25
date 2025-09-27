package com.sl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Different assertions we can use in test cases.
 */
class AssertionsDemo {

	@Test
	void test() {
		
		String str1 = null;
		
		String str2 = "some value";	
		
		
		// assertEquals(str1, str2); // fail
		
		
		assertSame(str1, str1); // pass
		//assertSame(str1, str2); // fail
		
		
		//assertNotSame(str1, str1); // fail
		assertNotSame(str1, str2); // pass
		
		
		
		int a = 4;
		int b = 0;
		
		assertTrue(a > b); // pass
		assertFalse(b > a); // pass
		
		
		
		String[] a1 = { "A", "B" };
		String[] a2 = { "A", "B" };
		
		//assertEquals(a1, a2); // fail
		
		assertArrayEquals(a1, a2); // pass
		
		//assertThrows(ArithmeticException.class,  () -> { new Calculator().divide(10, 1); } ); // fail
		assertThrows(ArithmeticException.class,  () -> { new Calculator().divide(10, 0); } ); // pass		
				
	}

}
