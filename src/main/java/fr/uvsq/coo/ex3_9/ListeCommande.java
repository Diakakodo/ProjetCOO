package fr.uvsq.coo.ex3_9;

public enum ListeCommande {
	
	Addition, Soustraction, multiplication, division, Quit, Undo ;
	
	public static boolean contient(String cmdEntree) {

	    for (ListeCommande c : ListeCommande.values()) {
	    	//Ecrire.Message(""+c.name());
	        if (c.name().equals(cmdEntree)) {
	            return true;
	        }
	    }

	    return false;
	}

}
