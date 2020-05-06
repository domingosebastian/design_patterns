package edu.pattern.facade;

public class CommunicationService {

	public void setPreferences (String client, CommunicationPreferences preferences) {
		DDBB.INSTANCE.setPreferences(client, preferences);
	}

}
