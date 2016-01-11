package fr.uvsq.coo.projet_ex2;

import java.time.LocalDate;

public class AppDessin {
	
	private static AppDessin INSTANCE; //definition de l'instance unique
	
	private AppDessin(){ //definition du constructeur
		
	}
	
	public static AppDessin getInstance(){//methode publique de recuperation de l'instance
		if(INSTANCE==null) INSTANCE=new AppDessin(); // création de la premiere instance
		return INSTANCE;
	}
	
	public void run(String args[]){ //...execution
		//Creation d'une forme cercle
		Cercle c1=new Cercle
				.Builder()
				.build();
		Rectangle r1=new Rectangle
				.Builder()
				.build();
		
		//Pesister l'instance cree
		DAO<Cercle> cercleDAO = AbstractDAOFactory.getFacrory(DaoType.JPA).getCercleDAO();
		cercleDAO.creer(c1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance().run(args);

	}

}
