package edu.pattern.proxy;

public class NormalAccount implements Account {

	private final String client;
	private int amount;
	
	public NormalAccount(String client) {
		this.client = client;
		this.amount = 0;
	}

	public String getClient() {
		return client;
	}

	public int getQuantity() {
		return amount;
	}

	public void transfer (int amount) {
		this.amount += amount;
	}
	
}
