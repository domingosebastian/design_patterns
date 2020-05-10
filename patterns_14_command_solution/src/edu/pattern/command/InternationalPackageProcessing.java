package edu.pattern.command;


//new Command this time to handle international orders
public class InternationalPackageProcessing implements PackageProcessing {

	private InternationalPackage thePackage;

	public InternationalPackageProcessing ( InternationalPackage thePackage ) {
		this.thePackage = thePackage;
	}


	// in our case the implementation is trivial, but in a more realistic case we would take advantage
	// to have isolated in this method all the treatment required by the associated order.
	public boolean process() {
		return !"Mordor".equals(thePackage.getDestination());
	}

}
