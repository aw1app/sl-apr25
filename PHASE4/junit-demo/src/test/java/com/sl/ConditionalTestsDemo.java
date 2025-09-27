package com.sl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionalTestsDemo {

	@Test
	@EnabledOnOs(value =  {OS.WINDOWS} )
	public void testSumOnWindows() {

		System.out.println("INSIDE testAddOnWindows");

		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.sum(x, y));
	}
	
	@Test
	@EnabledOnOs(value =  {OS.MAC} )
	public void testSumOnMac() {

		System.out.println("INSIDE testSumOnMac");

		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.sum(x, y));
	}
	
	
	@Test
	@EnabledForJreRange(min =  JRE.JAVA_11, max = JRE.JAVA_17 )
	public void testSumOnJRERange() {

		System.out.println("INSIDE testSumOnJRERange");

		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.sum(x, y));
	}
	
	
	@Test
	@Disabled
	public void testSum100() {

		System.out.println("INSIDE testSum100");

		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.sum(x, y));
	}
	
}
