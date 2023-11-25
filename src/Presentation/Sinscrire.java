package Presentation;



import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Sinscrire extends Application {
	 private TextField nom,prenom,email,CNE,Filiere;
	 private PasswordField  password,confirme_password;
	 private Scene scene ;
	 private GridPane grid;
	 private Button valider,retour; 
     private Stage stage;
	@Override
	public void start(Stage stage) throws Exception {
		grid=new GridPane();
		scene=new Scene(grid,1000,500);
		
		nom=new TextField();
		nom.setPrefHeight(20);
		nom.setPromptText("nom");
		
		CNE=new TextField();
		CNE.setPrefWidth(20);
		CNE.setPromptText("CNE");
		
		prenom=new TextField();
		prenom.setPrefWidth(20);
		prenom.setPromptText("Prenom");
		
		email=new TextField();
		email.setPrefWidth(20);
		email.setPromptText("email");
		grid.setAlignment(Pos.CENTER);
		
		grid.centerShapeProperty();
		Filiere=new TextField();
		Filiere.setPrefWidth(20);
		Filiere.setPromptText("Filiere");
		
		
		password=new PasswordField();
		password.setPrefWidth(80);
		password.setPromptText("Password");
		
		confirme_password=new PasswordField();
		confirme_password.setPrefWidth(80);
		confirme_password.setPromptText("confirme Password");
		valider=new Button("valider");
		//valider.setPrefWidth(20);
		grid.setPrefWidth(500);
		grid.setHgap(19);
		grid.setVgap(20);
		retour=new Button("Routeur");
		//retour.setPrefWidth(20);
		
	grid.add(CNE, 0, 0);
	grid.add(nom, 0, 1);
		grid.add(prenom, 0, 2);
		grid.add(email, 0, 3);
		grid.add(Filiere, 0, 4);
		grid.add(password, 0, 5);
		grid.add(confirme_password, 0, 6);
		grid.add(valider, 0, 7);
		grid.add(retour, 1, 7);
		
		stage.setScene(scene);
		stage.setTitle("S'inscrire");
		stage.show();
		
		
		retour.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent actionEvent) {
                try {
					new Login().start(stage);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    });
		
	}
	
	public Sinscrire() {
		super();
		
	}
	

	public static void main(String[] args) {
		
	      launch(args);
		}
	
}
