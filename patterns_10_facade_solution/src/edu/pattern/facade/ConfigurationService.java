package edu.pattern.facade;


public class ConfigurationService {

	public void addEmail(String client, String email) {
		DDBB.INSTANCE.setEmail(client, email);
	}

	
}
