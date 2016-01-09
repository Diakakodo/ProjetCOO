package fr.uvsq.coo.ex3_9;

import java.util.Stack;

public class Undo implements Commande {
	
	protected Stack historique;
	
	public Undo(Stack historique){
		this.historique=historique;
	}

	@Override
	public void executer() {
		// TODO Auto-generated method stub
		historique.remove(historique.firstElement());
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
