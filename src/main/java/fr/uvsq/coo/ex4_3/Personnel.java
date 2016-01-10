package fr.uvsq.coo.ex4_3;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel implements Element, Serializable {
	
	private String nom;
	private String prenom;
	
	private String fonctions;
	private LocalDate dateDeNaissance;
	private ArrayList<String> listNumerosTelephone;
	
	
	public static class Builder{
		
		private final String nom;
		private final String prenom;
		
		private String fonctions="non definie";
		private LocalDate dateDeNaissance=null;
		private ArrayList<String> listNumerosTelephone=new ArrayList<String>();
		
		//constructeur avec les attributs obligatoires
		public Builder(String nom, String prenom){
			this.nom=nom;
			this.prenom=prenom;
		}
		//ajout des attributs optionnels
		public Builder Fonction(String fonction){
			this.fonctions=fonction;
			return this;
		}
		public Builder DateDeNaissance(LocalDate dateDeNaissance){
			this.dateDeNaissance=dateDeNaissance;
			return this;
		}
		public Builder listNumerosTelephone(String numero){
			this.listNumerosTelephone.add(numero);
			return this;
		}
		
		//construction d'un personnel
		public Personnel build(){
			return new Personnel(this);
		}
	}
/*definition du constructeur*/	
	private Personnel(Builder builder){
		//parametres requis
		this.nom=builder.nom;
		this.prenom=builder.prenom;
		//parametres optionnels
		this.fonctions=builder.fonctions;
		this.dateDeNaissance=builder.dateDeNaissance;
		this.listNumerosTelephone=builder.listNumerosTelephone;
	}
	
/*getters et setters générés*/
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getFonctions() {
		return fonctions;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public ArrayList<String> getListNumerosTelephone() {
		return listNumerosTelephone;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setFonctions(String fonctions) {
		this.fonctions = fonctions;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public void setListNumerosTelephone(ArrayList<String> listNumerosTelephone) {
		this.listNumerosTelephone = listNumerosTelephone;
	}
	
/*Fin generation*/

	@Override
	public void affiche() { //Affichage d'un personnel
		// TODO Auto-generated method stub
		System.out.print("NOM : "+nom+ "\tPRENOM : "+prenom+"\tFONCTION : "+fonctions+"\tDateDenaissance"+dateDeNaissance);
		for(String numero: listNumerosTelephone) System.out.print(" "+numero);
		System.out.println("");
	}
}
