package edu.pattern.pattern;

public class Person {

	private String name;
	private int age;
	private String birthplace;
	private String school;
	private String workplace;
	
	private Person() {}
	
	
	public static class Builder {
		private Person person;
		
		public Builder(String name) {
			person = new Person();
			person.name = name;
		}
		
		public Builder setBirthplace (String birthplace) {
			person.birthplace = birthplace;
			return this;
		}
		
		public Builder setAdult(int age, String workplace) {
			if (age < 18) throw new IllegalArgumentException("is under age " + age);
			person.age = age;
			person.workplace = workplace;
			person.school = null;
			return this;
		}
		
		public Builder setUnderAge(int age, String school) {
			if (age >= 18) throw new IllegalArgumentException("is adult " + age);
			person.age = age;
			person.school = school;
			person.workplace = null;
			return this;
		}
	
		public Person build() {
			return person;
		}

	}
	
}
