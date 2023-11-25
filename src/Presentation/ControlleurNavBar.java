package Presentation;

import java.util.ArrayList;

import Mitier.Etudiant;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
class  ControlleurNavBar {
	 private Login Login_page;
	 private Sinscrire sinscrire;
	 private ArrayList<Etudiant> etudiants=new ArrayList<Etudiant>();
     private DashboardApp dash;
     
     public ControlleurNavBar() {
		super();
	}

	public void Demarer_login_page() {
    	 Login_page=new Login();
    	 
     }
     
    
     
	
}
