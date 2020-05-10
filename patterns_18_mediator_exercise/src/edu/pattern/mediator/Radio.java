package edu.pattern.mediator;

public class Radio {

	private boolean on = false;
	private Telephone telephone;
	
	public void setTelefono(Telephone telephone) {
		this.telephone = telephone;
	}

	public void turnOn() {
		on = true; 
		telephone.turnOffMusic();
	}
	
	public void turnOff() {
		on = false; 
	}
	
	public boolean isOn() {
		return on;
	}
}
