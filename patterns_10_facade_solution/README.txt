We've created a system for our company which turns out to be a great success!

Among many other things, it allows clients to register on our website, indicating
their email address, establishing email preferences, obtain a type of loyalty card etc. etc.

The problem is that although a lot of flexibility is allowed, most clients choose
for a typical configuration:
- provide only name and email
- subscribe to the weekly email (NOT the daily email)
- receive emails in HTML format
- take the BASIC card

And of course, the code for this basic configuration is very "heavy".

		ConfigurationService configuration = new ConfigurationService ();
		LoyaltyService loyalty = new LoyaltyService ();
		CommunicationService communication = new CommunicationService ();

		loyalty.createCard (clientName, LoyaltyService.Type.BASIC);
		configuration.addEmail (clientName, clientEmail);
		CommunicationPreferences preferences = new CommunicationPreferences (false, true, true);
		communication.setPreferences (clientName, preferences);


You can see this code in the TestFacade. Notice that the only "variable" parts of the code
above are clientName and clientEmail.

For this, it is proposed to introduce a "facade" to simplify this typical configuration.

Create the facade in a new class that offers a method "registerExpress" with only two
parameters, name and email. This method should perform the typical registration shown above.

After that, modify the facade_test () method of TestFacade to use your new class.

Check that everything works well by running JUnit.

This exercise is very easy: lots of copying and pasting. Take the opportunity to observe some more example of this
use if you can!
