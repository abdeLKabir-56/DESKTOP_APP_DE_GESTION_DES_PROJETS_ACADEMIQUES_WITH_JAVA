package Persistance;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Mitier.Etudiant;

public class DAO_Etudiant {
	private ArrayList<Etudiant> etudiants;
	private Connexion con=new Connexion();
	private Connection conn=con.getconnexion();
	
	public DAO_Etudiant(ArrayList<Etudiant> etudiants) {
		super();
	   this.etudiants = new ArrayList<Etudiant>();
	}
	public ArrayList<Etudiant> getAllEtudiants() throws SQLException {
		
		
		ResultSet res;
		try {
		
		
		
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM user;");
			res =ps.executeQuery();
		while(res.next()) {
			etudiants.add( new Etudiant(res.getString("CIN"),res.getString("nom"),
					res.getString("prenom"),res.getString("niveau"),res.getString("filiere")
					,res.getString("email"),res.getString("password")));
		}
		return etudiants;
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return etudiants;
	
	}
   public boolean ajouterEtudiant(Etudiant etudiant) {
	  
		
		
		try {
			PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?);");
			ps.setString(1, etudiant.getCNE());
			ps.setString(2, etudiant.getNom());
			ps.setString(3, etudiant.getPrenom());
			ps.setString(4, etudiant.getEmail());
			ps.setString(5, etudiant.getMdp());
			ps.setString(6, etudiant.getNiveau());
			ps.setString(7, etudiant.getFiliere());
			ps.execute();
			return true;
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
   }
   public boolean UpdateEtudiant(String CNE,String nom,String prenom,
			String niveau ,String filiere, String email,String mdp) {
		  
		
		
		try {
			PreparedStatement ps = conn.prepareStatement ("UPDATE user SET CNE ="+ CNE+",nom= "+nom+""
				+ ",prenom="+prenom+",niveau="+niveau+","
				+ "filiere="+filiere+",email="+email+",mdp="+mdp+"WHERE CNE="+CNE+";");
			
			ps.executeUpdate();
			
			return true;
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
  }
   public boolean SuprimerEtudiant(Etudiant etudiant) {
	   try {
		   PreparedStatement ps = conn.prepareStatement("delete from user where"+etudiant.getCNE()+";");
		   ps.execute();
		   return true;
	   }catch(SQLException e){
		e.printStackTrace();
	}
	   
	return false;
	   
   }
   

}
