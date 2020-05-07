package edu.pattern.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pattern.proxy.Account;
import edu.pattern.proxy.NormalAccount;

public class TestAccounts {

	/**
	 * Este test no hay que modificarlo. Ya funciona y la 
	 * idea es que debe seguir haciendolo
	 */
	@Test
	public void test_normal_account() {
		Account cuentaNormal = new NormalAccount("cliente");
		assertEquals("cliente", cuentaNormal.getClient());
		assertEquals(0, cuentaNormal.getQuantity());

		cuentaNormal.transfer(10);
		assertEquals(10, cuentaNormal.getQuantity());

		cuentaNormal.transfer(-20);
		assertEquals(-10, cuentaNormal.getQuantity());
	}

	/**
	 * Modificad la asignacion a cuentaNueva para que sea a vuestra clase
	 */
	@Test
	public void test_new_account() {
		Account cuentaNueva = new NormalAccount("cliente"); // cambiar !
		assertEquals("cliente", cuentaNueva.getClient());
		assertEquals(0, cuentaNueva.getQuantity());

		cuentaNueva.transfer(10);
		assertEquals(10, cuentaNueva.getQuantity());

		// esta operacion no se debe llevar a cabo
		cuentaNueva.transfer(-20);
		assertEquals(10, cuentaNueva.getQuantity());
	}

	
}
