package edu.pattern.template;

public class FightRegistration {

	private final Tournament tournament;
	private final SportsCenter sportCenter;

	public FightRegistration(SportsCenter sportscenter) {
		this.sportCenter = sportscenter;
		this.tournament = new Tournament("Fight Tournament");
	}
	
	public Tournament getTournament() {
		return tournament;
	}

	public boolean register (Request request) {
		
		if (request.getAge() < 15) {
			// children under 15 cannot sign up
			return false;
		}
		
		if (request.getWeight() < 60) {
			// minimum weight, 60 kilos
			return false;
		}
		
		if (tournament.getAccepted().size() >= 6) {
			// only 6 people can participate
			return false;
		}
		
		tournament.register(request);
	
		
		if (tournament.getAccepted().size() == 6) {
			// places sold out -> we reserve sports center
			// The estimated time of the tournament is 4 hours
			sportCenter.reserve(tournament, 4);
		}

		return true;
	}

}
