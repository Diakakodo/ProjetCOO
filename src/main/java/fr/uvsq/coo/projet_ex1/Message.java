package fr.uvsq.coo.projet_ex1;

public abstract class Message {
	
	String type;
	String contenu;
	int taille;
	public Message(String type, String contenu, int taille){
		this.type = type;
		this.taille = taille;
		this.contenu = contenu;
	}
	public abstract void ajouteA_MessageType(Message m);

}
