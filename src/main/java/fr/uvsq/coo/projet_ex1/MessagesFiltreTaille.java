package fr.uvsq.coo.projet_ex1;

import java.io.File;

public class MessagesFiltreTaille implements Filtre {
	
	//supprime les messages ayant une taille superieure a tailleInf et inferieure a tailleSup
	private long tailleInf;
	private long tailleSup;
	
	
	public MessagesFiltreTaille(long tailleInf, long tailleSup){
		this.tailleInf=tailleInf*1024; // taille en ko
		this.tailleSup=tailleSup*1024; // taille en ko
		
		
	}

	@Override
	public void filtreMessage(String nomMessage) {
		// TODO Auto-generated method stub
		//Verification de la taille du fichier
		File MyFile = new File(nomMessage);
		if (MyFile.length()>=tailleInf && MyFile.length()<=tailleSup) {
			MyFile.delete();
	    }
	}

}
