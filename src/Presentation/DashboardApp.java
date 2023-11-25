package Presentation;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.plaf.InsetsUIResource;

import Persistance.Connexion;
import Persistance.DAO_Etudiant;
//
//import java.io.FileNotFoundException;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.chart.PieChart;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//public class DashboardApp extends Application {
//
//    @Override
//    public void start(Stage primaryStage) {
//        // Create the root border pane for the dashboard
//        BorderPane rootPane = new BorderPane();
//        Button Quiter =new Button("Quiter");
//        // Create the top HBox for the header of the dashboard
//        HBox headerBox = new HBox();
//        headerBox.setPadding(new Insets(10));
//        headerBox.setAlignment(Pos.CENTER_LEFT);
//
//        // Create the label for the header
//        Label headerLabel = new Label("Dashboard");
//        headerLabel.setStyle("-fx-font-size: 24px; -fx-text-fill: #333333;");
//
//        // Add the header label to the header box
//        headerBox.getChildren().add(headerLabel);
//
//        // Set the top border pane element to the header box
//        rootPane.setTop(headerBox);
//
//        // Create the left VBox for the sidebar of the dashboard
//        VBox sidebarBox = new VBox();
//        sidebarBox.setPadding(new Insets(10));
//        sidebarBox.setSpacing(10);
//
//        // Create the label for the sidebar
//        Label sidebarLabel = new Label("Navigation");
//        sidebarLabel.setStyle("-fx-font-size: 18px; -fx-text-fill: #333333;");
//
//        // Add the sidebar label to the sidebar box
//        sidebarBox.getChildren().add(sidebarLabel);
//
//        // Create the pie chart for the sidebar
//        PieChart pieChart = new PieChart();
//        pieChart.getData().add(new PieChart.Data("Sales", 20000));
//        pieChart.getData().add(new PieChart.Data("Expenses", 15000));
//        pieChart.getData().add(new PieChart.Data("Profit", 5000));
//        pieChart.setTitle("Financial Summary");
//
//        // Add the pie chart to the sidebar box
//        sidebarBox.getChildren().add(pieChart);
//
//        // Set the left border pane element to the sidebar box
//        rootPane.setLeft(sidebarBox);
//
//        // Create the center VBox for the content of the dashboard
//        VBox contentBox = new VBox();
//        contentBox.setPadding(new Insets(10));
//        contentBox.setSpacing(10);
//
//        // Create the label for the content
//        Label contentLabel = new Label("Content");
//        contentLabel.setStyle("-fx-font-size: 18px; -fx-text-fill: #333333;");
//
//        // Add the content label to the content box
//        contentBox.getChildren().add(contentLabel);
//
//        // Add additional content elements as desired
//
//        // Set the center border pane element to the content b
//        contentBox.getChildren().add(Quiter);
//        rootPane.setCenter(contentBox);
//        
//        // Set the scene and show the stage
//        Scene scene = new Scene(rootPane, 800, 600);
//        primaryStage.setTitle("Dashboard");
//        
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        
//       Quiter.setOnAction(new EventHandler<ActionEvent>() {
//	        public void handle(ActionEvent actionEvent) {
//	        	primaryStage.close();
//	        }
//	    });
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//}
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DashboardApp extends Application {
	private TableView<Person> table = new TableView<Person>();
	private Person personne;
	DAO_Etudiant ETU;
	
    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        
        VBox leftMenu = new VBox();
        leftMenu.setSpacing(0);
        leftMenu.setPadding(new Insets(0));
        
        Button homeButton = new Button("la liste des etudiants ");
        homeButton.setPadding(new Insets(20));
        homeButton.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
        Button dashboardButton = new Button("la liste des enseignants ");
        dashboardButton.setPadding(new Insets(20));
        dashboardButton.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
        Button reportsButton = new Button("Reports");
        reportsButton.setPadding(new Insets(20));
        reportsButton.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
        Button settingsButton = new Button("les Annonces");
        settingsButton.setPadding(new Insets(20));
        settingsButton.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
        Button statistiqueButton = new Button("statiques et avancement");
        statistiqueButton.setPadding(new Insets(20));
        statistiqueButton.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
        Button logoutButton = new Button("Quiter");
        logoutButton.setPadding(new Insets(20));
        logoutButton.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
        leftMenu.getChildren().addAll(homeButton, dashboardButton, reportsButton, settingsButton, logoutButton);
        leftMenu.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
        
//        HBox topMenu = new HBox();
//        topMenu.setSpacing(0);
//        topMenu.setPadding(new Insets(10));
//        
//        Button notificationsButton = new Button("Notifications");
//        Button profileButton = new Button("Profile");
//        Button helpButton = new Button("Help");
//        
//        topMenu.getChildren().addAll(notificationsButton, profileButton, helpButton);
        
        borderPane.setLeft(leftMenu);
//        borderPane.setTop(topMenu);
        
        Scene scene = new Scene(borderPane, 900, 500);
        
        primaryStage.setTitle("Dashboard Admin ");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        logoutButton.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent actionEvent) {
        	primaryStage.close();
        }
    });
        homeButton.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent actionEvent) {
        	ETU=new DAO_Etudiant(null);
        	try {
				ETU.getAllEtudiants();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    });
       
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    

    
}
