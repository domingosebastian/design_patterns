package edu.pattern.facade;

public class CommunicationPreferences {

	private final boolean dailyEmail;
	private final boolean weeklyEmail;
	private final boolean htmlEmail;
	
	public CommunicationPreferences(boolean dailyEmail, boolean weeklyEmail, boolean htmlEmail) {
		this.dailyEmail = dailyEmail;
		this.weeklyEmail = weeklyEmail;
		this.htmlEmail = htmlEmail;
	}

	public boolean isDailyEmail() {
		return dailyEmail;
	}

	public boolean isWeeklyEmail() {
		return weeklyEmail;
	}

	public boolean isHtmlEmail() {
		return htmlEmail;
	}
	
}
