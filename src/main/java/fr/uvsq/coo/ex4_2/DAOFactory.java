package fr.uvsq.coo.ex4_2;

public class DAOFactory {
	
	public static DAO<Personnel> getPersonnelDAO(){
		return new PersonnelDAO();
	}

}
