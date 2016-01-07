package fr.uvsq.coo.ex3_7;
import java.time.LocalDateTime;

public class MessageLog {
	
	public static void afficheMessageLogDebut(){
		System.out.println(LocalDateTime.now() + "Debut de uneMethodeMetier"); 
	}
	public static void afficheMessageLogFin(){
		System.out.println(LocalDateTime.now() + "Fin de uneMethodeMetier");
	}
}
