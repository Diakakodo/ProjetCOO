package fr.uvsq.coo.ex3_4;

import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.TestCase;

public class SalaireProfessionnelsTest extends TestCase {
	
	ArrayList<Professionnel> ProfessionnelListe;

	protected void setUp() throws Exception {
		super.setUp();
		ProfessionnelListe.add(new Employe(1500 , 2));
		ProfessionnelListe.add(new Vendeur(1500 , 2 , 10));
	}
	
	public void testSalaireProfessionnels(){
        double totalSalaire=0;
		Iterator<Professionnel> it = ProfessionnelListe.iterator();
		 
		while (it.hasNext()) {
		       totalSalaire += (it.next()).calculSalaire();
		}
		
		assertTrue(totalSalaire==3090);
	}

}
