package edu.pattern.facade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.pattern.facade.DDBB;
import edu.pattern.facade.CommunicationPreferences;
import edu.pattern.facade.CommunicationService;
import edu.pattern.facade.ConfigurationService;
import edu.pattern.facade.LoyaltyService;

public class TestFacade {

	private String clientName = "Lucy";
	private String clientEmail = "lucy@email.com";
	
	@Before
	public void init() {
		DDBB.INSTANCE.clear();
	}
	
	@Test
	public void original_test() {

		// Code to register a client with the typical configuration
		
		ConfigurationService configuration = new ConfigurationService();
		LoyaltyService loyalty = new LoyaltyService();
		CommunicationService communication = new CommunicationService();

		loyalty.createCard(clientName, LoyaltyService.Type.BASIC);
		configuration.addEmail(clientName, clientEmail);
		CommunicationPreferences preferences = new CommunicationPreferences(false, true, true);
		communication.setPreferences(clientName, preferences);
		
		// checks the registration
		checkRegistration();
	}
	
	@Test
	public void facade_test() {
		// use your facade service here to register a user
		// with the particular data clientName and clientEmail
		
		// leave this method invocation to check the behavior of your facade
		checkRegistration();
	}

	private void checkRegistration() {
		assertEquals(DDBB.INSTANCE.getCard(clientName), LoyaltyService.Type.BASIC);
		assertEquals(DDBB.INSTANCE.getEmail(clientName), clientEmail);
		CommunicationPreferences preferences = DDBB.INSTANCE.getPreferences(clientName);
		assertNotNull(preferences);
		assertFalse("does not receive daily email", preferences.isDailyEmail());
		assertTrue("receive weekly email", preferences.isWeeklyEmail());
		assertTrue("receive html email", preferences.isHtmlEmail());
	}

}
