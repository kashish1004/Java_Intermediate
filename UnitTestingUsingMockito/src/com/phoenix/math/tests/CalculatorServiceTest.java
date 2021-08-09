package com.phoenix.math.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

	@Mock
	private CalculatorService calciService;
	
	@InjectMocks
	private Calculator calculator;
	
	@Before
	public void initService() {
		//creating mock object of CalculatorService
		//calciService = Mockito.mock(CalculatorService.class);
		//calciService = Mockito.spy(CalculatorService.class);
		//creating partial mock wrapper over real object of CalculatorService 
		//calciService = Mockito.spy(new CalculatorService(new Calculator()));
		
	}
	
	@Test
	public void testAddition() {
		//mock behaviour of mock object
		Mockito.when(calciService.addition(100, 200)).thenReturn(300);
		
		//Creating spy behaviour on real method
		//Mockito.when(calciService.addition(10, 20)).thenCallRealMethod();
		
		assertEquals(300, calciService.addition(100, 200));
	}

}
