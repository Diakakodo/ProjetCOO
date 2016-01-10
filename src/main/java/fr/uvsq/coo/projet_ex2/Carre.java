package fr.uvsq.coo.projet_ex2;

import java.awt.Color;

public class Carre implements Forme { // Mise en eouvre du patter builder
	//Parametre obligatoire
	private float cote;
	//Parametre optionel
	private Color couleur;
	
	public static class Builder{
		//Parametres obligatoire
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
