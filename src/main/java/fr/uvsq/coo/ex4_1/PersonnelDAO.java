package fr.uvsq.coo.ex4_1;

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

public class PersonnelDAO extends DAO<Personnel>{

	@Override
	public boolean creer(Personnel personne) {
		// TODO Auto-generated method stub
		ObjectOutputStream wr;
		try{
			wr=new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("Personnels.txt"))));
			//for(Personnel personne : listePersonne){
				wr.writeObject(personne);
				//return true;
			//}
			wr.close();
		}
		catch(FileNotFoundException e){
			return false;
		}
		catch(IOException e){
			return false;
		}
		return true;
	}

	@Override
	public ArrayList<Personnel> lire() {
		// TODO Auto-generated method stub
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

	@Override
	public Personnel trouver(String identifiant) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public Personnel modifier(Personnel p) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public void supprimer(Personnel p) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
