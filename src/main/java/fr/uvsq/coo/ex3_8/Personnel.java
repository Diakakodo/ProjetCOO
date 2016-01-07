package fr.uvsq.coo.ex3_8;
import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel { //Implémentation du pattern de conception builder
	
	private final String nom;
	private final String prenom;
	
	private final String fonctions;
	private final LocalDate dateDeNaissance;
	private final ArrayList<String> listNumerosTelephone;
	
	
/*definition du builder*/	
	public static class Builder{
		
		//Les attributs obligatoires
		private final String nom;
		private final String prenom;
		
		//les attributs optionnels et initialisation avec des valeurs par defaut
		private String fonctions="non definie";
		private LocalDate dateDeNaissance="non definie";
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
}
