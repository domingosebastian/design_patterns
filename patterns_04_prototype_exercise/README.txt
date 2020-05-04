Our product has two kinds:
Burger: which represents ... burger. Each burger is defined by a series
of characteristics (bread, meat, extras ...) that are established in its constructor.

BurgerFactory allows you to create burgers specifying each of its elements. For example:


		Burger special = new BurgerFactory ()
				.setMeat (Meat.BEEF)
				.setSize (Size.EXTRA_LARGE)
				.setBread (Bread.WITH_SEEDS)
				.addExtra (Extra.MAYONNAISE)
				.addExtra (Extra.CHEESE)
				.create ();

 Also, save pre-set "configurations" for the burgers on the menu:
 
 Burger royal = BurgerFactory.royal ();
 
 The problem is that we have complicated (possible, but not very practical) burgers types such as
 "a royal without onions". Where need to state everything explicitly:
 
		Burger royalWithoutOnion = new BurgerFactory ()
				.setMeat (Meat.BEEF)
				.setSize (Size.LARGE)
				.setBread (Bread.NORMAL)
				.addExtra (Extra.CHEESE)
				.create ();
 
 Modify the BurgerFactory class to make it easy to place the this order. It would be something
 like passing a prototype (the royal) and indicating that we want to remove the onions.
 
 Modify the test class (test_royal_without_onion method and verify that the test still passes)
 
Good luck!
