package edu.pattern.command;

public class DangerousPackageProcessing implements PackageProcessing {

	private DangerousPackage thePackage;

	public DangerousPackageProcessing(DangerousPackage thePackage) {
		this.thePackage = thePackage;
	}


	public boolean process() {
		//  process the shipment according to the instructions
		return true; // hopefully true ... :-( 
	}
}
