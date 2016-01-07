package fr.uvsq.coo.ex3_8;

import java.util.ArrayList;
import java.util.List;

public class GroupePersonnes implements Element{ //composite
	
	private List<Element> groupe = new ArrayList<Element>();
	
	//Ajouter un element (Personnel ou Groupe)
	public void ajouter(Element element){
		groupe.add(element);
	}
	//Supprimer un element
	public void supprimer(Element element){
		groupe.remove(element);
	}

}
