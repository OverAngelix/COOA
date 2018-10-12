package TP1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioChat extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		new ConcreteSubject().start(primaryStage);
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
