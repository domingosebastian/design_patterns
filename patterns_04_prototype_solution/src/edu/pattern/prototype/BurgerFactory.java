package edu.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

import edu.pattern.prototype.Burger.Meat;
import edu.pattern.prototype.Burger.Extra;
import edu.pattern.prototype.Burger.Bread;
import edu.pattern.prototype.Burger.Size;

public class BurgerFactory {

	private Meat meat;
	private Size size;
	private Bread bread;
	private List<Extra> extras = new ArrayList<>();
	
	public Burger create() {
		return new Burger(meat, size, bread, extras.toArray(new Extra[extras.size()]));
	}
	
	// The from method allows us to use a starting "prototype" for our new burger.
	// Note that this method does not return a Hamburger, but a Hamburger Factory so 
	// that you can still configure the hamburger that we will create
	public static BurgerFactory from (Burger prototype) {
		BurgerFactory factory = new BurgerFactory();
		factory.meat = prototype.getMeat();
		factory.bread = prototype.getBread();
		factory.size = prototype.getSize();
		factory.extras.addAll(prototype.getExtras());
		return factory;
	}

	
	public BurgerFactory setMeat(Meat meat) {
		this.meat = meat;
		return this;
	}

	public BurgerFactory setSize(Size size) {
		this.size = size;
		return this;
	}

	public BurgerFactory setBread(Bread bread) {
		this.bread = bread;
		return this;
	}

	public BurgerFactory addExtra(Extra extra) {
		this.extras.add(extra);
		return this;
	}

	public BurgerFactory removeExtra(Extra extra) {
		this.extras.remove(extra);
		return this;
	}



	// -- burgers on the menu
	public static Burger royal() {
		return new Burger ( Meat.BEEF, Size.LARGE, Bread.NORMAL, Extra.ONIONS, Extra.CHEESE);
	}

	public static Burger king() {
		return new Burger ( Meat.BEEF, Size.EXTRA_LARGE, Bread.NORMAL, Extra.ONIONS, Extra.EGG);
	}


}
