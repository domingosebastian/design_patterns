package edu.pattern.adapter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.pattern.adapter.InternationalMoneyOrganization;

public class InternationMoneyTests {

	private InternationalMoneyOrganization service;
	
	@Before
	public void init() {
		// change this null for a reference to your adapter
		service = new InternationMoneyAdapter(new LocalBankImpl());
	}
	
	@Test
	public void test_client_does_not_exists() {
		Assert.assertEquals(0,service.state("Not_exists"));
	}

	@Test
	public void test_operations_with_new_client() {
		String client = "new";
		service.transfer(100, client);
		Assert.assertEquals(100, service.state(client));
		service.transfer(-70, client);
		Assert.assertEquals(30, service.state(client));
	}
}
