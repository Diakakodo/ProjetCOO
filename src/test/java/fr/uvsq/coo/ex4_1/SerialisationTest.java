package fr.uvsq.coo.ex4_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.uvsq.coo.ex3_9.Ecrire;
import junit.framework.TestCase;

public class SerialisationTest extends TestCase {
	Personnel p1;

	protected void setUp() throws Exception {
		super.setUp();
		p1=new Personnel
				.Builder("ILLY", "Poulmanogo")
				.Fonction("Eleve")
				.DateDeNaissance(LocalDate.now())
				.build();
	}
	
	public void testSerialisation(){
		//Ajout des personnels créés dans le fichier
		List<Personnel> listPersonnel = new ArrayList<Personnel>();
		listPersonnel.add(p1);
		FichierPersonnel.ecrire(listPersonnel);
		
		// Lecture des personnels
		listPersonnel=FichierPersonnel.lire();
		Personnel p2=listPersonnel.get(0);
		assertTrue(p1.getNom().equals(p2.getNom()));
}
}
