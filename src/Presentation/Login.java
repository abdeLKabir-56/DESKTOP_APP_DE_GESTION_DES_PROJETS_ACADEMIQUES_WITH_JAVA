package Presentation;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Optional;
//
////
////
////
////
////
////import java.io.FileInputStream;
////import java.io.FileNotFoundException;
////import java.sql.Connection;
////import java.sql.PreparedStatement;
////import java.sql.ResultSet;
////import java.sql.SQLException;
////
////import javax.swing.JOptionPane;
////
////import javafx.application.Application;
////import javafx.event.ActionEvent;
////import javafx.event.Event;
////import javafx.event.EventHandler;
////import javafx.geometry.Insets;
////import javafx.geometry.Pos;
////import javafx.scene.Node;
////import javafx.scene.Scene;
////import javafx.scene.control.Button;
////import javafx.scene.control.Hyperlink;
////import javafx.scene.control.Label;
////import javafx.scene.control.PasswordField;
////import javafx.scene.layout.ColumnConstraints;
////import javafx.scene.layout.GridPane;
////import javafx.scene.layout.VBox;
////import javafx.scene.control.TextField;
////import javafx.scene.image.Image;
////import javafx.scene.image.ImageView;
////import javafx.stage.Stage;
////import Presentation;
////import Persistance.Connexion;
////
////public class Login extends Application {
////	
////	
////	
////	
////	 
////	 
////	 
////	 private Recuperer_mot_de_passe recuperer;
////	 private TextField ident;
////	 private PasswordField  password;
////	 private Scene scene ;
////	 private GridPane grid;
////	 private Image logo,log_out_icon;
////	 private ImageView view,view1;
////	 private ColumnConstraints column1,column2;
////	 private Button submit,quiter;
////	 private FileInputStream input;
////	 private ControlleurNavBar controlleur;	
////	 private Hyperlink register_link,recupurer_pass_link;
////	
////
////	@Override
////	 public void start(Stage stage) throws FileNotFoundException  {
////		grid =new GridPane();
////		scene=new Scene(grid,1100,600);
////		//logo=new Image(getClass().getResourceAsStream("projet.png"));
////		input = new FileInputStream("icons_app/Log_Out.png");
////		log_out_icon=new Image(input);
////		register_link =new Hyperlink("S'inscrire?");
////		recupurer_pass_link =new Hyperlink("mot de passe oubliée?");
////		view=new ImageView();
////		view1=new ImageView();
////		
////	    view.setImage(logo);
////	    view.setFitHeight(300);
////	    view.setFitWidth(300);
////	    view1.setImage(log_out_icon);
////	    view1.setFitHeight(20);
////	    view1.setFitWidth(20);
////	    column1 = new ColumnConstraints();
////		column1.setPercentWidth(40);
////		column2 = new ColumnConstraints();
////		column2.setPercentWidth(20);
////	    grid.getColumnConstraints().addAll(column1, column2);
////	   
////	    
////	    
////	    
////		ident=new TextField();
////		ident.setPrefHeight(20);
////		ident.setPromptText("identifiant");
////		password=new PasswordField();
////		password.setPromptText("password");
////		password.setPrefHeight(30);
////        submit=new Button ("connexion");
////        quiter=new Button ("quiter",view1);
////        quiter.setStyle("-fx-background-color: #19376D;");
////        submit.setPrefWidth(140);
////        submit.setPrefHeight(30);
////        submit.setStyle("-fx-background-color: #19376D;");
////        register_link.setBorder(null);
////        recupurer_pass_link.setBorder(null);
////        quiter.setPrefWidth(140);
////        quiter.setPrefHeight(30);
////        //blue color #B4E4FF
////        grid.setStyle("-fx-background-color: #B4E4FF; -fx-background-insets: 0,0;"); 
////        grid.setHgap(10);
////        grid.setVgap(10);
////        grid.add(register_link, 1, 3);
////        grid.add(recupurer_pass_link, 2, 3);
////        grid.setPadding(new Insets(90,10, 0, 90));
////        grid.add(view,0,1);
////       //grid.add(grid1, 0, 0);
////        grid.add(ident, 1, 0);
////        grid.add(password,1,1);
////        grid.add(submit,1,2);
////        grid.add(quiter,2,2);
////      
////		stage.setTitle("Login");
////		
////		stage.setScene(scene);
////		stage.show();	
////		submit.setOnAction(new EventHandler<>() {
////			@Override
////			public void handle(ActionEvent action) {
////			Connection conn=new Connexion().getconnexion();
////			String pass=password.getText();
////			String id=ident.getText();
////			try {
////				PreparedStatement ps=conn.prepareStatement("SELECT CNE,mot_de_passe From etudiant WHERE CNE=? AND mot_de_passe=?;");
////				ps.setString(1, id);
////				ps.setString(2, pass);
////				ResultSet res=ps.executeQuery();
////			
////				if(res.next()) {
////				
////				JOptionPane.showMessageDialog(null, this,"you are logged succesfully", 0);
////				
////				
////				}
////				else {
////					JOptionPane.showMessageDialog(null, this,"you are not  logged succesfully", 0);
////				}
////			} catch (SQLException e) {
////				
////				e.printStackTrace();
////			}
////			
////			
////					
////			}
////			
////		});
////        
////		register_link.setOnAction(new EventHandler<>() {
////			@Override
////			public void handle(ActionEvent action) {
////				Sinscrire s=new Sinscrire();
////				try {
////					s.start(stage);
////				} catch (Exception e) {
////					
////					e.printStackTrace();
////				}
////			}
////			
////		});
////		
////		recupurer_pass_link.setOnAction(new EventHandler<>() {
////			@Override
////			public void handle(ActionEvent action) {
////				recuperer=new Recuperer_mot_de_passe();
////				try {
////					recuperer.start(stage);
////				} catch (Exception e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
////			}
////			
////		});
////			
////		
////	}
////	 public Login() {
////		super();
////	}
////
////	public static void main(String[] args) {
////	        launch(args);
////	    }
////
////	
////
////	
////}
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.Button;
//import javafx.scene.control.ButtonType;
//import javafx.scene.control.Hyperlink;
//import javafx.scene.control.Label;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.control.TextInputDialog;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.ColumnConstraints;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.Priority;
//import javafx.scene.layout.RowConstraints;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//public class Login  extends Application {
//       private ControlleurNavBar controller;
//       private DashboardApp dash;
////	public void start(Stage stage) throws Exception {
////		GridPane myGrid =new GridPane();
////		Scene myscene=new Scene(myGrid,400,400);
////		stage.setTitle("Login");
////		stage.setScene(myscene);
////		stage.show();
////		
////	}
//	@Override
//    public void start(Stage primaryStage) throws FileNotFoundException {
//        // Create the login grid pane
//        GridPane loginPane = new GridPane();
//        loginPane.setAlignment(Pos.CENTER);
//        loginPane.setPadding(new Insets(10, 10, 10, 10));
//        loginPane.setHgap(10);
//        loginPane.setVgap(10);
//
//        // Create the logo image view and add it to the first column of the login pane
//        FileInputStream input = new FileInputStream("icons_app/icon.png");
//        ImageView logoImageView = new ImageView(new Image(input));
//        logoImageView.setFitWidth(100);
//        logoImageView.setFitHeight(100);
//        
//        loginPane.add(logoImageView, 0, 0, 1, 2);
//
//        // Set the background color of the second column
//        loginPane.getColumnConstraints().add(new ColumnConstraints(200, 200, Double.MAX_VALUE));
//        loginPane.getColumnConstraints().add(new ColumnConstraints(200, 200, Double.MAX_VALUE));
//        loginPane.getColumnConstraints().get(1).setHgrow(Priority.ALWAYS);
//        loginPane.getRowConstraints().add(new RowConstraints(30));
//        loginPane.getRowConstraints().add(new RowConstraints(30));
//        loginPane.getRowConstraints().add(new RowConstraints(30));
//        loginPane.getRowConstraints().add(new RowConstraints(30));
//        loginPane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
//
//        // Create the ID label and text field
//        Label idLabel = new Label("ID:");
//        TextField idTextField = new TextField();
//        idTextField.setPromptText("Enter your ID");
//        idTextField.setPrefWidth(200);
//        idTextField.setPrefHeight(30);
//        idTextField.setStyle("-fx-background-image: url('projet.png'); -fx-background-position: left center; -fx-background-repeat: no-repeat; -fx-background-size: 20 20;");
//        loginPane.add(idLabel, 1, 0);
//        loginPane.add(idTextField, 1, 1);
//
//        // Create the password label and password field
//        Label passwordLabel = new Label("Password:");
//        PasswordField passwordField = new PasswordField();
//        passwordField.setPromptText("Enter your password");
//        passwordField.setPrefWidth(200);
//        passwordField.setPrefHeight(30);
//        passwordField.setStyle("-fx-background-image: url('password-icon.png'); -fx-background-position: left center; -fx-background-repeat: no-repeat; -fx-background-size: 20 20;");
//        loginPane.add(passwordLabel, 1, 2);
//        loginPane.add(passwordField, 1, 3);
//
//        // Create the login button and add it to the login pane
//        Button loginButton = new Button("Login");
//        loginButton.setDefaultButton(true);
//        loginButton.getStyle();
//        loginPane.add(loginButton, 1, 4);
//
//        // Create the registration hyperlink and add it to the login pane
//        Hyperlink registrationLink = new Hyperlink("Register");
//        loginPane.add(registrationLink, 1, 5);
//
//     // Create the forgot password hyperlink and add it to the login pane
//        Hyperlink forgotPasswordLink = new Hyperlink("Forgot password?");
//        loginPane.add(forgotPasswordLink, 1, 6);
//
//        // Set the scene and show the stage
//        Scene scene = new Scene(loginPane, 900, 500);
//        primaryStage.setTitle("Login");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        registrationLink.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent actionEvent) {
//            	try {
//					new Sinscrire().start(primaryStage);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				};
//            }
//        });
//        forgotPasswordLink.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent actionEvent) {
//            	try {
//					new Recuperer_mot_de_passe().start(primaryStage);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				};
//            }
//        });
//        loginButton.setOnAction(new EventHandler<ActionEvent>() {
//        	
//            public void handle(ActionEvent actionEvent) {
//            	controller=new ControlleurNavBar();
//       		    String id = idTextField.getText();
//                String password = new String( passwordField.getText());
//            	try {
//            		
//					if(!controller.authentification(id,password)) {
//						Alert alert = new Alert(AlertType.ERROR);
//						alert.setTitle("LOGIN erreur");
//						alert.setHeaderText(null);
//						alert.setContentText("your id or password are wrong !");
//						Optional<ButtonType> result = alert.showAndWait();
//						if (result.get() == ButtonType.OK) {
//							controller.Demarer_login_page();
//						} 
//						
//						
//					}
//					else {
//						Person p=new Person(password,password,12);
//						primaryStage.close();
//						dash =new DashboardApp();
//			    		dash.start(primaryStage);
//			    		primaryStage.show();
//					}
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				};
//            }
//
//			
//        });
//}
//	 public static void main(String[] args) {
//	        launch(args);
//	    }
//	    
//}
//
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    
    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        
        // Create the left panel
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(168, 100, 100));
        leftPanel.setPreferredSize(new Dimension(500, 600));
        ImageIcon imageIcon = new ImageIcon("C:/Users/info/eclipse-workspace/Gestion_des_projets_academiques/icons_app/logo.png");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setPreferredSize(new Dimension(300, 300));
        leftPanel.add(imageLabel);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(leftPanel, BorderLayout.CENTER);
        imageLabel.setBounds(100, 100, 100, 500); // set the size of the label
        
        imageLabel.setLocation(100,100); 
        // Create the right panel
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setPreferredSize(new Dimension(500, 600));
        rightPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);
        
        // Add the login form elements
        JLabel idLabel = new JLabel("ID:");
        c.gridx = 0;
        c.gridy = 0;
        rightPanel.add(idLabel, c);
        JTextField idField = new JTextField();
        idField.setPreferredSize(new Dimension(200, 30));
        c.gridx = 1;
        c.gridy = 0;
        rightPanel.add(idField, c);
        JLabel passwordLabel = new JLabel("Password:");
        c.gridx = 0;
        c.gridy = 1;
        rightPanel.add(passwordLabel, c);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(200, 30));
        c.gridx = 1;
        c.gridy = 1;
        rightPanel.add(passwordField, c);
        JButton loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(100, 30));
        loginButton.setBackground(new Color(168, 100, 100));
        loginButton.setForeground(Color.WHITE);
        c.gridx = 1;
        c.gridy = 2;
        rightPanel.add(loginButton, c);
        JLabel forgotPasswordLabel = new JLabel("<html><u>Forgot Password?</u></html>");
        c.gridx = 1;
        c.gridy = 3;
        rightPanel.add(forgotPasswordLabel, c);
        
        add(rightPanel, BorderLayout.EAST);
        
        pack();
        setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
