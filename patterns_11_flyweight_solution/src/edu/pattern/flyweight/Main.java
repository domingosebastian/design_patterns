package edu.pattern.flyweight;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n\n------ player 1 -----\n\n");
		System.out.println(new Player1().draw());
		System.out.println("\n\n------ player 2 -----\n\n");
		System.out.println(new Player2().draw());
		System.out.println("\n\n------ player 3 -----\n\n");
		System.out.println(new Player3().draw());
	}

}
