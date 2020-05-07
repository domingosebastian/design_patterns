package edu.pattern.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pattern.proxy.Account;
import edu.pattern.proxy.NormalAccount;

public class TestAccounts {

	/**
	 * This test should not be modified. It already works and 
	 * should continue to do so
	 */
	@Test
	public void test_normal_account() {
		Account normalAccount = new NormalAccount("client");
		assertEquals("client", normalAccount.getClient());
		assertEquals(0, normalAccount.getQuantity());

		normalAccount.transfer(10);
		assertEquals(10, normalAccount.getQuantity());

		normalAccount.transfer(-20);
		assertEquals(-10, normalAccount.getQuantity());
	}

	/**
	 * Modify the assignment using the new Account type
	 */
	@Test
	public void test_new_account() {
		Account newAccount = new NormalAccount("client"); // change it !
		assertEquals("client", newAccount.getClient());
		assertEquals(0, newAccount.getQuantity());

		newAccount.transfer(10);
		assertEquals(10, newAccount.getQuantity());

		// this operation should not be carried out
		newAccount.transfer(-20);
		assertEquals(10, newAccount.getQuantity());
	}

	
}
