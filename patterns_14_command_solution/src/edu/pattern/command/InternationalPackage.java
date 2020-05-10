package edu.pattern.command;

public class InternationalPackage implements Package {

	private String destination;
	private int weight;
	
	public InternationalPackage(String destination, int weight) {
		this.destination = destination;
		this.weight = weight;
	}

	public int weight() {
		return weight;
	}

	public String getDestination() {
		return destination;
	}

}
