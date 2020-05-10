package edu.pattern.facade;

public class LoyaltyService {

	public enum Type { BASIC, PREMIUM, VIP }
	
	public void createCard(String client, Type type) {
		DDBB.INSTANCE.addCard(client, type);
	}

}
