package fr.uvsq.coo.ex3_9;

public class App { //Implementation du pattern builder
	
	private static App INSTANCE; //definition de l'instance unique
	
	private App(){ //definition du constructeur
		
	}
	
	public static App getInstance(){//methode publique de recuperation de l'instance
		if(INSTANCE==null) INSTANCE=new App(); // création de la premiere instance
		return INSTANCE;
	}
	
	public void run(String args[]){ //...execution
		Interpreteur.session();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance().run(args);

	}

}
