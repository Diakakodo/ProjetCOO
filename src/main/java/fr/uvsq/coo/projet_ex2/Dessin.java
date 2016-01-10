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
		
	}

	@Override
	public double calculSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}
	
//Generation des getters et setters
	public List<Forme> getListFormes() {
		return listFormes;
	}

	public void setListFormes(List<Forme> listFormes) {
		this.listFormes = listFormes;
	}
	
	@Override
	public void afficher() {
		// TODO Auto-generated method stub

	}
	

}
