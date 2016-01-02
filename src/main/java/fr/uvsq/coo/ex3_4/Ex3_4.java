package fr.uvsq.coo.ex3_4;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex3_4 {
	
	public static void main(String args){
		
		ArrayList<Professionnel> ProfessionnelListe = new ArrayList<Professionnel>();
		ProfessionnelListe.add(new Employe(1500 , 2));
		ProfessionnelListe.add(new Vendeur(1500 , 2 , 10));
		
		double totalSalaire=0;
		
		Iterator<Professionnel> it = ProfessionnelListe.iterator();
		 
		while (it.hasNext()) {
		       totalSalaire += it.next().calculSalaire();
		}
		
		System.out.println("TOTAL SALAIRE : "+ totalSalaire);
	}

}
