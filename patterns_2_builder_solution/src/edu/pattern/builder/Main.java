package edu.pattern.builder;

public class Main {

	public static void main (String[] args) {

		// this code has to compile
		
		Person mother = new Person.Builder("Mary")
                .setBirthplace("York")
                .setAdult(37)
                .setWorkplace("Google")
                .build();

		Person son = new Person.Builder("Peter")
                .setUnderAge(4)
                .setSchool("York school")
                .build();
		
		// esta codigo NO debe compilar
		/* 
		Person wrong = new Person.Builder("Luisa")
				    .setAdult(20)
				    .setSchool("York school")
				    .build();
        */
	}
}
