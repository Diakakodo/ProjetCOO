package fr.uvsq.coo.projet_ex1;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

public class MessagesFiltreTailleTest extends TestCase {

	Filtre filtre1;

	protected void setUp() throws Exception {
		super.setUp();
		filtre1 = new MessagesFiltreTaille(0,1);
	}

	public void testMessagesFiltreTaille(){
		File fichierASupprimer = new File("C:/Users/UVSQ/workspace/PROJET_GIT/PROJET_MAVEN/ProjetCOO/MessagesRepertoire/test.txt");
		if(fichierASupprimer.exists()){
			filtre1.filtreMessage("C:\\Users\\UVSQ\\workspace\\PROJET_GIT\\PROJET_MAVEN\\ProjetCOO\\MessagesRepertoire\\test.txt");
			assertTrue(!fichierASupprimer.exists());
		}
	}
}
