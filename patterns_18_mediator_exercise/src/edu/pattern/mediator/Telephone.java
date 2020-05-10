package edu.pattern.mediator;

public class Telephone {

	private boolean musicOn = false;
	private Radio radio;
	
	public void setRadio(Radio radio) {
		this.radio = radio;
	}

	public void recieveCall() {
		radio.turnOff();
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
