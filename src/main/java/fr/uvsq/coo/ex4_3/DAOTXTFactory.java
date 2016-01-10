package fr.uvsq.coo.ex4_3;

public class DAOTXTFactory extends AbstractDAOFactory{
	public DAO<Personnel> getPersonnelDAO() {
		// TODO Auto-generated method stub
		return new PersonnelTXTDAO();
	}

}
