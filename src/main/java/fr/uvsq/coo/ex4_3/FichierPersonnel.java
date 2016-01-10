package fr.uvsq.coo.ex4_3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FichierPersonnel {
	//fonction d'ecriture d'un enregistrement dans le fichier
	public static void ecrire(List<Personnel> listePersonne){
		ObjectOutputStream wr;
		try{
			wr=new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("Personnels.txt"))));
			for(Personnel personne : listePersonne){
				wr.writeObject(personne);
			}
			wr.close();
		}
		catch(FileNotFoundException e){
		}
		catch(IOException e){
		}
	}
	
	//fonction de lecture dans le fichier	
	public static ArrayList<Personnel> lire(){
		ArrayList<Personnel> liste=new ArrayList<Personnel>();
		ObjectInputStream rd;
		try{
			rd=new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("Personnels.txt"))));
			while(true){
				try{ liste.add((Personnel)rd.readObject());

				}catch(EOFException e){
					break;
				}
			}
		} catch (ClassNotFoundException e){}catch(IOException  e){}
		return liste;
	}
}
