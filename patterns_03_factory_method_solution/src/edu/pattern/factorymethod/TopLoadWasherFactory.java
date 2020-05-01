package edu.pattern.factorymethod;

public class TopLoadWasherFactory extends WasherFactory {

	@Override
	protected Washer createWasher() {
		return new TopLoadWasher();
	}

}
