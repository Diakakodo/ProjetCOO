package fr.uvsq.coo.ex3_4;

public class Employe extends Professionnel{
	
	protected double salaireDeBase;
	protected int anciennete;
	
	public Employe(double salaireDeBase, int anciennete){
		this.salaireDeBase = salaireDeBase;
		this.anciennete = anciennete;
	}
	
	public double calculSalaire(){
		return (salaireDeBase + 20*anciennete);
	}

}
