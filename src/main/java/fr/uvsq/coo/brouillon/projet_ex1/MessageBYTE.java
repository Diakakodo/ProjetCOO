package fr.uvsq.coo.brouillon.projet_ex1;

import java.util.ArrayList;

public class MessageBYTE extends Message {

	public MessageBYTE(String contenu, int taille) {
		super("BYTE", contenu, taille);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouteA_MessageType(Message m) {
		// TODO Auto-generated method stub
		(TypeMessageListe.getTypeMessageListe("BYTE")).add(m);
	}
}
