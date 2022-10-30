package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {

	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	// @Override
	public void start(Stage stage) throws Exception {
		Image icon = new Image("sword.png");
		
		//Root node (requires import java.scene)
		Group root = new Group();
		
		//Attach root node to Scene
		Scene scene = new Scene(root,960,540,Color.PURPLE);
		
		
		stage.setTitle("Chess - Java ft. DJ JavaFX");
		stage.getIcons().add(icon);
		
		/*
		//  W/H functions and setResizable function
		
		stage.setWidth(960);
		stage.setHeight(540);
		stage.setResizable(false);
		
		//Set where application populates on screen
		stage.setX(0);
		stage.setY(0);
		

		//Set full screen and escape key + hint
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("To escape press 'X'");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("x"));
		
		*/
		
		//Set scene to stage
		stage.setScene(scene);
		stage.show();
		
	}
	
}
