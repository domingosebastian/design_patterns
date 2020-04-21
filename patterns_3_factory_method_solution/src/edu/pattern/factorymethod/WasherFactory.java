package edu.pattern.factorymethod;

//clase base que usara el cliente para crear cualquier tipo de lavadora
public abstract class WasherFactory {

	public Washer create() {
		
		// proceso de construccion comun
		Washer washer = createWasher();
		
		washer.putControls();
		washer.putDrum();
		
		return washer;
	}


	// proceso de construccion especifico de cada tipo de lavadora
	// Permite que el tipo devuelto sea un subtipo de Lavadora (y por tanto,
	// las invocaciones al metodo crea() devuelvan tipos diferentes de lavadoras)
   protected abstract Washer createWasher();
}
