package fr.uvsq.coo.ex3_9;

import java.util.Scanner;
import java.util.Stack;

public class Interpreteur {
	
	protected static Stack historique = new Stack ();
	
	public static void session(){
		while (true){
			Commande cmd = getNewCommande();
			if (cmd !=null) return;
			else cmd.executer();
		}
	}
	
	protected static Commande getNewCommande(){
		String input;
		Ecrire.Message("============ CALCULATRICE RPN ============");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		//Signaler si la commande saisie n'est pas definie
		while ( ! ListeCommande.contient(input)){
			Ecrire.Message ("Commande non definie; Essayer a nouveau");
			input = scan.nextLine();
		}
		if(input.equals("Quit")) return new Quit();
		else if(input.equals("Undo")) return new Undo(historique);
		else return null;
		}
}
