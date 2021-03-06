package fr.uvsq.coo.ex4_2;

public abstract class AbstractDAOFactory {
	
	public enum DaoType {JDBC, TXT, JPA;}
	
	public abstract DAO getPersonnelDAO();
	
	public static AbstractDAOFactory getFacrory(DaoType type){
		if(type == DaoType.JDBC) return new DAOJDBCFactory();
		if(type == DaoType.TXT) return new DAOTXTFactory();
		return null;
	}

}
