package fr.uvsq.coo.ex4_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.uvsq.coo.ex3_9.Ecrire;

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
		
		//Pesister les personnels cree
		DAO<Personnel> personneDAO = new PersonnelDAO();
		personneDAO.creer(p1);
		personneDAO.creer(p2);
		
		// Lecture des personnels
		ArrayList<Personnel> listPersonnel= new ArrayList<Personnel>();
		listPersonnel=personneDAO.lire();
		for(Personnel p : listPersonnel) { p.affiche();}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance().run(args);
	}
}