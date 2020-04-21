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
		
		Questions preguntas = abstractFactory.getQuestions();
		
		assertEquals("¿qué hora es?", preguntas.askTime() );
		assertEquals("¿qué tiempo hace?", preguntas.askWeather() );
		
		Greetings saludos = abstractFactory.getGreetings();
		
		assertEquals("buenos días", saludos.goodMorning());
		assertEquals("buenas tardes", saludos.goodAfternoon());
	}
	
	@Test
	public void test_en() {
		
		// single decision point
		MessagesAbstractFactory abstractFactory = new MessagesEnFactory();

		Questions preguntas = abstractFactory.getQuestions();
		
		assertEquals("what time is it?", preguntas.askTime() );
		assertEquals("how is the weather?", preguntas.askWeather() );
		
		Greetings saludos = abstractFactory.getGreetings();
		
		assertEquals("good morning", saludos.goodMorning());
		assertEquals("good afternoon", saludos.goodAfternoon());
	}

}
