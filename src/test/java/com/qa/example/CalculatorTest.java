package com.qa.example;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();

	@Test
	public void addTest() {
		// assertEquals(Expected, Actual)
		assertEquals(10, calc.add(5, 5));
	}
	
	@Test
	public void subTest() {
		// assertEquals(Expected, Actual)
		assertEquals(5, calc.subtract(10, 5));
	}
	
	@Test
	public void conditionalCalcTrueTest() {
		assertEquals(12, calc.conditionalCalc(10, 2, true));
	}
	
	@Test
	public void conditionalCalcFalseTest() {
		assertEquals(8, calc.conditionalCalc(10, 2, false));
	}
}
