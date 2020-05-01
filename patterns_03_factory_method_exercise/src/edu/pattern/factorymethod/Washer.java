package edu.pattern.factorymethod;

public abstract class Washer {

	protected boolean hasDrum;
	protected boolean hasControls;
	protected String  type;
	
	public void putDrum() {
		hasDrum = true;
	}
	
	public void putControls() {
		hasControls = true;
	}

}
