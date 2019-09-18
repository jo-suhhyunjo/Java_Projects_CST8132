package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/*
 * Name: Hyunjo Suh
 * Student ID: 040885566
 * Course & Section: CST8132 313
 * Assignment: Lab 9
 * Date: April 18, 2018
 * Purpose: Performs bank program.
 */


/**
 * The purpose of this class is to run the BankFrame.fxml using the application for javafx
 * @author hyunjo Suh
 * @version 1.0
 * @since 1.8
 */
public class BankFrame extends Application {
	@Override
	public void start(Stage primaryStage){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("BankFrame.fxml"));
			Scene scene = new Scene(root,580,450);
			scene.getStylesheets().add(getClass().getResource("BankFrame.fxml").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Hyunjo's Banking System");
			primaryStage.show();
		} catch(Exception e) {
		    Alert alert = new Alert(AlertType.INFORMATION);
		    alert.setTitle("Information Dialog");
		    alert.setHeaderText(null);
		    alert.showAndWait();
			e.printStackTrace();
		}
	}
	
	/**
	 * This is the main method which runs the bank program.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
