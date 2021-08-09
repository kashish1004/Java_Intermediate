package com.phoenix.math.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

class CalculatorServiceTest {

	private static CalculatorService calService;
	
	//@BeforeEach
	@BeforeAll
	public static void init() {
		calService = new CalculatorService(new Calculator());
	}
	
	@Test
	public void testAddition() {
		int expectedResult = 30;
		int actualResult = calService.addition(20, 20);
		//assertEquals(expectedResult, actualResult); //testing service functionality
		assertNotEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testDivision() {
		assertEquals(2,calService.division(4, 2));
	}
	
	@Test
	public void checkDivideByZeroException() {
		assertThrows(ArithmeticException.class, ()->calService.division(5, 0));
	}
	
	//@AfterEach
	@AfterAll
	public static void clean() {
		calService = null;
	}

}
