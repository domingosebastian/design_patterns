package edu.pattern.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pattern.abstractfactory.Questions;
import edu.pattern.abstractfactory.QuestionsEn;
import edu.pattern.abstractfactory.QuestionsEs;
import edu.pattern.abstractfactory.Greetings;
import edu.pattern.abstractfactory.GreetingsEn;
import edu.pattern.abstractfactory.GreetingsEs;

public class TestMultilingual {

	@Test
	public void test_es() {
		Questions preguntas = new QuestionsEs();
		
		assertEquals("¿qué hora es?", preguntas.askTime() );
		assertEquals("¿qué tiempo hace?", preguntas.askWeather() );
		
		Greetings saludos = new GreetingsEs();
		
		assertEquals("buenos días", saludos.goodMorning());
		assertEquals("buenas tardes", saludos.goodAfternoon());
	}
	
	@Test
	public void test_en() {
		Questions preguntas = new QuestionsEn();
		
		assertEquals("what time is it?", preguntas.askTime() );
		assertEquals("how is the weather?", preguntas.askWeather() );
		
		Greetings saludos = new GreetingsEn();
		
		assertEquals("good morning", saludos.goodMorning());
		assertEquals("good afternoon", saludos.goodAfternoon());
	}

}
