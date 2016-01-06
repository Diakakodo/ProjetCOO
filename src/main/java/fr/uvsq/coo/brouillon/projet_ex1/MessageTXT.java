package fr.uvsq.coo.brouillon.projet_ex1;

import java.util.ArrayList;

public class MessageTXT extends Message {

	public MessageTXT(String contenu, int taille) {
		super("TXT", contenu, taille);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouteA_MessageType(Message m) {
		// TODO Auto-generated method stub
		(TypeMessageListe.getTypeMessageListe("TXT")).add(m);
	}
	
	

}
