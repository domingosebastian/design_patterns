package edu.pattern.mediator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.pattern.mediator.Car;
import edu.pattern.mediator.Radio;
import edu.pattern.mediator.Telephone;

public class TestSystem {

	private Radio radio;
	private Telephone telephone;
	private Car car;
	
	@Before
	public void init() {
		radio = new Radio();
		telephone = new Telephone();
		car = new Car();
		radio.setTelefono(telephone);
		telephone.setRadio(radio);
		car.setRadio(radio);
		car.setTelephone(telephone);
	}
	
	@Test
	public void test_start_stop_car() {
		assertFalse(radio.isOn());
		assertFalse(telephone.isMusicOn());
		
		telephone.turnOnMusic();
		assertTrue(telephone.isMusicOn());
		
		car.start();
		
		assertTrue(radio.isOn());
		assertFalse(telephone.isMusicOn());
	
		car.stop();
		assertFalse(radio.isOn());
	}

	@Test
	public void test_receive_phone_call() {
		radio.turnOn();
		assertTrue(radio.isOn());
		
		telephone.recieveCall();
		
		assertFalse(radio.isOn());
	}
	
	@Test
	public void test_turn_on_the_radio() {
		
		telephone.turnOnMusic();
		assertTrue(telephone.isMusicOn());
		
		radio.turnOn();
		
		assertFalse(telephone.isMusicOn());
	}
}
