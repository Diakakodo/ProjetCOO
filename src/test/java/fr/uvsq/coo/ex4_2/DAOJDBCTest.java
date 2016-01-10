package fr.uvsq.coo.ex4_2;

import java.time.LocalDate;
import fr.uvsq.coo.ex4_2.AbstractDAOFactory.DaoType;
import junit.framework.TestCase;

public class DAOJDBCTest extends TestCase {
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
		DAO<Personnel> personnelDAO = AbstractDAOFactory.getFacrory(DaoType.JDBC).getPersonnelDAO();
		personnelDAO.creer(p1);
		
		// Lecture des personnels
		Personnel p2=new Personnel
				.Builder("", "")
				.build();
		p2=personnelDAO.trouver(p1.getNom());
		assertTrue(p1.getNom().equals(p2.getNom()));
 }
}
