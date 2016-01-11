package fr.uvsq.coo.projet_ex2;

import java.awt.Color;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rectangle implements Forme { // Mise en eouvre du patter builder
	//Parametres obligatoire
	private int identifiant;
	private String nom;
	private float longueur;
	private float largeur;
	//Parametre optionel
	private Color couleur;
	
	public static class Builder{
		//Parametres obligatoire
		@Id
		@GeneratedValue
		private int identifiant;
		private String nom="Rectangle";
		private float longueur;
		private float largeur;
		//Parametre optionel
		private Color couleur=Color.WHITE;
		
		//constructeur avec specification de parametre
		public Builder(float longueur, float largeur){
			this.longueur=longueur;
			this.largeur=largeur;
		}
		//constructeur avec specification de parametre
		public Builder(){
			this.longueur=1;
			this.largeur=1;
		}
		//Ajout des parametres optionnels
		public Builder couleur(Color couleur){
			this.couleur=couleur;
			return this;
		}
		//creation du Cercle
		public Rectangle build(){
			return new Rectangle(this);
		}
	}

	private Rectangle(Builder builder){
		//parametres requis
		identifiant=builder.identifiant;
		nom=builder.nom;
		longueur=builder.longueur;
		largeur=builder.largeur;
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
		return longueur*largeur;
	}

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float rayon) {
		this.largeur = rayon;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	
	@Override
	public void afficher() {
		Ecrire.message("Je suis un Rectangle");
		
	}
}
