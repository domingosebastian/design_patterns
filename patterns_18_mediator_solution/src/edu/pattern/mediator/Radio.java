package edu.pattern.mediator;

public class Radio {

	private boolean on = false;
	private Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	public void turnOn() {
		on = true; 
		mediator.turnOnRadio();;
	}
	
	public void turnOff() {
		on = false; 
		mediator.turnOffRadio();
	}
	
	public boolean isOn() {
		return on;
	}
}
