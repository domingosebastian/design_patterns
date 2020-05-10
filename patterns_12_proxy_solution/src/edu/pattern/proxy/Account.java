package edu.pattern.proxy;

public interface Account {

	String getClient();

	int getQuantity();

	void transfer(int amount);

}