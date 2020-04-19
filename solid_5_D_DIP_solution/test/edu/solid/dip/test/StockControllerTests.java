package edu.solid.dip.test;

import org.junit.Assert;
import org.junit.Test;

import edu.solid.dip.bbdd.StockRepositoryImpl;
import edu.solid.dip.business.StockController;

public class StockControllerTests {

	@Test
	public void test_stock_control() {
		StockController controller = new StockController(new StockRepositoryImpl());
		
		Assert.assertFalse(controller.needMoreItemsInShop("north shop", "table"));
		Assert.assertTrue(controller.needMoreItemsInShop("north shop", "lamp"));

	}

}
