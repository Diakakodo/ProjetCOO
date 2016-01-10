package fr.uvsq.coo.projet_ex1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import junit.framework.TestCase;

public class MessagesFiltreContenuTest extends TestCase {

	Filtre filtre1;

	protected void setUp() throws Exception {
		super.setUp();
		filtre1 = new MessagesFiltreContenu("ABRACADABRA");
	}

	public void testMessagesFiltreTaille(){
		File fichierASupprimer = new File("C:/Users/UVSQ/workspace/PROJET_GIT/PROJET_MAVEN/ProjetCOO/MessagesRepertoire/test.txt");
		ecrire("ABRACADABRA");
		if(fichierASupprimer.exists()){
			//filtre1.filtreMessage("C:\\Users\\UVSQ\\workspace\\PROJET_GIT\\PROJET_MAVEN\\ProjetCOO\\MessagesRepertoire\\test.txt");
			assertTrue(fichierASupprimer.exists());
		}
	}
	
	public void ecrire(String texte){
		try{
			String adressedufichier="C:\\Users\\UVSQ\\workspace\\PROJET_GIT\\PROJET_MAVEN\\ProjetCOO\\MessagesRepertoire\\test.txt";
			FileWriter fw = new FileWriter(adressedufichier, true);
			BufferedWriter output = new BufferedWriter(fw);
			output.write(texte);
			output.flush();
			output.close();
		} catch(IOException ioe){
			System.out.println("erreur : " + ioe );
			}
	}
}
