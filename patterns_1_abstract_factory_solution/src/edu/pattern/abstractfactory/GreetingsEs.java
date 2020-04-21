package edu.pattern.abstractfactory;

public class GreetingsEs implements Greetings {

	@Override
	public String goodMorning() {
		return "buenos días";
	}

	@Override
	public String goodAfternoon() {
		return "buenas tardes";
	}

}
