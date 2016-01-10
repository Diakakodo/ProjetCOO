package fr.uvsq.coo.projet_ex2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Dessin implements Forme {

	private List<Forme> listFormes;
	
	public Dessin(){
		listFormes= new ArrayList<Forme>();
	}

	@Override
	public void chagneCouleurForme(Color nouvelleCouleur) {
		// TODO Auto-generated method stub
		//changement de la couleur de toutes les formes du dessin
		for(Forme forme : listFormes){
			forme.chagneCouleurForme(nouvelleCouleur);
		}
	}

	@Override
	public double calculSuperficie() {
		// TODO Auto-generated method stub
		//sommation des superficie de toutes les formes du dessin
		double superficie=0;
		for(Forme forme : listFormes){
			superficie+=forme.calculSuperficie();
		}
		return superficie;
	}
	
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		//affichage de toutes les formes du dessin
		for(Forme forme : listFormes){
			forme.afficher();
		}
	}
	//Ajouter une forme au dessin
	public void ajouterForme(Forme nouvelleForme){
		listFormes.add(nouvelleForme);
	}
	//suprimmer une forme du dessin
	public void supprimeFormeF(Forme F){
		
		//suppression de toutes les formes de type F du dessin
				for(Forme forme : listFormes){
					if(forme.getClass().equals(F)){
						listFormes.remove(forme);
				}
			}
	}
	
	//Generation des getters et setters
	public List<Forme> getListFormes() {
		return listFormes;
	}

	public void setListFormes(List<Forme> listFormes) {
		this.listFormes = listFormes;
	}

}
