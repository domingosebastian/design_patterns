Nuestro producto tiene dos clases:
Hamburguesa : que representa ... hambuguesas. Cada hamburguesa esta definida por una serie
de caracteristicas (pan, carne, extras ...) que se establecen en su constructor.

HamburguesaFactory permite crear hamburguesas especificando cada uno de sus partes. Por ejemplo:

		Hamburguesa especial = new HamburguesaFactory()
                .setCarne(Carne.POLLO)
                .setSize(Size.EXTRA_GRANDE)
                .setPan(Pan.NORMAL)
                .addExtra(Extra.QUESO)
                .addExtra(Extra.MAYONESA)
                .crea();

 Además, guarda "configuraciones" pre-establecidas para las hamburguesas de la carta:
 
 		Burger royal = BurgerFactory.royal();
 
 El problema, es que tenemos complicado (posible, pero no practico) hacer hamburguesas tipo 
 "una royal pero sin cebolla". Necesitamos indicarlo todo explicitamente:
 
  		Burger royalWithoutOnion = new BurgerFactory()
				                              .setMeat(Meat.BEAF)
				                              .setSize(Size.LARGE)
				                              .setBread(Bread.NORMAL)
				                              .addExtra(Extra.CHEESE)
				                              .create();
 
 Modifica la clase HamburguesaFactory para hacer facil realizar el pedido anterior. Seria algo
 como pasar un prototype (la royal) y indicar solo que queremos quitar la cebolla.
 
 Modificad la clase de test (metodo test_royal_si_cebolla y verificad que aun se supera el test)
 
 suerte !