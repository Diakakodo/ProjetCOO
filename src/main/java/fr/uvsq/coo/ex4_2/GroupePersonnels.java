package fr.uvsq.coo.ex4_2;

import java.util.ArrayList;
import java.util.List;

public class GroupePersonnels implements Element, GroupeElement{ //composite
	
	private List<Element> listElement;
	
	// constructeur d'un groupe d'element
	public GroupePersonnels(){
		listElement = new ArrayList<Element>();
	}
	
	//Ajouter un element (Personnel ou Groupe)
	public void ajouter(Element element){
		listElement.add(element);
	}
	//Supprimer un element
	public void supprimer(Element element){
		listElement.remove(element);
	}
	
	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		for(Element e : listElement){
			e.affiche();
		}
		System.out.println("");
	}

	@Override
	public ElementIterateur getElementIterateur(ElementType type) {
		// TODO Auto-generated method stub
		return new ElementIterateurImpl(type, this.listElement);
	}
	
	private class ElementIterateurImpl implements ElementIterateur{
		ElementType type;
		private List<Element> listElement;
		private int position;
		
		public ElementIterateurImpl(ElementType type, List<Element> listElement){
			this.type=type;
			this.listElement=listElement;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			while(position<listElement.size()){
				Element e=listElement.get(position);
				int i=e.getClass().getName().lastIndexOf(".");
				//System.out.println(e.getClass().getName().substring(i));
				if(e.getClass().getName().substring(i).equals("."+type)){
					return true;
				} else position ++;
			}
			return false;
		}

		@Override
		public Element next() {
			// TODO Auto-generated method stub
			Element e=listElement.get(position);
			position ++;
			return e;
		}
		
	}
}
