package westga.edu.Lab01;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


/**
 * This class is the main method of the program
 * @author Kyron Joseph
 * @version 4/27/25
 */
public class Main extends Application {
	
	public static final String WINDOW_TITLE = "Kyron Joseph Shoppping Cart";
	public static final String GUI_RESOURCE = "view/codebehind/ShoppingCart.fxml";
	
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource(Main.GUI_RESOURCE));
		Scene scene = new Scene(parent);
		primaryStage.setTitle(WINDOW_TITLE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
    public static void main(String[] args) {
		Main.launch(args);   
    }
}