package edu.pattern.template;

public class TennisRegistration {

	private final Tournament tournament;
	private final SportsCenter sportCenter;
	
	public TennisRegistration(SportsCenter sportCenter) {
		this.sportCenter = sportCenter;
		this.tournament = new Tournament("tennis tournament");
	}
	
	public Tournament getTournament() {
		return tournament;
	}

	public boolean register (Request request) {
		
		if (request.getAge() < 10) {
			// children under 10 cannot sign up
			return false;
		}
		
		if (tournament.getAccepted().size() >= 4) {
			// only 4 people can participate
			return false;
		}
		
		tournament.register(request);
		
		if (tournament.getAccepted().size() == 4) {
			// full places -> we reserve sports center
			// The estimated duration of the tournament is 8 hours
			sportCenter.reserve(tournament, 8);
		}
		
		return true;
	}
	
}
