package TP1;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConcreteObserver extends Observer {
	String save ="";
	TextArea top = new TextArea();
	public ConcreteSubject cs;
	
	public ConcreteObserver(ConcreteSubject cs) {
		this.cs=cs;
	}
	public void start(Stage primaryStage) throws Exception {
		VBox vb = new VBox();
		
		TextField tf = new TextField();
		  tf.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
	 			public void handle(KeyEvent event) {
	 				if(event.getCode()==KeyCode.ENTER) {
	 					//cs.SetState(tf.getText());
	 					cs.NotifyObserver(tf.getText());
	 					tf.clear();
	 				}
	 			}
	 		});	
		
		vb.getChildren().addAll(top,tf);
		Scene sc = new Scene(vb,200,150);
		primaryStage.setTitle("AUDITEUR");
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	/*@Override
	public void Update() {
		save=save+ConcreteSubject.GetState()+"\n";
		top.setText(save);
		
	}*/
	
	public void Update(String o) {
		
		save = save+o+"\n";
		cs.subject=save;
		cs.ta.setText(cs.subject);
		top.setText(save);
	}
}
