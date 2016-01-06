package fr.uvsq.coo.projet_ex1;

import java.io.File;

public class MessagesFiltreType implements Filtre {
	
	String type;
	
	//Construteur du filtre
	public MessagesFiltreType(String type){
		this.type=type;
	}

	@Override
	public void filtreMessage(String nomMessage) {
		// TODO Auto-generated method stub	
		if (nomMessage.lastIndexOf(".") > 0) {
		    // On récupère l'extension du fichier
		    String ext = nomMessage.substring(nomMessage.lastIndexOf("."));
		    // Si le fichier est au type du filtre on le supprime
		    if (ext.equals(type)) {
		    	File MyFile = new File(nomMessage);
				MyFile.delete();
		    }
		} 
		 
	}

}
