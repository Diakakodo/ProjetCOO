package fr.uvsq.coo.ex4_2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonnelJDBCDAO extends DAO<Personnel>{
	@Override
	public boolean creer(Personnel p) {
		// TODO Auto-generated method stub
		//Connection connect=ConnectionMysqlBD.getConnexion();
		try{
			PreparedStatement prepare=connect.prepareStatement("INSERT INTO Personnel (nom, prenom) VALUES (?,?)");
			prepare.setString(1, p.getNom());
			prepare.setString(1, p.getPrenom());
			int result = prepare.executeUpdate();
			assert result == 1;
		} catch (SQLException e){
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public ArrayList<Personnel> lire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personnel trouver(String identifiant) {
		// TODO Auto-generated method stub
		Personnel p=new Personnel
				.Builder("", "")
				.build();
		try{
			PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Peronnel WHERE nom = ?");
			prepare.setString(1, identifiant);
			ResultSet result = prepare.executeQuery();
			if(result.first()){
				p = new Personnel
						.Builder(result.getString("nom"), result.getString("prenom"))
						.build();
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		
		return p;
	}

	@Override
	public Personnel modifier(Personnel p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimer(Personnel p) {
		// TODO Auto-generated method stub
		
	}

}
