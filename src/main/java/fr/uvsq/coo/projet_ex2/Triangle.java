package fr.uvsq.coo.projet_ex2;

import java.awt.Color;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Triangle implements Forme { // Mise en eouvre du patter builder
	//Parametres obligatoire
	private int identifiant;
	private String nom;
	private float base;
	private float hauteur;
	//Parametre optionel
	private Color couleur;
	
	public static class Builder{
		//Parametres obligatoire
		@Id
		@GeneratedValue
		private int identifiant;
		private String nom="Triangle";
		private float base;
		private float hauteur;
		//Parametre optionel
		private Color couleur=Color.WHITE;
		
		//constructeur avec specification de parametre
		public Builder(float base, float hauteur){
			this.base=base;
			this.hauteur=hauteur;
		}
		//constructeur avec specification de parametre
		public Builder(){
			this.base=1;
			this.hauteur=1;
		}
		//Ajout des parametres optionnels
		public Builder couleur(Color couleur){
			this.couleur=couleur;
			return this;
		}
		//creation du Cercle
		public Triangle build(){
			return new Triangle(this);
		}
	}

	private Triangle(Builder builder){
		//parametres requis
		identifiant=builder.identifiant;
		nom=builder.nom;
		base=builder.base;
		hauteur=builder.hauteur;
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
		return base*hauteur/2;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float longueur) {
		this.base = longueur;
	}

	public float getHauteur() {
		return hauteur;
	}

	public void setHauteur(float rayon) {
		this.hauteur = rayon;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	
	@Override
	public void afficher() {
		Ecrire.message("Je suis un Triangle");
		
	}
}
