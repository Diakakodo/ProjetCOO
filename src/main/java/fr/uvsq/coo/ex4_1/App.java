package fr.uvsq.coo.ex4_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App { //Implementation du pattern de conception SINGLETON
	private static App INSTANCE;
	private App(){
	}
	public static App getInstance(){
		if(INSTANCE==null){
			INSTANCE=new App();
		}
		return INSTANCE;
	}
	public void run(String args[]){
		//Creation de personnels
		Personnel p1=new Personnel
				.Builder("ILLY", "Poulmanogo")
				.Fonction("Eleve")
				.DateDeNaissance(LocalDate.now())
				.build();
		Personnel p2=new Personnel
				.Builder("Bado", "Maturin")
				.Fonction("Eleve")
				.DateDeNaissance(LocalDate.now())
				.build();
		Personnel p3=new Personnel
				.Builder("Yarbanga", "Emmnuel")
				.Fonction("Eleve")
				.DateDeNaissance(LocalDate.now())
				.build();
		Personnel p4=new Personnel
				.Builder("Ben Ouirane", "Rahma")
				.Fonction("Eleve")
				.DateDeNaissance(LocalDate.now())
				.build();
		//Ajout des personnels créés dans le fichier
		FichierPersonnel.ecrire(p1);
		FichierPersonnel.ecrire(p2);
		FichierPersonnel.ecrire(p3);
		FichierPersonnel.ecrire(p4);
		// Lecture des personnels
		List<Personnel> listPersonnel = new ArrayList<Personnel>();
		listPersonnel=FichierPersonnel.lire();
		for(Personnel p : listPersonnel) { p.affiche();}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance().run(args);
	}
}