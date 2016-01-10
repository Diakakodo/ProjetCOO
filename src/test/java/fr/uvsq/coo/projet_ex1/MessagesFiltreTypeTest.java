package fr.uvsq.coo.projet_ex1;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

public class MessagesFiltreTypeTest extends TestCase {

	Filtre filtre1;

	protected void setUp() throws Exception {
		super.setUp();
		filtre1 = new MessagesFiltreType(".txt");
	}

	public void testMessagesFiltreType(){
		File fichierASupprimer = new File("C:/Users/UVSQ/workspace/PROJET_GIT/PROJET_MAVEN/ProjetCOO/MessagesRepertoire/test.txt");
		boolean testCreation=false;
		try {
			if (fichierASupprimer.createNewFile()) testCreation=true;
			else testCreation=false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(testCreation==true){
			filtre1.filtreMessage("C:\\Users\\UVSQ\\workspace\\PROJET_GIT\\PROJET_MAVEN\\ProjetCOO\\MessagesRepertoire\\test.txt");
			assertTrue(!fichierASupprimer.exists());
		}
	}
}
