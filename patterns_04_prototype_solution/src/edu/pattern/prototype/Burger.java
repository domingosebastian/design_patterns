package edu.pattern.prototype;

import java.util.Arrays;
import java.util.List;

public class Burger {

	public enum Meat { BEEF, CHICKEN }
	public enum Size { MEDIUM, LARGE, EXTRA_LARGE }
	public enum Extra { ONIONS, CHEESE, MAYONNAISE, PICKLES, EGG }
	public enum Bread { NORMAL, WITH_SEEDS }
	
	private final Meat meat;
	private final Size size;
	private final Bread bread;
	private final List<Extra> extras;
	
	// --- general constructtor
	
	public Burger(Meat meat, Size size, Bread bread, Extra ... extras) {
		this.meat = meat;
		this.size = size;
		this.bread = bread;
		this.extras = Arrays.asList(extras);
	}

	// -- getters
	
	
	public Meat getMeat() {
		return meat;
	}

	public Size getSize() {
		return size;
	}

	public Bread getBread() {
		return bread;
	}

	public List<Extra> getExtras() {
		return extras;
	}

}
