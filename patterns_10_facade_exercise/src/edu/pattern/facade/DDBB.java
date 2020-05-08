package edu.pattern.facade;

import java.util.HashMap;
import java.util.Map;

public enum DDBB {

	INSTANCE;
	
	private Map<String, String> emails = new HashMap<>();
    private Map<String, LoyaltyService.Type> cards = new HashMap<>();
    private Map<String, CommunicationPreferences> preferences = new HashMap<>();
	
	
	public void clear() {
		emails.clear();
		cards.clear();
		preferences.clear();
	}
	
	public void setEmail(String client, String email) {
		emails.put(client, email);
	}
	
	public String getEmail(String client) {
		return emails.get(client);
	}
	
	public void addCard (String client, LoyaltyService.Type type) {
		cards.put(client, type);
	}
	
	public LoyaltyService.Type getCard (String client) {
		return cards.get(client);
	}
	
	public void setPreferences (String client, CommunicationPreferences preference) {
		preferences.put(client, preference);
	}
	
	public CommunicationPreferences getPreferences (String client) {
		return preferences.get(client);
	}
}
