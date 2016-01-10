package fr.uvsq.coo.ex4_3;

public class DAOJDBCFactory extends AbstractDAOFactory{

	@Override
	public DAO<Personnel> getPersonnelDAO() {
		// TODO Auto-generated method stub
		return new PersonnelJDBCDAO();
	}

}
