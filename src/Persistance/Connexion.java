package Persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Connexion {
private Connection  conn;
	
	public Connection getconnexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mesarticles","root","abc123abc");
			
			}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return conn ;
		}

	public Connexion() {
	}
}
