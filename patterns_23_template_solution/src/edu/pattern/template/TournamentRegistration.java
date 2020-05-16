package edu.pattern.template;

public  abstract class TournamentRegistration {

	protected final Tournament tournament;

	public TournamentRegistration(Tournament tournament) {
		this.tournament = tournament;
	}

	public Tournament getTournament() {
		return tournament;
	}
	
	public boolean register (Request request) {
		
		if (! canRegister(request)) {
			return false;
		}
		
		if (tournament.getAccepted().size() >= getNumberOfParticipants()) {
			return false;
		}

		tournament.register(request);
		
		if (tournament.getAccepted().size() == getNumberOfParticipants()) {
			closeTournament();
		}

		return true;
	}
	
	
	protected abstract boolean canRegister (Request request);
	
	protected abstract int getNumberOfParticipants();
	
	protected abstract void closeTournament();

}
