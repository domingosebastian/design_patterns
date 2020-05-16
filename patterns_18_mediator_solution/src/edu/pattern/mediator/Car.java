package edu.pattern.mediator;

public class Car {

	private Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void start() {
		mediator.startCar();;
	}
	
	public void stop() {
		mediator.stopCar();
	}
	
}
