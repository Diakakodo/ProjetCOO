package fr.uvsq.coo.projet_ex2;

import java.awt.Color;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carre implements Forme { // Mise en eouvre du patter builder
	//Parametre obligatoire
	private int identifiant;
	private String nom;
	private float cote;
	//Parametre optionel
	private Color couleur;
	
	public static class Builder{
		//Parametres obligatoire
		@Id
		@GeneratedValue
		private int identifiant;
		private String nom="Carre";
		private float cote;
		//Parametre optionel
		private Color couleur=Color.WHITE;
		
		//constructeur avec specification de parametre
		public Builder(float cote){
			this.cote=cote;
		}
		//constructeur avec specification de parametre
		public Builder(){
			this.cote=1;
		}
		//Ajout des parametres optionnels
		public Builder couleur(Color couleur){
			this.couleur=couleur;
			return this;
		}
		//creation du Cercle
		public Carre build(){
			return new Carre(this);
		}
	}

	private Carre(Builder builder){
		//parametres requis
		identifiant=builder.identifiant;
		nom=builder.nom;
		cote=builder.cote;
		//parametres optionnels
		couleur=builder.couleur;
	}
	
	@Override
	public void chagneCouleurForme(Color nouvelleCouleur) {
		// TODO Auto-generated method stub
		this.setCouleur(nouvelleCouleur);
	}

	@Override
	public double calculSuperficie() {
		// TODO Auto-generated method stub
		return Math.sqrt(cote);
	}
//Generation des getters et setters
	public float getCote() {
		return cote;
	}

	public void setCote(float longueur) {
		this.cote = longueur;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	
	@Override
	public void afficher() {
		Ecrire.message("Je suis un Carre");
		
	}
}
