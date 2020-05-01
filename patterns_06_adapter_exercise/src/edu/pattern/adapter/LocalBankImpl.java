package edu.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

public class LocalBankImpl implements LocalBank {

	private final Map<String, Integer> clientsDataBase = new HashMap<>();
	
	@Override
	public void makeTransfer(String client, int quantity) {
		Integer currentState = getCurrentState(client);
		if (currentState == null) {
			currentState = 0;
		} 
     	clientsDataBase.put(client,  currentState + quantity);
	}

	@Override
	public Integer getCurrentState(String client) {
		return clientsDataBase.get(client);
	}

}
