package edu.pattern.mediator;


public class Mediator {
	private Telephone telephone;
	private Car car;
	private Radio radio;
	
	public Mediator(Telephone telephone, Car car, Radio radio) {
		this.telephone = telefono;
		this.car = car;
		this.radio = radio;
		this.telephone.setMediator(this);
		this.car.setMediator(this);
		this.radio.setMediator(this);
	}

	public void startCar() {
		radio.turnOn();
		telephone.turnOffMusic();
	}

	public void stopCar() {
		radio.turnOff();;
	}

	public void turnOnRadio() {
		telephone.turnOffMusic();
	}

	public void turnOffRadio() {
		// nothing
	}

	public void receiveCall() {
		radio.turnOff();
	}

}
