package fr.uvsq.coo.ex3_3;
/* CLASSE DE L'ENONCEE
class Employe {
		private final String nom;
		private final String adresse;
		// ...
		public double calculSalaire (){ return  calculDuSalaire; }
		public void afficheCoordonnees(){ System.out.println(nom + " , " + adresse); }
	}
*/
//1. Cette classe ne respecte pas le Single Responsabilty Principle. Elle a deux responsabilit� : le calcul de
//   salaire et l'affichage des coordonnees'

//2. Si la methode de calcul du salaire change, il y aura recompilation de la classe employ� dont la methode
//   d'affichage des coordonn�es aussi.

//3. Si l'affichage est remplac�e par un stockage dans un fichier CSV, il y aura recompilation de la classe 
//   employ� dont la methode de calcul des salaires aussi.

/*4. PROPOSITION D'UNE CLASSE QUI RESPECTE SRP'*/
class Employe {
	private /*final*/ String nom;
	private /*final*/ String adresse;
	private double salaire;
	
	public void Employe(){}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}

/*class AfficheEmploye extends Employ�{
private final String nom;
private final String adresse;

public void afficheCoordonnees(){ System.out.println(nom + " , " + adresse); }

}
*/

/*class SalaireEmploye extends Employe{
	double salaire;
	// ...
	public double calculSalaire (){ return  salaire; }
}
*/