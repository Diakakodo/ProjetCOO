package fr.uvsq.coo.ex4_2;

public class DAOTXTFactory extends AbstractDAOFactory{
	public DAO<Personnel> getPersonnelDAO() {
		// TODO Auto-generated method stub
		return new PersonnelTXTDAO();
	}

}
