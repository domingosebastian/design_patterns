package edu.pattern.mediator;

public class Car {

	private Telephone telephone;
	private Radio radio;
	
	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}

	public void start() {
		radio.turnOn();
		telephone.turnOffMusic();
	}
	
	public void stop() {
		radio.turnOff();
	}
	
}
