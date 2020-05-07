package edu.pattern.command;

import java.util.List;

public class MultiplePackageProcessing implements PackageProcessing {

	private List<Package> packages;

	public MultiplePackageProcessing(List<Package> packages) {
		this.packages = packages;
	}


	public boolean process() {
		// iterate over the list of shipments and treat each one
		return true; 
	}
}
