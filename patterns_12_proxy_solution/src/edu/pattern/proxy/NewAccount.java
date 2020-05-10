package edu.pattern.proxy;

public class NewAccount implements Account {
	
	private Account account;

	public NewAccount(Account account) {
		this.account = account;
	}

	@Override
	public String getClient() {
		return account.getClient();
	}

	@Override
	public int getQuantity() {
		return account.getQuantity();
	}

	@Override
	public void transfer(int amount) {
		if (account.getQuantity() + amount >= 0) {
			account.transfer(amount);
		}
	}

	
	

}
