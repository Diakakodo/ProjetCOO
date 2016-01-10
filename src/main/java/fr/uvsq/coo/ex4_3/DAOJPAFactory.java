package fr.uvsq.coo.ex4_3;

public class DAOJPAFactory extends AbstractDAOFactory{

	@Override
	public DAO getPersonnelDAO() {
		// TODO Auto-generated method stub
		return new PersonnelJPADAO();
	}

}
