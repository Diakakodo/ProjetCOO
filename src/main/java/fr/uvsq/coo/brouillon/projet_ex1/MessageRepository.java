package fr.uvsq.coo.brouillon.projet_ex1;

public class MessageRepository {
	
	private static String  repertoire="C:\\Users\\UVSQ\\workspace\\PROJET_GIT\\PROJET_MAVEN\\ProjetCOO\\MessagesRepertoire";

	public static String getRepertoire() {
		return repertoire;
	}

	public static void setRepertoire(String repertoire) {
		MessageRepository.repertoire = repertoire;
	}
	
	public static void setDefaultRepertoire() {
		MessageRepository.repertoire = "C:\\Users\\UVSQ\\workspace\\PROJET_GIT\\PROJET_MAVEN\\ProjetCOO\\MessagesRepertoire";
	}

}
