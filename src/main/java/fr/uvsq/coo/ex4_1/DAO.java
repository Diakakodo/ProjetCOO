package fr.uvsq.coo.ex4_1;

import java.util.ArrayList;

public abstract class DAO<Type> {
	public abstract boolean creer(Type p );
	public abstract ArrayList<Type> lire();
	public abstract Type trouver(String identifiant);
	public abstract Type modifier(Type p );
	public abstract void supprimer(Type p );
}
