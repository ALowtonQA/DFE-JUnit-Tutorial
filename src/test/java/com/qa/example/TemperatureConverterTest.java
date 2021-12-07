package com.qa.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TemperatureConverterTest {

	TemperatureConverter tempConverter = new TemperatureConverter();
	
	@Test
	public void convertFahrenheitToCelsiusTest() {
		// assertEquals(Expected, Actual, Delta)
		assertEquals(15.556, tempConverter.convertFahrenheitToCelsius(60), 0.001);
	}
	
}
