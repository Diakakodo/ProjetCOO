package fr.uvsq.coo.projet_ex1;

import java.util.ArrayList;

public class MessageXML extends Message {

	public MessageXML(String contenu, int taille) {
		super("XML", contenu, taille);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouteA_MessageType(Message m) {
		// TODO Auto-generated method stub
		(TypeMessageListe.getTypeMessageListe("XML")).add(m);
	}
}
