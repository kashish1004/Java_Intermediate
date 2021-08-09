package com.phoenix.math.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

public class CalculatorServiceTest {

	private static CalculatorService calciService;
	
	/*
	 * @Before public void init() { calciService = new CalculatorService(new
	 * Calculator()); }
	 */
	
	@BeforeClass
	public static void initall() {
		calciService = new CalculatorService(new Calculator());
	}
	
	@Test
	public void testAddition() {
		assertEquals(30, calciService.addition(10, 20));
	}
	
	@Test
	public void testDivision() {
		assertEquals(3, calciService.division(6, 2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void checkDivideByZeroException() {
		assertEquals(3, calciService.division(6, 0));
	}
	
	/*
	 * @After public void cleanup() { calciService = null; }
	 */
	
	@AfterClass
	public static void cleanupAll() {
		calciService = null;
	}

}
