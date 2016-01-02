package fr.uvsq.coo.ex3_4;
import fr.uvsq.coo.ex3_4.Employe;

import junit.framework.TestCase;

public class EmployeTest extends TestCase {
	
	Employe employe;

	protected void setUp() throws Exception {
		super.setUp();
		employe = new Employe(1500 , 2);
	}
	
	public void testCalculSalaire () {
		assertTrue(employe.calculSalaire()==1540);
	}

}
