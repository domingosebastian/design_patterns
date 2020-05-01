package edu.pattern.adapter;

public interface LocalBank {

	void makeTransfer (String client, int quantity);
	
	Integer getCurrentState (String client);
}
