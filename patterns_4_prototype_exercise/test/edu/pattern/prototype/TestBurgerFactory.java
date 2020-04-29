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

		assertEquals(Meat.BEAF, royal.getMeat());
		assertEquals(Size.LARGE, royal.getSize());
		assertEquals(Bread.NORMAL, royal.getBread());
		assertTrue(royal.getExtras().contains(Extra.ONION));
		assertTrue(royal.getExtras().contains(Extra.CHEESE));
		assertFalse(royal.getExtras().contains(Extra.CUCUMBER));
		assertFalse(royal.getExtras().contains(Extra.MAYONNAISE));
	}

	@Test
	public void test_royal_si_cebolla() {
		// we want to simplify ordering this burger !!
		
		Burger royalWithoutOnion = new BurgerFactory()
				                              .setMeat(Meat.BEAF)
				                              .setSize(Size.LARGE)
				                              .setBread(Bread.NORMAL)
				                              .addExtra(Extra.CHEESE)
				                              .create();

		assertEquals(Meat.BEAF, royalWithoutOnion.getMeat());
		assertEquals(Size.LARGE, royalWithoutOnion.getSize());
		assertEquals(Bread.NORMAL, royalWithoutOnion.getBread());
		assertFalse(royalWithoutOnion.getExtras().contains(Extra.ONION));
		assertTrue(royalWithoutOnion.getExtras().contains(Extra.CHEESE));
		assertFalse(royalWithoutOnion.getExtras().contains(Extra.CUCUMBER));
		assertFalse(royalWithoutOnion.getExtras().contains(Extra.MAYONNAISE));
		
	}
}
