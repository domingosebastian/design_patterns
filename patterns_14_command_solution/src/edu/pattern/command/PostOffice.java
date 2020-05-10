package edu.pattern.command;

public class PostOffice {

	
	public void receive (PackageProcessing thePackage) {
		System.out.println("registering the shipment");
		
        boolean ok = thePackage.process(); 
        
		System.out.println("registration " + ok);
	}
	
}
