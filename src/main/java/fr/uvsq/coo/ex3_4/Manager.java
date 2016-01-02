package fr.uvsq.coo.ex3_4;

public class Manager extends Employe{
	
	protected int NbreDeSubalterne;
	
	public Manager(double salaireDeBase, int anciennete, int NbreDeSubalterne){
		super(salaireDeBase, anciennete);
		this.NbreDeSubalterne = NbreDeSubalterne;
	}
	
	public double calculSalaire(){
		return (salaireDeBase + 20*anciennete + 100*NbreDeSubalterne);
	}

}
