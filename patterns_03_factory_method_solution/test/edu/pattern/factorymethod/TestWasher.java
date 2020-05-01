package edu.pattern.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pattern.factorymethod.Washer;

public class TestWasher {

	@Test
	public void test_front_loading() {
		
		WasherFactory factory = new FrontLoadWasherFactory();
		
		Washer washwer = factory.create();
		
		assertEquals("front load", washwer.type);
		assertTrue(washwer.hasControls);
		assertTrue(washwer.hasDrum);
	}

	@Test
	public void test_top_loading() {
		
		WasherFactory factory = new TopLoadWasherFactory();

		Washer whasher = factory.create();
		
		assertEquals("top load", whasher.type);
		assertTrue(whasher.hasControls);
		assertTrue(whasher.hasDrum);
	}

}
