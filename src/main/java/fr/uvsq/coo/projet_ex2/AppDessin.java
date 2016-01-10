package fr.uvsq.coo.projet_ex2;

public class AppDessin {
	
	private static AppDessin INSTANCE; //definition de l'instance unique
	
	private AppDessin(){ //definition du constructeur
		
	}
	
	public static AppDessin getInstance(){//methode publique de recuperation de l'instance
		if(INSTANCE==null) INSTANCE=new AppDessin(); // création de la premiere instance
		return INSTANCE;
	}
	
	public void run(String args[]){ //...execution
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance().run(args);

	}

}
