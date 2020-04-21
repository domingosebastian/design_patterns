package edu.pattern.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pattern.factorymethod.Washer;
import edu.pattern.factorymethod.FrontLoadWasher;
import edu.pattern.factorymethod.TopLoadWasher;

public class TestWasher {

	@Test
	public void test_front_loading() {
		
		Washer washwer = new FrontLoadWasher();
		washwer.putControls();
		washwer.putDrum();
		
		assertEquals("front load", washwer.type);
		assertTrue(washwer.hasControls);
		assertTrue(washwer.hasDrum);
	}

	@Test
	public void test_top_loading() {
		
		Washer whasher = new TopLoadWasher();
		whasher.putControls();
		whasher.putDrum();
		
		assertEquals("top load", whasher.type);
		assertTrue(whasher.hasControls);
		assertTrue(whasher.hasDrum);
	}

}
