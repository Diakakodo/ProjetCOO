package fr.uvsq.coo.projet_ex2;

public class DAOJPAFactory extends AbstractDAOFactory{

	@Override
	public DAO getCercleDAO() {
		// TODO Auto-generated method stub
		return new CercleJPADAO();
	}

	@Override
	public DAO getCarreDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DAO getRectangleDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DAO getTriangleAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
