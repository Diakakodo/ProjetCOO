package fr.uvsq.coo.ex4_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.uvsq.coo.ex3_9.Ecrire;
import fr.uvsq.coo.ex4_2.AbstractDAOFactory.DaoType;
import junit.framework.TestCase;

public class DAOSerialisationTest extends TestCase {
	Personnel p1;

	protected void setUp() throws Exception {
		super.setUp();
		p1=new Personnel
				.Builder("ILLY", "Poulmanogo")
				.Fonction("Eleve")
				.DateDeNaissance(LocalDate.now())
				.build();
	}
	
	public void testDAOSerialisation(){
		//Ajout des personnels créés dans le fichier
		List<Personnel> listPersonnel = new ArrayList<Personnel>();
		DAO<Personnel> personneDAO = AbstractDAOFactory.getFacrory(DaoType.TXT).getPersonnelDAO();
		personneDAO.creer(p1);
		
		// Lecture des personnels
		listPersonnel=personneDAO.lire();
		Personnel p2=listPersonnel.get(0);
		assertTrue(p1.getNom().equals(p2.getNom()));
}
}
