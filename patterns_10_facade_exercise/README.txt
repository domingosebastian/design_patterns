Hemos creado un sistema para nuestra empresa que esta siendo todo un exito.

Entre otras muchas cosas, permite que los clientes se registren en nuestra web, indicando
su email, establezcan  preferencias para los emails, obtengan un tipo de tarjeta etc etc

El problema es que, aunque se permita mucha flexibilidad, la mayoria de clientes opta
por una configuracion tipica:
- proporcionar solo nombre e email
- hacer una subscripcion al email semanal (NO recibir el email diario)
- recibir los emails en formato HTML
- hacerse la tarjeta tipo BASICA

Y claro, el codigo para esta configuracion basica queda muy "pesado".

		ConfigurationService configuration = new ConfigurationService();
		LoyaltyService loyalty = new LoyaltyService();
		CommunicationService communication = new CommunicationService();

		loyalty.createCard(clientName, LoyaltyService.Type.BASIC);
		configuration.addEmail(clientName, clientEmail);
		CommunicationPreferences preferences = new CommunicationPreferences(false, true, true);
		communication.setPreferences(clientName, preferences);


Podeis ver este codigo en el TestFacade. Fijaos en que las unicas partes "variables" del codigo
anterior son clientName e clientEmail.

Para eso se propone introducir un "facade" que simplifique este caso tan habitual.

Cread el facade en una nueva clase que ofrezca un metodo tipo "registroExpres" con solo dos
parametros, nombre e email. Este metodo debera realizar la inscripcion tipica mostrada antes.

Hecho esto, modificad el metodo facade_test() de TestFacade para que use vuestra nueva clase.

Comprobad que todo funciona bien ejecutando JUnit.

Este ejercicio es muy facil: mucho copy-paste. Aprovechad para observar un ejemplo mas de su
uso !