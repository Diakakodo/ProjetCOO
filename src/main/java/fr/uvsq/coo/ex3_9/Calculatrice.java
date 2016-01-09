package fr.uvsq.coo.ex3_9;

import java.util.Scanner;

public class Calculatrice { //Implementation du pattern builder
	
	private static Calculatrice INSTANCE; //definition de l'instance unique
	
	private Calculatrice(){ //definition du constructeur
		
	}
	
	public static Calculatrice getInstance(){//methode publique de recuperation de l'instance
		if(INSTANCE==null) INSTANCE=new Calculatrice(); // création de la premiere instance
		return INSTANCE;
	}
	
	public void run(String args[]){ //...execution
		Interpreteur.session();
		
		String input;
		Ecrire.Message("============ CALCULATRICE RPN ============");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		//Signaler si la commande saisie n'est pas definie
		while ( ! ListeCommande.contient(input)){
			Ecrire.Message ("Commande non definie; Essayer a nouveau");
			input = scan.nextLine();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance().run(args);

	}

}
