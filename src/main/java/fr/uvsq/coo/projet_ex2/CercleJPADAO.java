package fr.uvsq.coo.projet_ex2;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CercleJPADAO extends DAO<Cercle>{
	private EntityManager gestionnaireEntite;
	public CercleJPADAO(){
		gestionnaireEntite=Persistence.createEntityManagerFactory("UPDessinApp").createEntityManager();
	}
	@Override
	public boolean creer(Cercle p) {
		// TODO Auto-generated method stub
		gestionnaireEntite.getTransaction().begin();
		try {
			gestionnaireEntite.persist(p);
			gestionnaireEntite.getTransaction().commit();
		} catch(Exception e){
			gestionnaireEntite.getTransaction().rollback();
			return false;
		} finally {
			gestionnaireEntite.close();
		}
		return true;
	}

	@Override
	public ArrayList<Cercle> lire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cercle trouver(String identifiant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cercle modifier(Cercle p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimer(Cercle p) {
		// TODO Auto-generated method stub
		
	}

}
