package edu.pattern.factorymethod;

// base class that the client will use to create any type of washer
public abstract class WasherFactory {

	public Washer create() {
		
		// steps common to all types of washing machines
		Washer washer = createWasher();
		
		washer.putControls();
		washer.putDrum();
		
		return washer;
	}


	// Specific construction process of each type of washing machine
	// Allows the returned type to be a subtype of Washer
	// (and therefore, invokes to the create () method return different types of washers)
   protected abstract Washer createWasher();
}
