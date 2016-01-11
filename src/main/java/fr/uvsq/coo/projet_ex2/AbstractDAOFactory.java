package fr.uvsq.coo.projet_ex2;

public abstract class AbstractDAOFactory {
	
	public abstract DAO getCercleDAO();
	public abstract DAO getCarreDAO();
	public abstract DAO getRectangleDAO();
	public abstract DAO getTriangleAO();
	
	
	public static AbstractDAOFactory getFacrory(DaoType type){
		if(type==DaoType.JPA) return new DAOJPAFactory();
		//if(type == DaoType.JDBC) return new DAOJDBCFactory();
		//if(type == DaoType.TXT) return new DAOTXTFactory();
		return null;
	}
}
