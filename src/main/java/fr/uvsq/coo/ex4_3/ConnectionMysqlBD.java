package fr.uvsq.coo.ex4_3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionMysqlBD {
    public static Connection connection;//static pour pouvoir appeler la connection sans instancier la classe
    public static Statement querry;
    
    public static void getConnexion() throws Exception{
    	
    	if(connection==null){
        Class.forName("com.mysql.jdbc.Driver");//indique le pilote de connexion
        String url="jdbc:mysql://localhost:3306/Personnel";  //creation de l'url de connexion
        String utilisateur="root";
        String motDePasse="";
        connection=DriverManager.getConnection(url, utilisateur, motDePasse);
        querry=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
    	}
        //return connection;
    }
    
}
