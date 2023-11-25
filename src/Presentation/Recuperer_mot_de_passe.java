package Presentation;
import java.io.FileNotFoundException;
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Recuperer_mot_de_passe  extends Application{
     private String mot_de_passe;
     private TextField CNE,password,nouveau_pass;
     private Button valider,retour,confirmer;
     private Scene scene;
     private GridPane grid;
     private Stage stage;
	@Override
	
	public void start(Stage stage) throws Exception {
		grid=new GridPane();
		scene=new Scene(grid,1000,500);
		
		CNE=new TextField();
		CNE.setPrefHeight(20);
		CNE.setPromptText("CNE");
		
		password=new TextField();
		password.setPrefHeight(20);
		password.setPromptText("password");
		
		nouveau_pass=new TextField();
		nouveau_pass.setPrefHeight(20);
		nouveau_pass.setPromptText("la nouvelle mot de passe");
		
		valider =new Button("generer un mot de passe");
		retour =new Button("retour");
		confirmer =new Button("confirmer");
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(19);
		grid.setVgap(20);
		
		grid.add(CNE, 0, 0);
		//grid.add(password, 0, 1);
		grid.add(valider, 0, 1);
		grid.add(retour, 1, 3);
		grid.add(nouveau_pass, 0, 2);
		grid.add(confirmer, 0, 3);
		stage.setScene(scene);
		stage.setTitle("recuperer un mot de passe");
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
	 valider.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent actionEvent) {
                String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String lower = "abcdefghijklmnopqrstuvwxyz";
				String digits = "0123456789";
				String special= " ~!@#$%^&* ( ) +-/ ; : .";
				String symbols = upper + lower + digits + special;
				int m = symbols.length();
				String password = "";
				Random r = new Random();
				for (int i = 0; i<10; i++) {
				password += symbols.charAt(r.nextInt(m));
				}
				nouveau_pass.setText(password);
	        }
	        
	    });
		
	}
	
	public Recuperer_mot_de_passe() {
		super();
	}
	public void Recuperer() {
		
	}
	public static void main(String[] args) {
        launch(args);
    }
}
