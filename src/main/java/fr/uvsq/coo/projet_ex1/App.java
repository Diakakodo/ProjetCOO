package fr.uvsq.coo.projet_ex1;

public class App { //Implementation du pattern builder
	
	private static App INSTANCE; //definition de l'instance unique
	
	private App(){ //definition du constructeur
		
	}
	
	public static App getInstance(){//methode publique de recuperation de l'instance
		if(INSTANCE==null) INSTANCE=new App(); // création de la premiere instance
		return INSTANCE;
	}
	
	public void run(String args[]){ //...execution
		/* des criteres de suppression est un ensemble de filtre*/
		
		Filtre filtre1 = new MessagesFiltreType(".txt");
		Filtre filtre2 = new MessagesFiltreTaille(2,5); //en ko
		//Filtre filtre3 = new MessagesFiltreContenu("Ip_Projects");
		filtre1.filtreMessage("C:\\Users\\UVSQ\\workspace\\PROJET_GIT\\PROJET_MAVEN\\ProjetCOO\\MessagesRepertoire\\test.txt");
		filtre2.filtreMessage("C:\\Users\\UVSQ\\workspace\\PROJET_GIT\\PROJET_MAVEN\\ProjetCOO\\MessagesRepertoire\\ip1.txt");
		filtre2.filtreMessage("C:\\Users\\UVSQ\\workspace\\PROJET_GIT\\PROJET_MAVEN\\ProjetCOO\\MessagesRepertoire\\ip2.txt");
		//filtre3.filtreMessage("C:\\Users\\UVSQ\\workspace\\PROJET_GIT\\PROJET_MAVEN\\ProjetCOO\\MessagesRepertoire\\ip1.txt");
		//filtre3.filtreMessage("C:\\Users\\UVSQ\\workspace\\PROJET_GIT\\PROJET_MAVEN\\ProjetCOO\\MessagesRepertoire\\ip2.txt");
		System.out.println("Filtrage effectué avec succes");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance().run(args);

	}

}
