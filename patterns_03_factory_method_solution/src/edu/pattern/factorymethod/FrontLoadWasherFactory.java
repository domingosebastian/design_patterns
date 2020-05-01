package edu.pattern.factorymethod;

public class FrontLoadWasherFactory extends WasherFactory {

	@Override
	protected Washer createWasher() {
		return new FrontLoadWasher();
	}

}
