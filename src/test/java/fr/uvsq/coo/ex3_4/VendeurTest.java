package fr.uvsq.coo.ex3_4;
import fr.uvsq.coo.ex3_4.Employe;

import junit.framework.TestCase;

public class VendeurTest extends TestCase {
	
	Employe vendeur;

	protected void setUp() throws Exception {
		super.setUp();
		vendeur = new Vendeur(1500 , 2, 10);
	}
	
	public void testCalculSalaire () {
		assertTrue(vendeur.calculSalaire()==1550);
	}

}
