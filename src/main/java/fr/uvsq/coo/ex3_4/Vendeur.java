package fr.uvsq.coo.ex3_4;

public class Vendeur extends Employe{
	
	double commission;
	
	public Vendeur(double salaireDeBase, int anciennete, double commission){
		super(salaireDeBase, anciennete);
		this.commission = commission;
	}
	
	public double calculSalaire(){
		return (salaireDeBase + 20*anciennete + commission);
	}

}
