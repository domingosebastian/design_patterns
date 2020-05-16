package edu.pattern.mediator;

public class Telephone {

	private boolean musicOn = false;

	private Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void recieveCall() {
		mediator.receiveCall();
	}

	public void turnOnMusic() {
		musicOn = true;
	}
	
	public void turnOffMusic() {
		musicOn = false;
	}
	
	public boolean isMusicOn() {
		return musicOn;
	}
}
