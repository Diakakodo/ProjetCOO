package fr.uvsq.coo.ex3_4;

import junit.framework.TestCase;

public class ManagerTest extends TestCase {
	
	Manager manager;

	protected void setUp() throws Exception {
		super.setUp();
		manager = new Manager(1500 , 2 , 2);
	}
	
	public void testCalculSalaire(){
		assertTrue(manager.calculSalaire()==1740);
	}

}
