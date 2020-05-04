package edu.pattern.adapter;

public class InternationMoneyAdapter implements InternationalMoneyOrganization {

	// implementation that we will use to "delegate" the calls
	// This object is the one that actually does the work
	private LocalBank impl;
	
	public InternationMoneyAdapter (LocalBank impl) {
		this.impl = impl;
	}
	
	// methods that translate from InternationalMoneyOrganization API to LocalBank API 
	
	@Override
	public void transfer(int quantity, String client) {
		impl.makeTransfer(client, quantity);
	}

	@Override
	public int state(String client) {
		Integer result = impl.getCurrentState(client);
		
		// in the InternationalMoneyOrganization API the method returns 0 if
		// there is no customer data. In the LocalBank API it returned null,
		// so it is necessary to change the return value of LocalBank if it is null.		
		if (result == null) {
			return 0;
		}
		// if it is not null, the same result is correct
		return result;
	}

}
