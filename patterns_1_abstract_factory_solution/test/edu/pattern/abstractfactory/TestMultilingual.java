package edu.pattern.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pattern.abstractfactory.Questions;
import edu.pattern.abstractfactory.Greetings;

public class TestMultilingual {

	@Test
	public void test_es() {
		
		// single decision point
		MessagesAbstractFactory abstractFactory = new MessagesEsFactory();
		
		Questions questions = abstractFactory.getQuestions();
		
		assertEquals("¿qué hora es?", questions.askTime() );
		assertEquals("¿qué tiempo hace?", questions.askWeather() );
		
		Greetings greetings = abstractFactory.getGreetings();
		
		assertEquals("buenos días", greetings.goodMorning());
		assertEquals("buenas tardes", greetings.goodAfternoon());
	}
	
	@Test
	public void test_en() {
		
		// single decision point
		MessagesAbstractFactory abstractFactory = new MessagesEnFactory();

		Questions questions = abstractFactory.getQuestions();
		
		assertEquals("what time is it?", questions.askTime() );
		assertEquals("how is the weather?", questions.askWeather() );
		
		Greetings greetings = abstractFactory.getGreetings();
		
		assertEquals("good morning", greetings.goodMorning());
		assertEquals("good afternoon", greetings.goodAfternoon());
	}

}
