package fr.uvsq.coo.ex3_8;

import java.time.LocalDate;
import java.util.ArrayList;

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
		
		//Creation de personnel
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
		
		//Creation de groupe de personnel
		GroupePersonnels g1=new GroupePersonnels();
		g1.ajouter(p1);
		g1.ajouter(p2);
		GroupePersonnels g2=new GroupePersonnels();
		g2.ajouter(p3);
		
		//creation de la liste d'element
		GroupePersonnels g=new GroupePersonnels();
		g.ajouter(p1);
		g.ajouter(g1);
		g.ajouter(p2);
		g.ajouter(g2);
		g.ajouter(p3);
		g.ajouter(p4);
		
	/*IMPLEMENTATION DES DEUX TYPES D'AFFICHAGES*/
		//1. Premier type d'affichage : Affichage des Elements de type Personnel
		ElementIterateur TypePersonnelIterateur=g.getElementIterateur(ElementType.Personnel);
		while (TypePersonnelIterateur.hasNext()) {
			Element e = TypePersonnelIterateur.next();
			e.affiche();
		}
		
		//2. Second type d'affichage : Affichage des elements par groupe
		System.out.println("******");
		ElementIterateur TypeGroupeIterateur=g.getElementIterateur(ElementType.GroupePersonnels);
		while (TypeGroupeIterateur.hasNext()) {
			Element e = TypeGroupeIterateur.next();
			e.affiche();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance().run(args);
	}

}
