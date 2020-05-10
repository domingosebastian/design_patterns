package edu.pattern.facade;

public class FacadeService {

	// Direct instantiation. 
	// Probably a constructor based initialization will be more suitable in most cases
	
	private ConfigurationService configuration = new ConfigurationService();
	private LoyaltyService loyalty = new LoyaltyService();
	private CommunicationService communication = new CommunicationService();

	public void registerExpress(String clientName, String clientEmail) {
		
		loyalty.createCard(clientName, LoyaltyService.Type.BASIC);
		configuration.addEmail(clientName, clientEmail);
		CommunicationPreferences preferences = new CommunicationPreferences(false, true, true);
		communication.setPreferences(clientName, preferences);
	}

}
