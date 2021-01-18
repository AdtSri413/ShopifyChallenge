package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			VBox root = (VBox)FXMLLoader.load(getClass().getResource("Fastener.fxml"));
	        Scene scene = new Scene(root, 1300, 1000);

	        scene.setRoot(root);

	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Order Some Fasteners");
	        primaryStage.setResizable(false);
	        primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
