package edu.pattern.adapter;

public interface InternationalMoneyOrganization {

	void transfer (int quantity, String client);
	
	/** should return 0 if client does not exists */
	int state (String client);

}
