package edu.pattern.template;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pattern.template.FightRegistration;
import edu.pattern.template.TennisRegistration;
import edu.pattern.template.SportsCenter;
import edu.pattern.template.Request;

public class TestTournament {
	
	private Request request_aged_9 = new Request("req 9", 9, 40);
	private Request request_aged_15_light = new Request("req 15 light", 15, 40);
	private Request request_aged_15_heavy = new Request("req 15 heavy", 15, 70);
	
	private SportsCenter sportCenter = new SportsCenter();
	private FightRegistration fight = new FightRegistration(sportCenter);
	private TennisRegistration tennis = new TennisRegistration(sportCenter);
	

	@Test
	public void test_tennis_tournament_accepted() {
		assertFalse("9 year olds cannot register",tennis.register(request_aged_9));
		assertTrue("15 year olds can register",tennis.register(request_aged_15_light));
		assertTrue("15 year olds can register",tennis.register(request_aged_15_heavy));
		assertEquals("both accepted", 2, tennis.getTournament().getAccepted().size());
	}
	
	@Test
	public void test_fight_tournament_accepted() {
		assertFalse("9 year olds cannot register",fight.register(request_aged_9));
		assertFalse("15 year olds that are not heavy enough cannot register",fight.register(request_aged_15_light));
		assertTrue("15 year olds that are heavy enough cannot register",fight.register(request_aged_15_heavy));
		assertEquals("one accepted", 1, fight.getTournament().getAccepted().size());
	}

	
	@Test
	public void test_tennis_tournament_limit() {
		for (int i = 0; i < 4; i++) {
			assertTrue("request " + (i+1), tennis.register(new Request("participant " + 1, 15, 60)));
		}
		
		assertFalse("there are already 4 signed-up", tennis.register(request_aged_15_light));
		
		Integer reservedHours = sportCenter.getReservations().get(tennis.getTournament());
		
		assertNotNull("there is a reservation", reservedHours);
		assertEquals("the reservation is for 8 hours", 8, reservedHours.intValue());
	}

	
	@Test
	public void test_fight_tournament_limit () {
		for (int i = 0; i < 6; i++) {
			assertTrue("request " + (i+1), fight.register(new Request("participant " + 1, 15, 70)));
		}
		
		assertFalse("there are already 6 signed", fight.register(request_aged_15_heavy));
		
		Integer reservedHours = sportCenter.getReservations().get(fight.getTournament());
		
		assertNotNull("there is a reservation", reservedHours);
		assertEquals("the reservation is for 4 hours", 4, reservedHours.intValue());
	}

}
