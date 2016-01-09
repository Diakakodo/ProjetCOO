package fr.uvsq.coo.ex3_9;

public interface Commande extends Cloneable {
	public void executer();
	public void undo();
}
