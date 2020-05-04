package edu.pattern.prototype;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pattern.prototype.Burger;
import edu.pattern.prototype.BurgerFactory;
import edu.pattern.prototype.Burger.Meat;
import edu.pattern.prototype.Burger.Extra;
import edu.pattern.prototype.Burger.Bread;
import edu.pattern.prototype.Burger.Size;

public class TestBurgerFactory {

	@Test
	public void test_menu() {
		Burger royal = BurgerFactory.royal();

		assertEquals(Meat.BEEF, royal.getMeat());
		assertEquals(Size.LARGE, royal.getSize());
		assertEquals(Bread.NORMAL, royal.getBread());
		assertTrue(royal.getExtras().contains(Extra.ONIONS));
		assertTrue(royal.getExtras().contains(Extra.CHEESE));
		assertFalse(royal.getExtras().contains(Extra.PICKLES));
		assertFalse(royal.getExtras().contains(Extra.MAYONNAISE));
	}

	@Test
	public void test_royal_without_onions() {
		// we want to simplify ordering this burger !!
		
		// using "from" method is easier to create the royal without onions 
		Burger royalWithoutOnions = BurgerFactory.from(BurgerFactory.royal())
				                              .removeExtra(Extra.ONIONS)
				                              .create();

		assertEquals(Meat.BEEF, royalWithoutOnions.getMeat());
		assertEquals(Size.LARGE, royalWithoutOnions.getSize());
		assertEquals(Bread.NORMAL, royalWithoutOnions.getBread());
		assertFalse(royalWithoutOnions.getExtras().contains(Extra.ONIONS));
		assertTrue(royalWithoutOnions.getExtras().contains(Extra.CHEESE));
		assertFalse(royalWithoutOnions.getExtras().contains(Extra.PICKLES));
		assertFalse(royalWithoutOnions.getExtras().contains(Extra.MAYONNAISE));
		
	}
}
