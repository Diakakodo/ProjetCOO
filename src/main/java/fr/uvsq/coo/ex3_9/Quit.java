package fr.uvsq.coo.ex3_9;

public class Quit implements Commande {

	@Override
	public void executer() {
		// TODO Auto-generated method stub
		System.exit(0);

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
