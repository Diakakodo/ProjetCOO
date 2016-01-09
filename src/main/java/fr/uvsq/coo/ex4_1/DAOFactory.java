package fr.uvsq.coo.ex4_1;

public class DAOFactory {
	
	public static DAO<Personnel> getPersonnelDAO(){
		return new PersonnelDAO();
	}

}
