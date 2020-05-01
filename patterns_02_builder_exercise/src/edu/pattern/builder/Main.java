package edu.pattern.builder;

public class Main {

	public static void main (String[] args) {

		// this code must compile
		/* 
		Person mother = new Person.Builder("Mary")
                .setBirthplace("York")
                .setAdult(37)
                .setWorkplace("Google")
                .build();

		Person son = new Person.Builder("Peter")
                .setUnderAge(4)
                .setSchool("York school")
                .build();
		*/
		// this code must NOT compile
		/* 
		Person wrong = new Person.Builder("Luisa")
				    .setAdult(20)
				    .setSchool("York school")
				    .build();
        */
	}
}
