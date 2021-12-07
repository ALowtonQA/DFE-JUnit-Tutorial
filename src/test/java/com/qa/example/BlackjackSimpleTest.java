package com.qa.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackjackSimpleTest {

	@Test
	public void dealerBustTest() {
		assertEquals(21, BlackjackSimple.play(22, 21));
	}
	
	@Test
	public void playerBustTest() {
		assertEquals(21, BlackjackSimple.play(21, 22));
	}
	
	@Test
	public void bothBustTest() {
		assertEquals(0, BlackjackSimple.play(22, 22));
	}
	
	@Test
	public void higherValueWinsTest() {
		assertEquals(18, BlackjackSimple.play(18, 17));
	}
	
}
